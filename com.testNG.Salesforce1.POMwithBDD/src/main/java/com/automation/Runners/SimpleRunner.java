package com.automation.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/main/resources/features/SalesforceBasic3.feature"},
		glue = {"com.automation.stepDefinitions"},
		dryRun = false,
				// tags = "@regression or @smoke"
				// "AND / and" used for all possible true conditions only
				// "OR / or" used for any possible condition
				plugin = {"pretty",
						"json:target/cucumber-reports/cucumber.json",
						"html:target/cucumber-reports/cucumberreport.html"
				} 

		)

public class SimpleRunner extends AbstractTestNGCucumberTests {

}
