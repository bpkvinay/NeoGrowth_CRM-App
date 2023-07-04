package com.crm.NeoGrowthstepDef;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;


import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.LeadsDetailsPage;
import com.crm.POM.LeadsEditspage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeadsStepDef extends Driver{
	
	LeadsEditspage lp =new LeadsEditspage(driver);
	Driver dr=new Driver();
	LeadsDetailsPage Ld= new LeadsDetailsPage(driver);
	SeleniumUtility sp=new SeleniumUtility();
	

	
	@When("^Click on pencil edit link$")
    public void click_on_pencil_edit_link() throws Throwable {
        lp.clickpencillnk();
        
    }

    @When("^click on First name dropdown and select (.+)$")
    public void click_on_first_name_dropdown_and_select(String firstnameprefix) throws Throwable {
        lp.getPrefixNameDrop(firstnameprefix);
        Thread.sleep(2000);
    }
    
    @When("User scroll and click on Save buttom")
    public void user_scroll_and_click_on_save_buttom() throws InterruptedException {
    	lp.Scrollbtn();
    	
    }
   

    @Then("Leads list page should be display")
    public void leads_list_page_should_be_display() throws Throwable {
    	Assert.assertEquals(driver.getTitle(),dr.getexceldata("Titles", 1, 1));
    	 Thread.sleep(3000);
      
    }
    @Then("^Edit page should be display$")
    public void edit_page_should_be_display() throws Throwable {
    	String as = dr.getexceldata("Titles", 4, 1);
    	Assert.assertTrue(lp.geteditpagetext().contains(as.toUpperCase()));
       
    }

    @Then("User details should be updated and navigate from edit details page to updated deatils page.")
    public void user_details_should_be_updated_and_navigate_from_edit_details_page_to_updated_deatils_page() {
      Assert.assertTrue(lp.geteditpagetext().contains(lp.getupdatedfirstnameTF().toUpperCase()));
    }

    @And("^click on the Leads module link$")
    public void click_on_the_leads_module_link() throws Throwable {
        lp.Leadslnk();
        Thread.sleep(3000);
        }

    @And("^Enter the value in Firstname TF(.+)$")
    public void enter_the_value_in_firstname_tf(String firsname) throws Throwable {
        lp.EnterFirstnameTF(firsname);
        
    }
    

    @And("^Enter the value in Lastname TF(.+)$")
    public void enter_the_value_in_lastname_tf(String lastname) throws Throwable {
        lp.EnterLastnameTF(lastname);
        
    }

    @And("^Click on CC Status dropdown and select (.+) option$")
    public void click_on_cc_status_dropdown_and_select_option(String ccstatus) throws Throwable {
      lp.getCCstatusDropdown(ccstatus);
      
    }

    @And("^Click on  CC dispostion dropdwon and select (.+) option$")
    public void click_on_cc_dispostion_dropdwon_and_select_option(String ccdispostion) throws Throwable {
        lp.ClickCCDispostiondropdown(ccdispostion);
        
    }

    @And("^Click on CC Sub dispostion dropdown and select (.+) option$")
    public void click_on_cc_sub_dispostion_dropdown_and_select_option(String ccsubdispostion) throws Throwable {
        lp.ClickCCSubDipostionDropdown(ccsubdispostion);
        
        
    }

    @And("^Click on CAM opprtunity status dropdown and select(.+) option$")
    public void click_on_cam_opprtunity_status_dropdown_and_select_option(String camopportunity) throws Throwable {
        lp.ClickcamOpportunitystatus(camopportunity);
       
        
    }

    @And("^Enter any (.+) CC remark TF$")
    public void enter_any_cc_remark_tf(String remarkvalue) throws Throwable {
        lp.EnterRemarkTF(remarkvalue);
        
    }

    @And("^Click on CC agent name and select (.+)option$")
    public void click_on_cc_agent_name_and_select_option(String ccagentname) throws Throwable {
       lp.getAgentNameTF(ccagentname);
       
    }
    
    @When("^click on LeadsNameLink$")
    public void click_on_leadsnamelink() throws Throwable {
        lp.ClickLeadsNameLink();
    }

    @When("^User Click on TaskLink$")
    public void user_click_on_tasklink() throws Throwable {
       Ld.clicktaskbutton();
    }

    @Then("^Leadsdetailspage should be display$")
    public void leadsdetailspage_should_be_display() throws Throwable {
    	Thread.sleep(3000);
    	Assert.assertTrue(lp.geteditpagetext().contains(lp.getupdatedfirstnameTF().toUpperCase()));
    }

    @Then("^CreateTask Should be created with (.+)$")
    public void createtask_should_be_created_with(String Subject) throws Throwable {
    	Thread.sleep(3000);
        Assert.assertEquals(Ld.gettasktext(), Subject);
    }

    @Then("^User should lands to Meetingpage$")
    public void user_should_lands_to_meetingpage() throws Throwable {
       
       Assert.assertTrue(Ld.getmeetingpagetitle().contains(Ld.getmeetingpageTF().toUpperCase()));
    }

    @And("^scroll down and click activities submodule$")
    public void scroll_down_and_click_activities_submodule() throws Throwable {
        Ld.ClickActivitiesLink();
    }

    @And("^click Creattask dropdown$")
    public void click_creattask_dropdown() throws Throwable {
        Ld.clickcreatetaskdropdown();
        
    }

    @And("^click on Schedule meeting option$")
    public void click_on_schedule_meeting_option() throws Throwable {
  
        Ld.clickSchedulemeetingButton();
    }

    @And("^Enter subject in (.+) TF$")
    public void enter_subject_in_tf(String subject) throws Throwable {
        Ld.EnterValueinSubjectTF(subject);
       
    }

    @And("^Select Date from (.+)$")
    public void select_date_from(String startdate) throws Throwable {
        Ld.EnterSelectFromDate(startdate);
        
    }
    
    @And("^Select Date End (.+)$")
    public void select_date_end(String enddate) throws Throwable {
       Ld.EnterSelectEndDate(enddate);
    }

    @And("^Click StartTime DropDown and select (.+)$")
    public void click_starttime_dropdown_and_select(String starthour) throws Throwable {
       Ld.selectstarthourstime(starthour);
    }

    @And("^Click StartMinute DropDown and select (.+)$")
    public void click_startminute_dropdown_and_select(String startminute) throws Throwable {
        Ld.selectminutestime(startminute);
    }

    @And("^Click EndTime DropDown and select (.+)$")
    public void click_endtime_dropdown_and_select(String endhour) throws Throwable {
        Ld.selectendhourstime(endhour);
    }

    @And("^Click EndMinute DropDown and select (.+)$")
    public void click_endminute_dropdown_and_select(String endminute) throws Throwable {
       Ld.selectendminutestime(endminute); 
    }

    @And("^Click on Save button$")
    public void click_on_save_button() throws Throwable {
       Ld.clicksavebuttonmeeting();
    }
    @Then("^Should display the errromesssage (.+) in FirstNameTF$")
    public void should_display_the_errromesssage_in_firstnametf(String errormessage) throws Throwable {
       Assert.assertEquals(errormessage,lp.getactualFirstnameTFerrormessage());
    }
    
    @Then("^Should display the errromesssage (.+) in LastNameTF$")
    public void should_display_the_errromesssage_in_lastnametf(String errormessage) throws Throwable {
        Assert.assertEquals(errormessage,lp.getactualLastnameTFerrormessage());
    }
    
    @And("^Enter the value in Mobilenumber TF(.+)$")
    public void enter_the_value_in_mobilenumber_tf(String mobilenumber) throws Throwable {
        lp.EnterMobileNumber(mobilenumber);
    }

    @Then("^Should display the errromesssage (.+) in MobileNumberTF$")
    public void should_display_the_errromesssage_in_mobilenumbertf(String errormessage) throws Throwable {
       Assert.assertEquals(errormessage,lp.getactualmobilenumberTFerrormessage());
    }
    
    @And("^Enter subject1 in (.+)$")
    public void enter_subject1_in(String subject1) throws Throwable {
    	 Ld.EnterValueinSubjectTF(subject1);
    }
    
    @And("^Select month year from calender(.+)$")
    public void select_month_year_from_calender(String monthyear) throws Throwable {
    	Thread.sleep(3000);
        Ld.CalendeStartrButton(monthyear);
        Thread.sleep(10000);
    }
  
    @And("^Select day from calender(.+)$")
    public void select_day_from_calender(String date) throws Throwable {
    	Thread.sleep(3000);
        Ld.clickdate(date);
        Thread.sleep(9000);
    } 
    

    
}
