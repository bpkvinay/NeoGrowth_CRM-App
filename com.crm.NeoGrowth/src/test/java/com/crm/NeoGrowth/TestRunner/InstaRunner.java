package com.crm.NeoGrowth.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        		features = "src/test/java/com/crm/NeoGrowth/AppFeature",           
                glue = {"com.crm.NeoGrowthstepDef"},
                tags="@insta",
            monochrome=true,          
        		plugin= {"pretty",
        				"html:target/cucumber.html",
      				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}	
       )

public class InstaRunner {

}
