package com.crm.NeoGrowthstepDef;

import org.junit.Assert;


import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.Leadspage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadsStepDef extends Driver{
	
	Leadspage lp=new Leadspage(driver);
	

	
	@When("^Click on pencil edit link$")
    public void click_on_pencil_edit_link() throws Throwable {
        lp.clickpencillnk();
        Thread.sleep(2000);
    }

    @When("^click on First name dropdown and select (.+)$")
    public void click_on_first_name_dropdown_and_select(String firstnameprefix) throws Throwable {
        lp.getPrefixNameDrop(firstnameprefix);
        Thread.sleep(2000);
    }
    
    @When("User scroll and click on Save buttom")
    public void user_scroll_and_click_on_save_buttom() throws InterruptedException {
    	lp.Scrollbtn();
    	Thread.sleep(2000);
    }
   

    @Then("Leads list page should be display")
    public void leads_list_page_should_be_display() {
      
    }
    @Then("^Edit page should be display$")
    public void edit_page_should_be_display() throws Throwable {
        
    }

    @Then("User details should be updated and navigate from edit details page to updated deatils page.")
    public void user_details_should_be_updated_and_navigate_from_edit_details_page_to_updated_deatils_page() {
       
    }

    @And("^click on the Leads module link$")
    public void click_on_the_leads_module_link() throws Throwable {
        lp.Leadslnk();
        Thread.sleep(2000);
    }

    @And("^Enter the value in Firstname TF(.+)$")
    public void enter_the_value_in_firstname_tf(String firsname) throws Throwable {
        lp.EnterFirstnameTF(firsname);
        Thread.sleep(2000);
    }
    

    @And("^Enter the value in Lastname TF(.+)$")
    public void enter_the_value_in_lastname_tf(String lastname) throws Throwable {
        lp.EnterLastnameTF(lastname);
        Thread.sleep(2000);
    }

    @And("^Click on CC Status dropdown and select (.+) option$")
    public void click_on_cc_status_dropdown_and_select_option(String ccstatus) throws Throwable {
      lp.getCCstatusDropdown(ccstatus);
      Thread.sleep(2000);
    }

    @And("^Click on  CC dispostion dropdwon and select (.+) option$")
    public void click_on_cc_dispostion_dropdwon_and_select_option(String ccdispostion) throws Throwable {
        lp.ClickCCDispostiondropdown(ccdispostion);
        Thread.sleep(2000);
        lp.getoption();
    }

    @And("^Click on CC Sub dispostion dropdown and select (.+) option$")
    public void click_on_cc_sub_dispostion_dropdown_and_select_option(String ccsubdispostion) throws Throwable {
        lp.ClickCCSubDipostionDropdown(ccsubdispostion);
        Thread.sleep(2000);
        
    }

    @And("^Click on CAM opprtunity status dropdown and select(.+) option$")
    public void click_on_cam_opprtunity_status_dropdown_and_select_option(String camopportunity) throws Throwable {
        lp.ClickcamOpportunitystatus(camopportunity);
       //  lp.getoption();
        Thread.sleep(2000);
    }

    @And("^Enter any (.+) CC remark TF$")
    public void enter_any_cc_remark_tf(String remarkvalue) throws Throwable {
        lp.EnterRemarkTF(remarkvalue);
        Thread.sleep(2000);
    }

    @And("^Click on CC agent name and select (.+)option$")
    public void click_on_cc_agent_name_and_select_option(String ccagentname) throws Throwable {
       lp.getAgentNameTF(ccagentname);
       Thread.sleep(3000);
    }
}
