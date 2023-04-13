package com.crm.NeoGrowthstepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.GenericUtilis.BaseClass;
import com.crm.GenericUtilis.Driver;
import com.crm.POM.LoginPagetest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass{
	 
	//WebDriver driver;
	@Given("Launch the browser and Enter URL")
	public void launch_the_browser_and_enter_url() {
		//openBrowser("firefox", "https://crm2_0uat.neogrowth.in");
		launchbrowser();
		System.out.println("Browser launch successfully");
	}

	@When("User enters Username and password and click on the Login Btn")
	public void user_enters_username_and_password_and_click_on_the_login_btn() {
//		driver.findElement(By.name("username")).sendKeys("Pavan.Joshi");
//		driver.findElement(By.name("password")).sendKeys("Haveri@1234");
//		driver.findElement(By.xpath("//button[@class='button']")).click();
		LoginPagetest lp= new LoginPagetest(driver);
		lp.loginpage();
		
		//closebrowser();
		
	}
      
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		
	}

}
