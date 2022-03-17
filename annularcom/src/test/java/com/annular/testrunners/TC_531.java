package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@homecontact", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/homecontact", "json:target/surefire-reports/json/homecontact.json"})

public class TC_531 extends TestSuiteInitialization{

}

