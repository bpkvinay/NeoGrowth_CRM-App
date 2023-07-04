package com.crm.NeoGrowthstepDef;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.CasesFilterPage;
import com.crm.POM.CasesPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CasesStepDef extends Driver{

       Driver dr = new Driver();
	   SeleniumUtility su = new SeleniumUtility();
	   CasesPage cp = new CasesPage(driver);
	   CasesFilterPage cf = new CasesFilterPage(driver);

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
	    public void user_click_on_pencil_icon() throws Throwable  {
		   cp.ClickPencilIcon().click();
		   Thread.sleep(2000);
	    }

	    @And("^Entering the value in TATDaysTF (.+)$")
	    public void entering_the_value_in_tatdaystf(String Tatdaysvalue) throws Throwable {
	    	cp.getTatDaysTF(Tatdaysvalue);   
	    }
	    	
	    @And("^Click on Case Category dropdown and select (.+) option$")
	    public void click_on_case_category_dropdown_and_select_option(String Casecategory) throws Throwable{
	    	cp.ClickCaseCategoryDropdown(Casecategory); 
	    	Thread.sleep(2000);
	    }
	    
	    @And("^Click on Case Sub Category dropdown and select (.+) option$")
	    public void click_on_case_sub_category_dropdown_and_select_option(String subcategory) throws Throwable {
	        cp.ClickCaseSubCategoryDropdown(subcategory);
	        Thread.sleep(2000);
	    }

	    @And("^Click on Case Details dropdown and select (.+) option$")
	    public void click_on_case_details_dropdown_and_select_option(String Casedetails) {
	    	cp.ClickCaseDetailsDropdown(Casedetails);    
	    }
	    
	    @Then("^User Scrolldown click SaveBtn$")
	    public void user_scrolldown_click_savebtn()  {
	    	cp.ClickSaveButton();
	    }
	  	  
	    
	    
	    @When("^Click on CasesModule Link$")
	    public void click_on_casesmodule_link() throws Throwable {
	    	cf.ClickCasesModuleLink().click();  
	    }
	    
	    @When("^Click on the Filter Icon$")
	    public void click_on_the_filter_icon() throws Throwable {
	        cf.ClickFilterIcon().click();
	    }

	    @Then("^Advance FilterTab Should be Display$")
	    public void advance_filtertab_should_be_display() throws Throwable {  
	    	cf.ClickFilterIcon().click();  
	    	Thread.sleep(2000);
	    }
	    
	    @And("^Click on the AdvanceFilter button$")
	    public void click_on_the_advancefilter_button() throws Throwable {
	      cf.SwitchtoTab();
	      Thread.sleep(2000);
	    }

	    @And("^Enter the Value in NumberTF (.+)$")
	    public void enter_the_value_in_numbertf(String Number) throws Throwable {
	    	cf.EnterNumberTF(Number);  
	    	Thread.sleep(2000);
	    }

	    @And("^Enter the value in SubjectTF (.+)$")
	    public void enter_the_value_in_subjecttf(String Subject) throws Throwable {
	    	cf.EnterSubjectTF(Subject); 
	    	Thread.sleep(2000);
	    }

	    @And("^Select the value from Statusbox (.+)$")
	    public void select_the_value_from_statusbox(String status) throws Throwable {
	    	cf.SelectStatusBox(status);  
	    	Thread.sleep(2000);
	    }

	    @And("^Select the value from AssignedtoBox (.+)$")
	    public void select_the_value_from_assignedtobox(String Assignedto) throws Throwable {
	       cf.SelectAssignedtoBox(Assignedto);

	    }
	   	   
	    @And("^Enter the value in CaseownerTF (.+)$")
	    public void enter_the_value_in_caseownertf(String caseowner) throws Throwable {	
	        cf.EnterCaseownerTF(caseowner);
	        Thread.sleep(2000);
	    }

	    @And("^Select the value in PriorityBox (.+)$")
	    public void select_the_value_in_prioritybox(String priority) throws Throwable {
	    	cf.SelectPriorityBox(priority); 
	    	Thread.sleep(2000);
	    }

	    @And("^Enter the value in AppidTF (.+)$")
	    public void enter_the_value_in_appidtf(String appid) throws Throwable {
	    	cf.EnterAppidTF(appid); 
	    	Thread.sleep(2000);
	    }

	    @And("^Enter the  value in NameTF (.+)$")
	    public void enter_the_value_in_nametf(String name) throws Throwable {
	    	cf.EnterNameTF(name);  
	    	Thread.sleep(2000);
	    }

	    @And("^Enter the value in EmailidTF (.+)$")
	    public void enter_the_value_in_emailidtf(String emailid) throws Throwable {
	    	cf.EnterEmailidTF(emailid);  
	    	Thread.sleep(2000);
	    }

	    @And("^Enter the value in ContactTF (.+)$")
	    public void enter_the_value_in_contacttf(String contact) throws Throwable {
	        cf.EnterContactnumberTF(contact);
	        Thread.sleep(2000);
	    }

	    @And("^Enter the value in LocationTF (.+)$")
	    public void enter_the_value_in_locationtf(String location) throws Throwable {
	        cf.SelectLocationBox(location);
	        Thread.sleep(2000);
	    }

	    @And("^Select the value in TypeBox (.+)$")
	    public void select_the_value_in_typebox(String type) throws Throwable {
	    	cf.SelectTypeBox(type); 
	    	Thread.sleep(2000);
	    }

	    @And("^Enter the value in AgeTF (.+)$")
	    public void enter_the_value_in_agetf(String age) throws Throwable {
	    	cf.EnterAgeTF(age);
	    	Thread.sleep(2000);   
	    }

	    @And("^Select the value in CasecategoryBox (.+)$")
	    public void select_the_value_in_casecategorybox(String casecategory) throws Throwable {
	        cf.SelectCasecategoryBox(casecategory);
	        Thread.sleep(2000);
	    }
	    
	    @And("^Select the value in EmailsourceBox (.+)$")
	    public void select_the_value_in_emailsourcebox(String emailsource) throws Throwable {
	        cf.SelectEmailsourceBox(emailsource);
	        Thread.sleep(2000);
	    }

	    @When("^User ScrollDown and Click on Save button$")
	    public void user_scrolldown_and_click_on_save_button() throws Throwable {
	    	cf.ClickSavebutton();
	    	Thread.sleep(2000);
	    }

	    @Then("^Search Result should be display (.+)$")
	    public void search_result_should_be_display(String searchresult) throws Throwable {
	    	Assert.assertEquals(cf.getSearchResult(), searchresult);
	    }
}

	

