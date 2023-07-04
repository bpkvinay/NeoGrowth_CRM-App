package com.crm.NeoGrowthstepDef;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.LoginPagetest;
import com.crm.POM.OpportunityPagetest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OppotunityStepDef extends Driver{
	 Driver dr=new Driver();
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
	public void opportunity_home_page_should_be_visible() throws EncryptedDocumentException, IOException {
		 System.out.println(driver.getTitle());
		 String ActualTitle =dr.getexceldata("Titles",2, 1);
	   org.junit.Assert.assertEquals(driver.getTitle(), ActualTitle);
	
	}
	
	    @When("user clicked on firstuser name link")
	    public void user_clicked_on_firstuser_name_link() throws InterruptedException {
	    	Thread.sleep(2000);
	       opp.Clickopplink().click();
	       Thread.sleep(2000);
	    }

	    @Then("user should lands to opportunity details page")
	    public void user_should_lands_to_opportunity_details_page() throws EncryptedDocumentException, IOException {
	        String ActualTitle = dr.getexceldata("Titles",2, 1);
   org.junit.Assert.assertEquals(driver.getTitle(),ActualTitle);
	    }

	   @When("^User Should select one opportunity$")
	   public void user_should_select_one_opportunity() throws Throwable {
        opp.clickcheckboxbutton();
	   }

	    @And("^Click Ok button from alert popup$")
	    public void click_ok_button_from_alert_popup() throws Throwable {
	     sp.Alertpopupclickokbutton();
	   }
	    
	    @And("^User select (.+) from massassignGroupDown dropdown$")
	    public void user_select_from_massassigngroupdown_dropdown(String option) throws Throwable {
	    opp.selectoptionfrommassassignDropDown(option);
        }

	 
	    @And("user scroll and click on remove button")
	    public void user_scroll_and_click_on_remove_button() throws InterruptedException {
	    Thread.sleep(3000);
	    opp.scrollelement();
	    Thread.sleep(3000);
      }


   @Then("^opportunity should be deleted$")
 public void opportunity_should_be_deleted() throws Throwable {
  }

	    @When("^click on the Edit icon$")
	    public void click_on_the_edit_icon() throws Throwable {
	    	Thread.sleep(5000);
	        opp.getEditicon();
	        Thread.sleep(5000);
	    }

	    @Then("^User edit page should be displayed$")
	    public void user_edit_page_should_be_displayed() throws Throwable {
	       
	    }
	    
	    @When("^Enter the opportunity name into (.+) TF$")
	    public void enter_the_opportunity_name_into_tf(String opportunityname) throws Throwable {
	        opp.getOppotunitynameTF(opportunityname);
	        Thread.sleep(3000);
	    }


	    @And("^Enter the loan amount into (.+) TF$")
	    public void enter_the_loan_amount_into_tf(String loanamount) throws Throwable {
	    	opp.getLoanamountTF(loanamount);
	    }

	    @And("^select the Pickup/appointment city from (.+) Drop Down$")
	    public void select_the_pickupappointment_city_from_drop_down(String pickupcity) throws Throwable {
	        opp.getPickupcityDD(pickupcity);
	    }
 
	    @And("^select the CC Status from (.+) Drop Down$")
	    public void select_the_cc_status_from_connect_drop_down(String CCStatus) {
	        opp.getCCstatusDD(CCStatus);
	    }
	    
	    @And("^select the CC Disposition from (.+) Drop Down$")
	    public void select_the_cc_disposition_from_connect_existing_cm_drop_down(String CCDisposition) {
	        opp.getDispositionDD(CCDisposition);
	    	
	    }
	    
	    @And("^select the CC Sub-Disposition from (.+) Drop Down$")
	    public void select_the_cc_sub_disposition_from_connect_existing_cm_existing_customer_drop_down(String CCSubDisposition) {
	       opp.getSubdispositionDD(CCSubDisposition);
	    	
	    }
	    
	    @And("^select the CAM Opportunity Status from (.+) Drop Down$")
	    public void select_the_cam_opportunity_status_from_follow_up_drop_down(String CAMOpportunityStatus) {
	        opp.getOpportunitystatusDD(CAMOpportunityStatus);
	    }
	    
	    @And("select the CAM Opportunity Sub Status auto updated with respect to opportunity status")
	    public void select_the_cam_opportunity_sub_status_auto_updated_with_respect_to_opportunity_status() {
	       
	    	
	    }
	    
	    @And("scroll Down the page and click on the save button")
	    public void scroll_down_the_page_and_click_on_the_save_button() {
	    	opp.getSaveBtn();
	    }
	    
	    @Then("User page should be upadted")
	    public void user_page_should_be_upadted() {
	    	
	    }
	    
	    
	    @And("^pick the date from (.+) date popup$")
	    public void pick_the_date_from_date_popup(String pickupappointmentdatetime) throws Throwable {
	        opp.getMonthyearTag(pickupappointmentdatetime);
	    }

	    @And("^pick the time from (.+) Time/hours Drop Down$")
	    public void pick_the_time_from_timehours_drop_down(String pickupappointmenttimehours) throws Throwable {
	        opp.getHoursDD(pickupappointmenttimehours);
	    }

	    @And("^pick the time from (.+) Time/min Drop Down$")
	    public void pick_the_time_from_timemin_drop_down(String pickupappointmenttime) throws Throwable {
	        opp.getMinuteDD(pickupappointmenttime);
	    }

	    @And("^Enter the address into (.+) TF$")
	    public void enter_the_address_into_tf(String pickupappointmentaddress) throws Throwable {
	       opp.getPickupaddressTF(pickupappointmentaddress);
	    }

	    @And("^select the serviceable from (.+) Drop Down$")
	    public void select_the_serviceable_from_drop_down(String servicable) throws Throwable {
	        opp.getServicableDD(servicable);
	    }

	    @And("^Enter the  feedback into (.+) TF$")
	    public void enter_the_feedback_into_tf(String pickupappointmentfeedback) throws Throwable {
	        opp.getPickupfeedbackTF(pickupappointmentfeedback);
	    }
	    
	    @And("^Enter the Pickup/ appointment allocated to into (.+) TF and clear TF$")
	    public void enter_the_pickup_appointment_allocated_to_into_tf_and_clear_tf(String pickupappointmentallocatedto) throws Throwable {
	       opp.getAssignedUserTF(pickupappointmentallocatedto);
	       
	    }

	    @And("^click on the select user icon new window open and scroll down window and select allocated to name from select user page$")
	    public void click_on_the_select_user_icon_new_window_open_and_scroll_down_window_and_select_allocated_to_name_from_select_user_page() throws Throwable {
	       opp.getSelectUserBtn();
	    }

	    @And("^Enter the Lead Description into (.+) TF$")
	    public void enter_the_lead_description_into_tf(String leaddescription) throws Throwable {
	       opp.getLeadsdescriptionTF(leaddescription);
	    }

	    @And("^select the inbound insta callback value from (.+) Drop Down$")
	    public void select_the_inbound_insta_callback_value_from_drop_down(String inboundinstacallback) throws Throwable {
	       opp.getInboundinstacallDD(inboundinstacallback);
	    }

	    @And("^Enter the Business /Trading Name into (.+) TF$")
	    public void enter_the_business_trading_name_into_tf(String businesstradingname) throws Throwable {
	        opp.getBusinessvintageTF(businesstradingname);
	    }

	    @And("^Enter the Loan Amount Disbursed into (.+) TF$")
	    public void enter_the_loan_amount_disbursed_into_tf(String loanamountdisbursed) throws Throwable {
	       opp.getLoandisbursedTF(loanamountdisbursed);
	    }

	    @And("^Enter the Loan Amount Sanctioned into (.+) TF$")
	    public void enter_the_loan_amount_sanctioned_into_tf(String loanamountsanctioned) throws Throwable {
	       opp.getLoanamountsanctioned(loanamountsanctioned);
	    }

	    @And("^Enter the Pickup/appointment Contact Number into (.+) TF$")
	    public void enter_the_pickupappointment_contact_number_into_tf(String pickupappointmentcontactnumber) throws Throwable {
	       opp.getAppointmentcontactNumber(pickupappointmentcontactnumber);
	    }

	    @And("^Enter the Pickup/ appointment pin code into (.+) TF$")
	    public void enter_the_pickup_appointment_pin_code_into_tf(String pickupappointmentpincode) throws Throwable {
	      opp.getPickupPincode(pickupappointmentpincode);
	    }

	    @And("^Enter the Business Vintage into (.+) TF$")
	    public void enter_the_business_vintage_into_tf(String businessvintage) throws Throwable {
	        opp.getBusinessvintageTF(businessvintage);
	    }

	    @And("^Enter the Remarks into (.+) drag Text box$")
	    public void enter_the_remarks_into_drag_text_box(String remarks) throws Throwable {
	        opp.getRemarksTF(remarks);
	    }

	    @And("^select the value from CC Agent Name (.+) Drop Down$")
	    public void select_the_value_from_cc_agent_name_drop_down(String ccagentname) throws Throwable {
	       opp.getCcagentDD(ccagentname);
	    }
	    
	    @And("^select the value from Average card sales per month (.+) Drop Down$")
	    public void select_the_value_from_average_card_sales_per_month_drop_down(String averagecardsalespermonth) throws Throwable {
	       opp.getCardsalepermonthDD(averagecardsalespermonth);
	    }

	    @And("^Enter the CC Remark into (.+) TF$")
	    public void enter_the_cc_remark_into_tf(String ccremark) throws Throwable {
	       opp.getCcremarksTF(ccremark);
	    }

	    @And("^Click on the Auto Assign To CAM check box $")
	    public void click_on_the_auto_assign_to_cam_check_box() throws Throwable {
	        opp.getCamAutoassignchkBox();
	    }

	    @And("^Enter the Channel Source into (.+) TF$")
	    public void enter_the_channel_source_into_tf(String channelsource) throws Throwable {
	       opp.getChannelsourceTF(channelsource);
	    }

	    


	    
}
