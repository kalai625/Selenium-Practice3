package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@ai", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty", "com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/ai", "json:target/surefire-reports/json/ai.json" })

public class IAUT_T1 extends TestSuiteInitialization{

}

