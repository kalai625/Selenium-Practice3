package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@phoneEmail", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty", "com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/phoneEmail", "json:target/surefire-reports/json/phoneEmail.json" })

public class IAUT_T2 extends TestSuiteInitialization{

}

