package com.annular.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import com.annular.core.SessionObject;
import com.annular.core.TestSuiteInitialization;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AnnulartechDriver {
	public SelenideDriver driver;
	public Map<String, Object> data;
	private static final long DEFAULT_TIMEOUT = SessionObject.getMaxSync();
	private static final long MIN_TIMEOUT = SessionObject.getMinSync();
	private static final long DEFAULT_POLLING_TIMOUT = SessionObject.getPollingTimeOut();

	public static String fileName = null;

	public AnnulartechDriver() {

	}

	public SelenideConfig getSelenideConfig(Scenario scenario) {

		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		options.setExperimentalOption("prefs", prefs);
		prefs.put("profile.default_content_setting_values.notifications", 2);
		options.addArguments("--disable-default-apps");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		String testcaseId = scenario.getId().split("/", 3)[2].split("\\.")[0];
		System.out.println("test case id is " + testcaseId);
		SelenideConfig selenideConfig = new SelenideConfig();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--window-size=768x1024");

		/**
		 * Setting up selenide configurations.
		 */

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		selenideConfig.browserCapabilities().setCapability(ChromeOptions.CAPABILITY, options);
		selenideConfig.browserCapabilities().setAcceptInsecureCerts(true);
		selenideConfig.browserCapabilities().setCapability("ENSURING_CLEAN_SESSION", true);
		selenideConfig.browserCapabilities().setBrowserName(TestSuiteInitialization.browserDetails.get()[0]);
		selenideConfig.browser(TestSuiteInitialization.browserDetails.get()[0]);
		selenideConfig.browserVersion(TestSuiteInitialization.browserDetails.get()[1]);
		selenideConfig.startMaximized(true);
		selenideConfig.fastSetValue(true);
		selenideConfig.timeout(SessionObject.getMinSync());
		selenideConfig.pollingInterval(DEFAULT_POLLING_TIMOUT);
		selenideConfig.screenshots(false);
		selenideConfig.savePageSource(false);
		selenideConfig.baseUrl(SessionObject.getProductURL());
		if (TestSuiteInitialization.browserDetails.get()[2].equalsIgnoreCase("true")) {
			selenideConfig.browserCapabilities().setCapability("enableVNC", true);
			selenideConfig.browserCapabilities().setCapability("enableVideo", false);
			selenideConfig.browserCapabilities().setCapability("name", "TestCase Id: " + testcaseId);
			selenideConfig.remote("http://localhost:4444/wd/hub");
			// selenideConfig.remote("http://10.0.102.191:4444/wd/hub");
		}
		return selenideConfig;
	}

	/**
	 * This is hooks concept in cucumber. executed before every feature.
	 * 
	 * @param scenario
	 */
	@Before
	public void setUpBrowser(Scenario scenario) {

		int length = 10;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		data = new HashMap<String, Object>();
		String testcaseId = scenario.getId().split("/")[scenario.getId().split("/").length - 1].split("\\.")[0];
		data.put("generatedString", generatedString);
		data.put("testcaseid", testcaseId);
		this.driver = new SelenideDriver(getSelenideConfig(scenario));
		this.driver.open("");
	}

	/**
	 * This is hooks concept in cucumber. executed after every feature. This will
	 * make sure to get screenshots and store it in specified path
	 * 
	 * @param scenario
	 */
	@After
	public void tearDown(Scenario scenario) throws Exception {

		if (scenario.isFailed()) {
			fileName = /* "\\target\\surefire-reports\\"+ */TestSuiteInitialization.screenshotPath + "\\"
					+ data.get("testcaseid").toString() + ".png";

			File scrFile = ((TakesScreenshot) driver.getWebDriver()).getScreenshotAs(OutputType.FILE);
			System.out.println("Screenshot for local :" + scrFile);
			FileUtils.copyFile(scrFile, new File(fileName));

			File scrFile1 = ((TakesScreenshot) driver.getWebDriver()).getScreenshotAs(OutputType.FILE);
			byte[] bArray = readFileToByteArray(scrFile);
			scenario.embed(bArray, "image/png");

			/*
			 * Test Rail configuration
			 */

			System.out.println("Test Fail ==> " + scenario.getSourceTagNames().toArray()[0].toString());
		} else {
			System.out.println("Test Pass ==> "
					+ scenario.getSourceTagNames().toArray()[0].toString().replace("@TestCaseKey=", ""));
		}

		driver.close();
	}

	/**
	 * This returns selenide element for any operations.
	 * 
	 * @param element - element to be identified and returned.
	 * @return
	 */
	public SelenideElement getElement(SelenideElement element) {

		int maxValue = SessionObject.getMinSync() / 1000;
		for (int i = 0; i < maxValue; i++) {
			try {
				boolean elementCondition = driver
						.$(driver.Wait().until(ExpectedConditions.visibilityOfAllElements(element.getWrappedElement()))
								.get(0))
						.exists()
						&& driver
								.$(driver.Wait()
										.until(ExpectedConditions.elementToBeClickable(element.getWrappedElement())))
								.exists();

				if (elementCondition) {
					driver.executeJavaScript("arguments[0].style.border='3px solid green'", element);
					return element;
				} else {
				}
			} catch (Throwable e) {
			}
			sleep(1);
		}
		System.out.println("element: " + element);
		return element;
	}

	/**
	 * Used to get text from an particular element. Returns String value of text
	 * present in element.
	 * 
	 * @param element - element whose text needs to be returned.
	 * @return
	 */
	public String waitForGetText(SelenideElement element) {
		int i = 0;
		while (i < 10) {
			String value = element.getText();
			if (!value.isEmpty()) {
				return value;
			} else {
				sleep(1);

				i++;
			}
		}
		return element.getText();
	}

	/**
	 * Verifies whether element exists. and returns boolean value
	 * 
	 * @param element
	 * @return
	 */
	public boolean elementExists(SelenideElement element) {
		boolean value = element.exists();
		return value;

	}

	/**
	 * Returns boolean value after waiting for element to be exists.
	 * 
	 * @param element
	 * @return
	 */
	public boolean waitForElementExist(SelenideElement element) {
		int i = 0;
		while (i < 10) {
			boolean value = element.exists();
			if (!value)
				return value;
			else {
				sleep(1);
				i++;
			}
		}
		return element.exists();
	}

	private static byte[] readFileToByteArray(File file) {
		FileInputStream fis = null;
		// Creating a byte array using the length of the file
		// file.length returns long which is cast to int
		byte[] bArray = new byte[(int) file.length()];
		try {
			fis = new FileInputStream(file);
			fis.read(bArray);
			fis.close();
		} catch (IOException ioExp) {
			ioExp.printStackTrace();
		}
		return bArray;
	}

	/**
	 * Used to verify whether alert is present or not.
	 * 
	 * @param driver           - selenide driver instance
	 * @param timeoutInSeconds - max time to wait for alert to be present.
	 * @return
	 */
	public boolean isAlert(SelenideDriver driver, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait((WebDriver) driver.getWebDriver(), timeoutInSeconds * 1000);
		if (!(wait.until(ExpectedConditions.alertIsPresent()) == null))
			return true;
		return false;
	}

	/**
	 * This method is a wrapper Thread.sleep function
	 * 
	 * @param roleName
	 */
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Clicks on element using javaScript function in
	 * 
	 * @param element - element to be clicked.
	 */
	public void clickByJavaScript(SelenideElement element) {
		element.waitUntil(Condition.appear, SessionObject.getMaxSync());
		driver.executeJavaScript("arguments[0].click();", element.getWrappedElement());
	}

	public SelenideElement getXpathElement(String xpath) {
		return getElement(driver.$x(xpath));
	}

	public void waitUntilTripLoads() {
		;
		sleep(10);
	}

	public SelenideElement waitForXpathElementToAppear(String xpath) {
		return getXpathElement(xpath).waitUntil(Condition.appear, DEFAULT_TIMEOUT, DEFAULT_POLLING_TIMOUT);
	}

	public SelenideElement waitForTestIdElementToAppear(String testID) {
		return getXpathElement(testID).waitUntil(Condition.appear, DEFAULT_TIMEOUT, DEFAULT_POLLING_TIMOUT);
	}

	public SelenideElement scrollToXpathElementToAppear(String xpath) {
		return getElement(driver.$x(xpath)).scrollIntoView(true);
	}

	public SelenideElement getTextElement(String text) {
		return getElement(driver
				.$x("//ws-ny-favorittmappe/div/mat-toolbar/button[2]/span[normalize-space(text()) = '" + text + "']"));
	}
}