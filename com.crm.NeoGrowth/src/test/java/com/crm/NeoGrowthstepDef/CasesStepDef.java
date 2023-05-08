package com.crm.NeoGrowthstepDef;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.CasesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CasesStepDef extends Driver {
	
	Driver dr = new Driver();
	
	SeleniumUtility su = new SeleniumUtility();
	CasesPage cp = new CasesPage(driver);
	
	  @When("^click on the cases module link$")
	    public void click_on_the_cases_module_link() {
		  cp.ClickCasesLink().click();
	       
	    }
	 
	  @Then("^View Cases Page Should be Display$")
	    public void view_cases_page_should_be_display() throws EncryptedDocumentException, IOException {
		  String Actual = dr.getexceldata("Titles", 3, 1);
		  String Expected = driver.getTitle();
		  Assert.assertEquals(Expected, Actual);	  
	        
	    }

	   @When("^User Click on Pencil Icon$")
	    public void user_click_on_pencil_icon()  {
		   cp.ClickPencilIcon().click();
		        
	    }

	   @When("Entering the value in TATDaysTF {string}")
	   public void entering_the_value_in_tat_days_tf(String Tatdaysvalue) {
		   cp.getTatDaysTF(Tatdaysvalue);
		   
	      
	   }
	    	
	    @And("^Click on Case Category dropdown and select(.+) option$")
	    public void click_on_case_category_dropdown_and_select_option(String Casecategory){
	    	cp.ClickCaseCategoryDropdown(Casecategory);
	        
	    }

	    @And("^Click on Case Sub Category dropdown and select(.+) option$")
	    public void click_on_case_sub_category_dropdown_and_select_option(String subcategory) {
	        cp.ClickCaseSubCategoryDropdown(subcategory);
	    }

	    @And("^Click on Case Details dropdown and select(.+) option$")
	    public void click_on_case_details_dropdown_and_select_option(String Casedetails) {
	    	cp.ClickCaseDetailsDropdown(Casedetails);
	        
	    }
	    
	    @Then("^User Scrolldown click SaveBtn$")
	    public void user_scrolldown_click_savebtn()  {
	    	cp.ClickSaveButton();
	    }
	    
	    @And("click master")
	    public void click_master() {
	    	
	    }
}

	    
	    


	    