package com.crm.NeoGrowthstepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.BaseClass;
import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.OpportunityPagetest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OppotunityStepDef extends BaseClass{
	
	 // Driver driver;
	//WebDriver driver;
	
	SeleniumUtility sp=new SeleniumUtility();
	 OpportunityPagetest opp=new OpportunityPagetest(driver);
	
	@Given("login To the application")
	public void login_to_the_application() {
	   System.out.println("successfully Login"); 
	}

	@When("Mouse move over all sticky menu")
	public void mouse_move_over_all_sticky_menu() {
	    sp.moveToElement(opp.getAllStickymenu());
	}

	@When("click on the opportunity module link")
	public void click_on_the_opportunity_module_link() {
	  // driver.findElement(By.xpath("(//a[text()='Opportunities'])[2]")).click();
		opp.getOppLink().click();
		System.out.println("opp link clicked");
	}

	@Then("opportunity Home page should be visible")
	public void opportunity_home_page_should_be_visible() {
	    
	}


}
