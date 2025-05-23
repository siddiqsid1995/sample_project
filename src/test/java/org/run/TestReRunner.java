package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\FailedScenarios\\rerun.txt", glue = "org.step", 
snippets = SnippetType.CAMELCASE, dryRun = false,
plugin = {"html:target",
         "json:target\\reports\\fb.json",
         "junit:target\\reports\\myfbreport.xml"})

public class TestReRunner {

}
