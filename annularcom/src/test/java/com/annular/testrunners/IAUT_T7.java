package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@mission", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty", "com.epam.reportportal.cucumber.ScenarioReporter","html:target/surefire-reports/html/misssion", "json:target/surefire-reports/json/misssion.json"})

public class IAUT_T7 extends TestSuiteInitialization{

}

