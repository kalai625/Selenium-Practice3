package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@Blognotdis", glue = "com.annular", monochrome = true, strict = true, plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/Blognotdis", "json:target/surefire-reports/json/Blognotdis.json"})

public class TC_536 extends TestSuiteInitialization{

}

