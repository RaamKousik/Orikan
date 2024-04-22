package org.runner.classes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", 
				 glue="org.stepdefinition", 
				 monochrome=true,
				 dryRun=false,
				 plugin= {"html:target", "junit:target\\junitrepo\\jurepo.xml"})
public class TestRunnerClass {

}
