package com.annular.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;

import com.codeborne.selenide.Condition;
import com.annular.pages.HomePage;
import com.annular.util.AppConstants;
import com.annular.util.AnnulartechDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnnularTechStepDefinitions {
	
	private AnnulartechDriver driver;
	private HomePage homePage;
	
		
	
	public AnnularTechStepDefinitions(AnnulartechDriver itautomatnDriver) {
		this.driver = itautomatnDriver;
		homePage = new HomePage(itautomatnDriver);	
	}
	
	@Then("User is in annulartechnology home page")
	public void isAnnularTechnologyHomePageDisplayed(){
		assertThat(homePage.annulartechLogo().isDisplayed());
		System.out.println("homePage is displayed");
	}
	
	@And("click contact in home page")
	public void clkContact(){
		homePage.contactUs().click();
		
	}
	
	@And("enter name {string}")
	public void enterContName(String name){
		homePage.cusName().sendKeys(AppConstants.contactList.valueOf(name).getContactList());
	}
	
	@And("enter email {string}")
	public void enterContEmail(String email){
		homePage.cusEmail().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@Then("it should display contact us page")
	public void contactUsPage(){
		assertTrue(homePage.contactUsPge().isDisplayed());
	}
	@And("enter message {string}")
	public void enterMsg(String msg){
		homePage.cusMessage().sendKeys(AppConstants.contactList.valueOf(msg).getContactList());
	}
	
	@And("enter phone number {string}")
	public void enterContPhonNo(String email){
		homePage.cusPhonno().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@And("enter subject {string}")
	public void enterContsubject(String email){
		homePage.cussubject().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@And("click submit")
	public void clickSubmit(){
		homePage.cusSubmitBtn().click();
	} 
	
	@And("click submit in home page")
	public void clickSubmithomepag(){
		
		homePage.cusSubmitBtnhomepage().click();
	}
	
	
	@Then("select about in home page")
	public void selecttababout() {
		homePage.aboutusAn().click();
		
	}
	@And("select get free quote in aboutus page")
	public void selectgetfree() {
		homePage.getfreequoteAn().click();
		
	}
	
	@And("select get free quote in home page")
	public void selectgetfreehomepage() {
		homePage.getfreequoteAn().click();
		
	}
	
	@Then("it should display about us page")
	public void aboutUsPage(){
		assertTrue(homePage.aboutUsPge().isDisplayed());
	}
	
	@Then("about us page should display total projects completed")
	public void projectsCompleted(){
		assertTrue(homePage.projectsCompleted().isDisplayed());
	}
	
	@Then("about us page should display happy clients")
	public void happyClients(){
		assertTrue(homePage.happyClients().isDisplayed());
	}
	
	@Then("about us page should year of excellence")
	public void awards(){
		assertTrue(homePage.awards().isDisplayed());
	
	}
	
	@Then("about us page should project executed")
	public void projectexecuted(){
		assertTrue(homePage.Proexecuted().isDisplayed());
	
	} 
	
	@Then("it should display home page")
	public void verifyHomepage(){
		assertTrue(homePage.verifyhomepage().isDisplayed());
	
	} 
	
	@Then("click website designing service in our service")
	public void clickwebsitedesign(){
		
		homePage.clickWebsite().click();
	}
	
	@Then("verify our services are displayed home page")
	public void verifyourservices(){
		assertTrue(homePage.ourServices().isDisplayed());
		
	}
	
	@Then("verify website desinging page dispalyed")
	public void verifwebsitedesign(){
		assertTrue(homePage.verifyWebsite().isDisplayed());
	
	}
	@Then("click analytic service in our service")
	public void clickanalytic(){
		//assertTrue(homePage.clickanalytic().isDisplayed());
		homePage.clickanalytic().click();
	
	}
	@Then("verify analytic page dispalyed")
	public void verifyanalyticpage(){
		assertTrue(homePage.verifyanalytic().isDisplayed());
	
	}
	@Then("click Testing service in our service")
	public void clickTesting(){
		//assertTrue(homePage.clickTesting().isDisplayed());
		homePage.clickTesting().click();
	
	}
	@Then("verify Testing page dispalyed")
	public void verifTestingPage(){
		assertTrue(homePage.verifyTesting().isDisplayed());
	
	}
	
	@Then("validate mandatory {string} displayed for name")
	public void nameisReqd(String text){
		assertEquals(homePage.nameValidation().getText(), AppConstants.expectedRsltList.valueOf(text).getExpectedRsltList());
	}
	
	@Then("validate mandatory {string} displayed for email")
	public void emailisReqd(String text){
		assertEquals(homePage.emailValidation().getText(), AppConstants.expectedRsltList.valueOf(text).getExpectedRsltList());
	}
	
	@Then("validate mandatory {string} displayed for message")
	public void messageisReqd(String text){
		assertEquals(homePage.messageValidation().getText(), AppConstants.expectedRsltList.valueOf(text).getExpectedRsltList());
	}
	
	@Then("validate who we are is shown in about us")
	public void whoWeAre(){
		homePage.whoAreWe().should(Condition.appears);
		homePage.whoAreWeMsg().should(Condition.appears);		
	}
	
	@Then("validate our mission is shown in about us")
	public void ourMission(){
		homePage.ourMission().shouldBe(Condition.visible);
		homePage.ourMissionMsg().shouldBe(Condition.visible);
	}
	
	@Then("validate what we do is shown in about us")
	public void whatWeDo(){
		assertTrue(homePage.whatWeDo().isDisplayed());
		assertTrue(homePage.whatWeDoMsg().isDisplayed());
	}
	
	@Then("the best quality work should show in why choose us")
	public void bestQualityWork(){
		assertTrue(homePage.bestQualityWorkDisplayed().isDisplayed());
	}
	
	@Then("the support after delivery should show in why choose us")
	public void supportAfterDelivery(){
		
		assertTrue(homePage.supportAfterDelivery().isDisplayed());
		
	}
		
	@Then("the result oriented approach should show in why choose us")
	public void resultOrientedApproach(){
		
		assertTrue(homePage.resultOrientedApproach().isDisplayed());
		
	}
	
	@Then("click recnet post in aboutus page")
	public void clickrecentpost(){
		
		
		homePage.clickRecntPost().click();
		
	}
	
	@Then("verify navigate to blog page")
	public void navigateBlog(){
		
		assertTrue(homePage.blogNavigate().isDisplayed());
		
		
	}
	
	@And("enter name {string} in leave comment")
	public void enterleaveName(String name){
		homePage.LeavName().sendKeys(AppConstants.contactList.valueOf(name).getContactList());
		
	}
	
	@And("enter email {string} in leave comment")
	public void enterLeavEmail(String email){
		homePage.LeavEmail().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@And("enter message {string} in leave comment")
	public void enterLeavMsg(String msg){
		homePage.LeavMessage().sendKeys(AppConstants.contactList.valueOf(msg).getContactList());
	}
	
	@And("click submit button in leavecomment")
	public void clicksumbitbutton(){
		homePage.clicksumbitLeav().click();
	}
	
	@And("verify comment is displayed")
	public void verifycomment(){
		
		assertTrue(homePage.verifyleavecomment().isDisplayed());
	}
	
	@Then("verify phone number dispalyed homepage")
	public void verifyphonenumber(){
		
		assertTrue(homePage.verifyPhoneNum().isDisplayed());
	}
	
	@Then("verify email dispalyed home page")
	public void verifyEmaiId(){
		
		assertTrue(homePage.verifyEmailid().isDisplayed());
	}
	@Then("click service page")
	public void clickservicepage(){
		
		homePage.clickServicepge().click();
	}
	@Then("click digital service Learn more")
	public void clickdigitalservice(){
		
		homePage.clickdigitalServicelink().click();
	}
	@Then("click analytic service Learn more")
	public void clickanalyticservice(){
		
		homePage.clickanalyticServicelink().click();
	}
	@Then("click testing service Learn more")
	public void clicktestingservice(){
		
		homePage.clicktestingServicelink().click();
	}
	
    @Then("verify use address displayed contact page")
	public void verifyusaadd(){
		assertTrue(homePage.verifyusaaddres().isDisplayed());
	}
    
	@And("verify india address displayed contact page")
	public void verifyIndiaadd(){
		assertTrue(homePage.verifyindaddres().isDisplayed());
		
	}
	
	@And("select blog in home page")
	public void Selectblog(){
		
		homePage.selectblogpg().click();
	}
	
	
	@And("click read more button")
	public void clickreadmore(){
		
		homePage.clickReadmore().click();
	}
	
	@And("enter mail id {string} in search box")
	public void entersearchmail(String msg){
		homePage.searchMail().sendKeys(AppConstants.contactList.valueOf(msg).getContactList());
	}
	
	@And("click search icon")
	public void clicksearchicon(){
		homePage.Clicksearchicon().click();
	}
	
	
	@And("verify project displayed in blog page")
	public void verifyProject(){
		
		assertTrue(homePage.verifyPrjectdisplay().isDisplayed());
	}
	
	
	@And("verify project not displayed in blog page")
	public void verifynotDisProject(){
		
		assertFalse(homePage.verifyPrjectdisplay().isDisplayed());
	}
	
}