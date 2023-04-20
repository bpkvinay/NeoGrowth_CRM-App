package com.crm.NeoGrowthstepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.LoginPagetest;
import com.crm.POM.OpportunityPagetest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OppotunityStepDef extends Driver{
	
	SeleniumUtility sp=new SeleniumUtility();
	 OpportunityPagetest opp=new OpportunityPagetest(driver);
	
	@Given("login To the application")
	public void login_to_the_application() {
	   System.out.println("successfully Login"); 
	}
	
	@When("User enters Username and password and click on the Login Btn")
	public void user_enters_username_and_password_and_click_on_the_login_btn() throws IOException {
       LoginPagetest lp= new LoginPagetest(driver);
		lp.loginpage();
	}

	@When("Mouse move over all sticky menu")
	public void mouse_move_over_all_sticky_menu() {
	    sp.moveToElement(opp.getAllStickymenu());
	}

	@When("click on the opportunity module link")
	public void click_on_the_opportunity_module_link() throws InterruptedException {
		opp.getOppLink().click();
		Thread.sleep(2000);
	}

	@Then("opportunity Home page should be visible")
	public void opportunity_home_page_should_be_visible() {
		 System.out.println(driver.getTitle());
		 String ActualTitle ="Opportunities » NeoGrowth Credit Pvt.Ltd.";
	    Assert.assertEquals(driver.getTitle(),ActualTitle);
	
	}
	@Then("user scroll and click on remove button")
    public void user_scroll_and_click_on_remove_button() throws InterruptedException {
		Thread.sleep(3000);
        opp.scrollelement();
        Thread.sleep(3000);
    }
	

	    @When("user clicked on firstuser name link")
	    public void user_clicked_on_firstuser_name_link() throws InterruptedException {
	    	Thread.sleep(2000);
	       opp.Clickopplink();
	       Thread.sleep(2000);
	    }

	    @Then("user should lands to opportunity details page")
	    public void user_should_lands_to_opportunity_details_page() {
	        String ActualTitle = "Will Offshore Industrial Safety Services Organisat » Opportunities » NeoGrowth Credit Pvt.Ltd.";
	        Assert.assertEquals(driver.getTitle(),ActualTitle);
	    }

	    
}
