package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@chooseus", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/whychooseus", "json:target/surefire-reports/json/whychooseus.json"})

public class TC_530 extends TestSuiteInitialization{

}

