package com.annular.pages;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;
import com.annular.util.AnnulartechDriver;

public class HomePage {

	private static final String home_Page = "(//span[(text()='Home')])[1]";
	private static final String phone_no = "//span[@class='swm_cf_call swm-cf-title swm-heading-text']";
	private static final String Email_id = "//span[@class='swm_cf_email swm-cf-title swm-heading-text']";
	private static final String AnnularTech_Logo = "//img[@class='swm-std-logo']";
	private static final String contact = "(//span[(text()='Contacts')])[1]";
	private static final String Blog_page = "(//span[text()='Blog'])[3]";
	private static final String recent_Post = "//a[text()='Blind Spot Automation – When ']";
	private static final String contactus_Name = "//input[@name='your-name']";
	private static final String contactus_Email = "//input[@name='your-email']";
	private static final String contactus_Message = "//textarea[@name='your-message']";
	private static final String contactus_Phoneno = "//input[@name='your-phone']";
	private static final String contactus_Subject = "//input[@name='your-subject']";
	private static final String contactus_SubmitBtn = "//input[@class='wpcf7-form-control wpcf7-submit']";
	private static final String getfree_button = "(//span[contains(text(),'Get Free Quote')])[1]";
	private static final String contactus_SuccessMsg = "//p[text()='Thanks for contacting us! We will be in touch with you shortly.']";
	private static final String annular_Services = "(//span[text()='Our Services'])[2]";
	private static final String OurservicesWebsite = "(//a[text()='Website Designing'])[2]";
	private static final String OurservicesAnalytic = "(//a[text()='Analytics & Analysis'])[2]";
	private static final String OurservicesTesting = "(//a[text()='Testing As a Service'])[2]";
	private static final String websitePage = "(//span[text()='Website Designing'])[1]";
	private static final String analyticPage = "(//span[text()='Analytics & Analysis'])[1]";
	private static final String testingPage = "(//span[text()='Testing As a Service'])[1]";
	private static final String comment_Name = "//input[@placeholder='Full Name *']";
	private static final String comment_email = "//input[@id='email']";
	private static final String comment_message = "//textarea[@placeholder='Write Comment']";
	private static final String comment_submit = "//input[@id='submit']";
	private static final String verify_comment = "//span[@class='comment-author swm-heading-text']";
	private static final String aboutus_Page = "//span[(text()='About Us')]";
	private static final String aboutUs = "//span[text()='About Us'][1]";
	private static final String supportAfterDelivery = "//span[text()='Competitor research']";
	private static final String bestQualityWorkMsg = "//span[text()='Creative development']";
	private static final String resultOrientedApproach = "//span[text()='Optimize operations']";
	private static final String yearofExcellence = "(//h4[contains(text(),'5+')])";
	private static final String happyClients = "(//h4[contains(text(),'100+')])[1]";
	private static final String projectsCompleted = "(//h4[contains(text(),'100+')])[2]";
	private static final String projectsExecuted = "(//h4[contains(text(),'250+')])";
	private static final String whoAreWe = "//span[text()='About Our Company']";
	private static final String ourMission = "//h2[text()='Our Mission']";
	private static final String WhatWeDo = "//h2[text()='Our Vision']";
	private static final String whoAreWeMsg = "//div[@class='gyan-title-desc']";
	private static final String ourMissionMsg = "(//div[@class='elementor-text-editor elementor-clearfix'])[2]";
	private static final String whatWeDoMsg = "(//div[@class='elementor-text-editor elementor-clearfix'])[1]";
	private static final String contactus_NameValidatn = "(//span[text()='The field is required.'])[2]";
	private static final String contactus_EmailValidatn = "(//span[text()='The field is required.'])[2]";
	private static final String contactus_MessageValidatn = "(//span[text()='The field is required.'])[1]";
	private static final String contactUsPage = "//span[(text()='Contacts')]";
	private static final String digital_Learnmore = "(//a[@class='gyan-service-full-link gyan-services-full-button gyan-ease-transition gyan-flex'])[1]";
	private static final String analytic_Learnmore = "(//a[@class='gyan-service-full-link gyan-services-full-button gyan-ease-transition gyan-flex'])[2]";
	private static final String testing_Learnmore = "(//a[@class='gyan-service-full-link gyan-services-full-button gyan-ease-transition gyan-flex'])[3]";
	private static final String Service_Page = "(//span[(text()='Services')])[1]";
	private static final String usa_address = "(//h2[@class='elementor-heading-title elementor-size-default'])[1]";
	private static final String india_address = "(//h2[@class='elementor-heading-title elementor-size-default'])[2]";
	private static final String blog_Tab = "(//span[(text()='Blog')])[1]";
	private static final String readmore_button = "(//a[contains(text(),'Read More')])[1]";
	private static final String search_box = "//input[@class='swm-search-form-input']";
	private static final String search_icon = "//i[@class='fas fa-search']";
	private static final String project_dispaly = "//div[@class='swm-search-page-text']";

