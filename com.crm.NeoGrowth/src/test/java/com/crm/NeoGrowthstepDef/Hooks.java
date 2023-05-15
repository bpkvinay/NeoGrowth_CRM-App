package com.crm.NeoGrowthstepDef;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.LoginPagetest;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
 

public class Hooks extends Driver {
     
	Driver dri= new Driver();
	LoginPagetest Lp=new LoginPagetest(driver);
	@Before
	public void StartBrowser() throws IOException {
		String br = dri.readConfig("browser");
		   String qaurl = dri.readConfig("URL");
		openBrowser(br,qaurl );
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	}
	
	@After
	public void AfterScenario() {
		//Lp.Logout();
		driver.quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
			
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent,"image/png", "image");
		}
	}
}
