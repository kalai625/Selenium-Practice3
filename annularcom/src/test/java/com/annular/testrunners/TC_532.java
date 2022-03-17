package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@homeconval", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/homeconval", "json:target/surefire-reports/json/homeconval.json"})

public class TC_532 extends TestSuiteInitialization{

}