	public AnnulartechDriver driver;

	public HomePage(AnnulartechDriver driver) {
		this.driver = driver;
	}

	public SelenideElement annulartechLogo() {
		return this.driver.waitForXpathElementToAppear(AnnularTech_Logo);
	}

	public SelenideElement contactUs() {
		return this.driver.getXpathElement(contact);
	}

	public SelenideElement cusName() {
		return this.driver.getXpathElement(contactus_Name);
	}

	public SelenideElement cusMessage() {

		return this.driver.getXpathElement(contactus_Message);
	}

	public SelenideElement cusEmail() {
		return this.driver.getXpathElement(contactus_Email);
	}

	public SelenideElement clicksumbitLeav() {
		return this.driver.getXpathElement(comment_submit);
	}

	public SelenideElement verifyleavecomment() {
		driver.waitUntilTripLoads();
		return this.driver.getXpathElement(verify_comment);
	}

	public SelenideElement cusPhonno() {
		return this.driver.getXpathElement(contactus_Phoneno);
	}

	public SelenideElement cussubject() {
		return this.driver.getXpathElement(contactus_Subject);
	}

	public SelenideElement LeavName() {
		return this.driver.getXpathElement(comment_Name);
	}

	public SelenideElement LeavEmail() {
		return this.driver.getXpathElement(comment_email);
	}

	public SelenideElement LeavMessage() {
		return this.driver.getXpathElement(comment_message);
	}

	public SelenideElement isGoogleSearchLoaded() {
		// TODO Auto-generated method stub
		return null;
	}

	public SelenideElement contactUsPge() {
		return this.driver.getXpathElement(contactUsPage);
	}

	public SelenideElement aboutUsPge() {
		return this.driver.getXpathElement(aboutus_Page);
	}

	public SelenideElement cusSubmitBtn() {
		return this.driver.getXpathElement(contactus_SubmitBtn);
	}

	public SelenideElement cusSubmitBtnhomepage() {
		
		return this.driver.getXpathElement(contactus_SubmitBtn);
	}

	public SelenideElement nameValidation() {
		driver.waitUntilTripLoads();
		return this.driver.getXpathElement(contactus_NameValidatn);
	}

	public SelenideElement emailValidation() {
		driver.waitUntilTripLoads();
		return this.driver.getXpathElement(contactus_EmailValidatn);
	}

	public SelenideElement messageValidation() {

		return this.driver.getXpathElement(contactus_MessageValidatn);
	}

	public SelenideElement aboutusAn() {
		return this.driver.getXpathElement(aboutUs);
	}

	public SelenideElement getfreequoteAn() {
		// driver.scrollToXpathElementToAppear(getfree_button);
		return this.driver.getXpathElement(getfree_button);
	}

	public SelenideElement projectsCompleted() {

		return this.driver.getXpathElement(projectsCompleted);
	}

