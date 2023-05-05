package com.crm.NeoGrowthstepDef;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.CasesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CasesStepDef extends Driver {
	
	SeleniumUtility su = new SeleniumUtility();
	CasesPage cp = new CasesPage(driver);
	
	  @When("^click on the cases module link$")
	    public void click_on_the_cases_module_link() {
		  cp.getCaseslink().click();
	       
	    }
	 
	  @Then("^View Cases Page Should be Display$")
	    public void view_cases_page_should_be_display() {
	        
	    }

	   @When("^User Click on Pencil Icon$")
	    public void user_click_on_pencil_icon()  {
		   cp.getPencilLink().click();
		   
	        
	    }

	   @When("Entering the value in TATDaysTF {string}")
	   public void entering_the_value_in_tat_days_tf(String Tatdaysvalue) {
		   cp.getTatDaysTF(Tatdaysvalue);
		   
	      
	   }
	    	
	    @And("^Click on Case Category dropdown and select(.+) option$")
	    public void click_on_case_category_dropdown_and_select_option(String Casecategory){
	    	cp.getCaseCategoryDropdown(Casecategory);
	        
	    }

	    @And("^Click on Case Sub Category dropdown and select(.+) option$")
	    public void click_on_case_sub_category_dropdown_and_select_option(String Casesubcategory) {
	        cp.getCaseSubCategoryDropdown(Casesubcategory);
	    }

	    @And("^Click on Case Details dropdown and select(.+) option$")
	    public void click_on_case_details_dropdown_and_select_option(String Casedetails) {
	    	cp.getCaseDetailsDropdown(Casedetails);
	        
	    }
	    
	    @Then("^User Scrolldown click SaveBtn$")
	    public void user_scrolldown_click_savebtn()  {
	    	cp.getSaveButton();
	      
	    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    


	    