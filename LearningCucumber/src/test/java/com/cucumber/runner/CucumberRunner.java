package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/com/cucumber/features"},
		//package name of step definition<-- We have an attribute called glue
		glue = {"com.cucumber.stepDefinitions","com.cucumber.hook"},
		dryRun = false,
		monochrome = true,
		//report generation
		plugin = {"pretty",
				"html:reports/cucumberReport.html",
				"json:reports/JSONReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
/*
 * , tags = "@functionalScenario"
 */
		
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
