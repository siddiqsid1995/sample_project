package org.run;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.step", 
snippets = SnippetType.CAMELCASE, dryRun = false,
plugin = {"html:target",
         "json:target\\reports\\fb.json",
         "junit:target\\reports\\myfbreport.xml",
         "rerun:src\\test\\resources\\FailedScenarios\\rerun.txt"})
public class TestRunner {

	@AfterClass
	public static void afterallScenario() {

		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\fb.json");
		
	}
	
}
