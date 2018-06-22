package com.cucumber.runnerclass;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java_Programs\\CucumberTags\\CucumberTags\\src\\main\\java\\cucumber\\tagsdemo\\featurepackage\\TestFeatures", 
glue = "D:/Java_Programs/CucumberTags/CucumberTags/src/main/java/com/cucumber/tagsdemo/TagDemo.java", 
dryRun = true)

public class CucumberTagsRunnerClass {

	@Test
	public void tess()
	{
		
	}
}
