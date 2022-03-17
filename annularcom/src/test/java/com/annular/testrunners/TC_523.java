package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@crsubmit", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/crsubmit", "json:target/surefire-reports/json/crsubmit.json" })

public class TC_523 extends TestSuiteInitialization{

}

