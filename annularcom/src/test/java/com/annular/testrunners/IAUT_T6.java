package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@happy", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/happyclients", "json:target/surefire-reports/json/happyclients.json"})

public class IAUT_T6 extends TestSuiteInitialization{

}