	public SelenideElement happyClients() {

		return this.driver.getXpathElement(happyClients);
	}

	public SelenideElement awards() {

		return this.driver.getXpathElement(yearofExcellence);

	}

	public SelenideElement Proexecuted() {

		return this.driver.getXpathElement(projectsExecuted);

	}

	public SelenideElement verifyhomepage() {

		return this.driver.getXpathElement(home_Page);

	}

	public SelenideElement clickWebsite() {

		return this.driver.getXpathElement(OurservicesWebsite);

	}

	public SelenideElement verifyWebsite() {

		return this.driver.getXpathElement(websitePage);

	}

	public SelenideElement clickanalytic() {

		return this.driver.getXpathElement(OurservicesAnalytic);

	}

	public SelenideElement verifyanalytic() {

		return this.driver.getXpathElement(analyticPage);

	}

	public SelenideElement clickTesting() {

		return this.driver.getXpathElement(OurservicesTesting);

	}

	public SelenideElement verifyTesting() {

		return this.driver.getXpathElement(testingPage);

	}

	public SelenideElement ourServices() {

		return this.driver.getXpathElement(annular_Services);

	}

	public SelenideElement whoAreWe() {

		return this.driver.getXpathElement(whoAreWe);
	}

	public SelenideElement whoAreWeMsg() {

		return this.driver.getXpathElement(whoAreWeMsg);
	}

	public SelenideElement ourMission() {

		return this.driver.getXpathElement(ourMission);
	}

	public SelenideElement ourMissionMsg() {

		return this.driver.getXpathElement(ourMissionMsg);
	}

	public SelenideElement whatWeDo() {

		return this.driver.getXpathElement(WhatWeDo);
	}

	public SelenideElement whatWeDoMsg() {

		return this.driver.getXpathElement(whatWeDoMsg);
	}

	public SelenideElement bestQualityWorkDisplayed() {

		return this.driver.getXpathElement(bestQualityWorkMsg);
	}

	public SelenideElement supportAfterDelivery() {
		return this.driver.getXpathElement(supportAfterDelivery);
	}

	public SelenideElement resultOrientedApproach() {
		return this.driver.getXpathElement(resultOrientedApproach);
	}

	public SelenideElement clickRecntPost() {
		return this.driver.getXpathElement(recent_Post);
	}

	public SelenideElement blogNavigate() {
		return this.driver.getXpathElement(Blog_page);
	}

	public SelenideElement verifyPhoneNum() {
		return this.driver.getXpathElement(phone_no);
	}

	public SelenideElement verifyEmailid() {
		return this.driver.getXpathElement(Email_id);
	}

	public SelenideElement clickServicepge() {
		return this.driver.getXpathElement(Service_Page);
	}

	public SelenideElement clickdigitalServicelink() {
		return this.driver.getXpathElement(digital_Learnmore);
	}

	public SelenideElement clickanalyticServicelink() {
		return this.driver.getXpathElement(analytic_Learnmore);
	}

	public SelenideElement clicktestingServicelink() {
		return this.driver.getXpathElement(testing_Learnmore);
	}

	public SelenideElement verifyusaaddres() {
		return this.driver.getXpathElement(usa_address);
	}

	public SelenideElement verifyindaddres() {
		return this.driver.getXpathElement(india_address);
	}

	public SelenideElement selectblogpg() {
		return this.driver.getXpathElement(blog_Tab);
	}

	public SelenideElement clickReadmore() {
		//driver.scrollToXpathElementToAppear(readmore_button);
		return this.driver.getXpathElement(readmore_button);
	}

	public SelenideElement searchMail() {
		return this.driver.getXpathElement(search_box);
	}

	public SelenideElement Clicksearchicon() {
		return this.driver.getXpathElement(search_icon);
	}

	public SelenideElement verifyPrjectdisplay() {
		return this.driver.getXpathElement(project_dispaly);
	}

}