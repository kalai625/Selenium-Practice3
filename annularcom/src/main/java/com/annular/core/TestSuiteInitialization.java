package com.annular.core;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.ClientProtocolException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.annular.util.TestResultManager;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

public class TestSuiteInitialization extends AbstractTestNGCucumberTests {

	public SessionObject ssObj;
	public static ThreadLocal<String[]> browserDetails;
	public static ThreadLocal<List<String>> jp = new ThreadLocal<List<String>>();
	public static Path screenshotPath;
	public TestResultManager testResultManager;
	public static ThreadLocal<String> tcName;
	public static String className = null;
	public static ThreadLocal<File> screenshotName;

	String htmlPath = new File("./target/surefire-reports/html").getAbsolutePath();
	File file2 = new File(htmlPath);

	String outputPath = new File("./target/surefire-reports/json").getAbsolutePath();
	File file = new File(outputPath);

	String reportPath = new File("./target/ApiReport").getAbsolutePath();
	File file1 = new File(reportPath);

	protected TestNGCucumberRunner testNGCucumberRunner;

	@BeforeSuite
	public void setUp() {
		try {
			// FileUtils.deleteDirectory(file);
			FileUtils.deleteDirectory(file1);
		} catch (Exception e) {

		}
		initializeObject();

	}

	@Parameters({ "browserName", "browserVersion", "isRemoteEnabled" })
	@BeforeClass
	public void setUp(String browserName, String browserVersion, String isRemoteEnabled) {
		browserDetails.set(new String[] { browserName, browserVersion, isRemoteEnabled });
	}

	@BeforeMethod
	public void beforemethod() {
		testResultManager = new TestResultManager(SessionObject.getTestCycleID(),
				SessionObject.getTestManagaementTool());
		String className = this.getClass().getSimpleName();
		tcName.set(className.replace("TC_", ""));
		className = this.getClass().getSimpleName();
	}

	/**
	 * This method is executed after each and every test case.
	 * 
	 * @param testResult - This get the result status from testNG (pass or Fail)
	 * @throws UnsupportedOperationException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@AfterMethod()
	public void tearDown(ITestResult testResult) throws Exception {
		String resultStatus = (testResult.isSuccess()) ? "Pass" : "Fail";
		System.out.println("Feature Name" + testResult.getParameters()[0]);
		System.out.println("Result ==> " + resultStatus);
		System.out.println(browserDetails.get()[0]);

		/**
		 * JIRA integration. Calling TestResultManager methods to update status.
		 */

		String comment = (resultStatus.equals("Pass"))
				? TestResultManager.testResultCommonMessage + "Browser under Test: " + browserDetails.get()[0]
						+ ". Browser version : " + browserDetails.get()[1]
				: "Testcase Failed. Browser under Test: " + browserDetails.get()[0] + ". Browser version: "
						+ browserDetails.get()[1];

		String testComment = "";
		String stackTrace = "";
		String traceLogs = "";

		if (testResult.getThrowable() != null) {
			testComment = testResult.getThrowable().getLocalizedMessage();
			StackTraceElement[] traceErr = testResult.getThrowable().getStackTrace();
			for (StackTraceElement trace : traceErr) {
				stackTrace = stackTrace + "\n" + trace.toString();
			}
			traceLogs = traceErr[traceErr.length - 1].toString() + "\n" + testComment + stackTrace;

		}

		testResultManager.setTestcaseID(tcName.get());
		testResultManager.setStatus(resultStatus);
		testResultManager.setActualResultComment(testComment, testResult.getEndMillis() - testResult.getStartMillis());
		testResultManager.setComment(comment);
		testResultManager.updateTestResult(className, resultStatus, traceLogs);

	}

	/**
	 * This method is used for Initializing browser instances, Loading configuration
	 * files, Creating Screenshot path
	 */
	public void initializeObject() {
		ssObj = new SessionObject();
		ssObj.loadConfig();
		browserDetails = new ThreadLocal<String[]>();
		tcName = new ThreadLocal<String>();
		screenshotName = new ThreadLocal<File>();
		String fileDirName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss"));
		try {
			screenshotPath = Files.createDirectories(Paths.get("screenshot")).resolve(fileDirName).toAbsolutePath();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
