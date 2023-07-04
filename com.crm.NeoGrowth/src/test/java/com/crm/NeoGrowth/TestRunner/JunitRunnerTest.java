package com.crm.NeoGrowth.TestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
           features = "src/test/java/com/crm/NeoGrowth/AppFeature",  
           glue = {"com.crm.NeoGrowthstepDef"},
           tags="@UIAPIEndtoEndScenarios",
           monochrome=true,
           plugin= {"pretty",
        				"html:target/cucumber.html",
        				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        	
        		
       )
          
public class JunitRunnerTest {
	
	
	}
      

