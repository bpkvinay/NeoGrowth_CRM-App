package com.crm.NeoGrowthstepDef;

import java.io.IOException;

import javax.xml.xpath.XPath;

import org.apache.poi.EncryptedDocumentException;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.CasesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class CasesStepDef extends Driver{
	
	
Driver dr = new Driver();
	
	SeleniumUtility su = new SeleniumUtility();
	CasesPage cp = new CasesPage(driver);
	
	  @When("^click on the cases module link$")
	    public void click_on_the_cases_module_link() {
		  cp.ClickCasesLink().click();
	       
	    }
	 
	  @Then("^View Cases Page Should be Display$")
	    public void view_cases_page_should_be_display() throws EncryptedDocumentException, IOException {
		  String Actual = dr.getexceldata("Titles", 5, 1);
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
	    
	  ////////////////////////////////////////////////////////
	    ///////////////////////////////////////////
	    
	    @When("^Click on CasesModule Link$")
	    public void click_on_casesmodule_link() {
	    	cp.clickCasesModuleLink().click();
	        
	    }
	   
	    @When("^Click on the Filter Icon$")
	    public void click_on_the_filter_icon() throws InterruptedException  {
	    	cp.clickFilterIcon().click();
	    	Thread.sleep(2000);
	        
	    }

	    @Then("^Advance Filter Tab Should be Display$")
	    public void advance_filter_tab_should_be_display() throws EncryptedDocumentException, IOException {
	    	String Actual = dr.getexceldata("Titles", 6, 1);
	    	String Expected = driver.getTitle();
	    	Assert.assertEquals(Expected, Actual);
	    	 
	    }
	    
	    @And("^Click on the AdvanceFilter button$")
	    public void click_on_the_advancefilter_button(){
	        cp.clickAdvanceFilterBtn().click();
	    }
	   
	    @And("^Enter the Value in NumberTF (.+)$")
	    public void enter_the_value_in_numbertf(String Number) throws InterruptedException  {
	    	cp.enterNumberTF(Number);
	    	Thread.sleep(2000);
	        
	    }

	    @And("^Enter the value in SubjectTF (.+)$")
	    public void enter_the_value_in_subjecttf(String Subject) {
	    	cp.enterSubjectTF(Subject);
	        
	    }
	    
	    @And("^Select the value from Statusbox (.+)$")
	    public void select_the_value_from_statusbox(String status) {
	        cp.selectStatusBox(status);
	    }
	    
	    @And("^Select the value from AssignedtoBox (.+)$")
	    public void select_the_value_from_assignedtobox(String assignedto) throws InterruptedException {
	    	cp.selectAssignedtoBox(assignedto);
	    	Thread.sleep(2000);
	       
	    }

	    @And("^User Scrolldown and Enter the value in CaseownerTF (.+)$")
	    public void user_scrolldown_and_enter_the_value_in_caseownertf(String Caseowner) throws InterruptedException  {
	    	cp.enterCaseownerTF(Caseowner);
	    	Thread.sleep(2000);
	        
	    }

	    @And("^Select the value in PriorityBox (.+)$")
	    public void select_the_value_in_prioritybox(String priority) throws InterruptedException {
	    	cp.selectPriorityBox(priority);
	    	Thread.sleep(3000);
	        
	    }

	    @And("^Enter the value in AppidTF (.+)$")
	    public void enter_the_value_in_appidtf(String Appid) {
	    	cp.enterAppidTF(Appid);
	        
	    }

	    @And("^Enter the  value in NameTF (.+)$")
	    public void enter_the_value_in_nametf(String Name) {
	    	cp.enterNameTF(Name);
	       
	    }

	    @And("^Enter the value in EmailidTF (.+)$")
	    public void enter_the_value_in_emailidtf(String Emailid) {
	    	cp.enterEmailidTF(Emailid);
	        
	    }

	    @And("^Enter the value in ContactTF (.+)$")
	    public void enter_the_value_in_contacttf(String Contact) {
	    	cp.enterContactnumberTF(Contact);
	       
	    }

	    @And("^Enter the value in LocationTF (.+)$")
	    public void enter_the_value_in_locationtf(String location) {
	    	cp.selectLocationBox(location);
	        
	    }

	    @And("^User Scrolldown and Select the value in TypeBox (.+)$")
	    public void user_scrolldown_and_select_the_value_in_typebox(String Type){
	    	cp.selectTypeBox(Type);
	        
	    }

	    @And("^User Scrolldown Enter the value in AgeTF (.+)$")
	    public void user_scrolldown_enter_the_value_in_agetf(String Age) throws Throwable {
	    	Thread.sleep(2000);
	    	cp.enterAgeTF(Age);
	    	Thread.sleep(3000);
	        
	    }

	    @And("^Select the value in CasecategoryBox (.+)$")
	    public void select_the_value_in_casecategorybox(String Casecategory) throws InterruptedException {
	    	cp.selectCasecategoryBox(Casecategory);
	    	Thread.sleep(5000);
	       
	    }
	    
	    @When("User ScrollDown and Click on Save button")
	    public void user_scroll_down_and_click_on_save_button() throws Throwable {
	    	Thread.sleep(3000);
	    	cp.clickSavebutton();
	    	Thread.sleep(5000);
	    	
	    }
	    
	    @Then("^Search Result should be display$")
	    public void search_result_should_be_display() {
	       
	    }

	    
	   
}
