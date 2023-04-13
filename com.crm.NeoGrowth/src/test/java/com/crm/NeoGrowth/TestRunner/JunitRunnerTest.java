package com.crm.NeoGrowth.TestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.crm.GenericUtilis.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        		features = "src/test/java/com/crm/NeoGrowth/AppFeature",
             
                glue = {"com.crm.NeoGrowthstepDef"},
        		plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        	
        		
       )
          
public class JunitRunnerTest extends BaseClass {
	//WebDriver driver;
	//@Before
	//public void launchbrowser() {
	//	openBrowser("chrome", "https://crm2_0uat.neogrowth.in");
	//}
	
	
	//@After
	//public void closebrowser()  {
		
	  //  driver.close();	
	//	
	//}
      
}
