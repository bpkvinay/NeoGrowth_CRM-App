package com.crm.GenericUtilis;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;




public class BaseClass extends Driver {
    
	
	//protected WebDriver driver;
	
	@Before
	public void launchbrowser() {
		openBrowser("chrome", "https://crm2_0uat.neogrowth.in");
	}
	
	
	@After
	public void closebrowser()  {
		
	    driver.close();	
		
	}
	
	
	
	
	
	
	
	
	
	
}
