package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@Blogsrh", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/Blogsrh", "json:target/surefire-reports/json/Blogsrh.json"})

public class TC_535 extends TestSuiteInitialization{

}

