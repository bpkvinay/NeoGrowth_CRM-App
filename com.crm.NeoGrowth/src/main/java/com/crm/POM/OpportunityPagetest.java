package com.crm.POM;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import lombok.experimental.PackagePrivate;

public class OpportunityPagetest extends Driver{
	
	public SeleniumUtility sp=new SeleniumUtility();

	@FindBy(xpath ="//a[@id='grouptab_5']")
	private WebElement AllStickymenu;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[2]")
	private WebElement OppLink;
	
	@FindBy(xpath="(//input[@type='submit'])[4]")
	private WebElement Removebtn;
	
	@FindBy(xpath="(//table/tbody/tr[1]/td[3])[3]")
	private WebElement oppurtnamelink;
	
	@FindBy(xpath="//h2[contains(., 'Opportunities')]")
	private WebElement ExpectedTitle;
	
	@FindBy(xpath="//select[@id='massassign_group']")
	private WebElement MassAssignGroupDrown;
	
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	private WebElement checkboxbtn;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement oppotunitynameTF;
	
	@FindBy(xpath = "//input[@name='loan_amount_c']")
	private WebElement loanamountTF;
	
	@FindBy(xpath = "//select[@name='pickup_appointment_city_c']")
	private WebElement pickupcityDD;
	
	@FindBy(xpath = "//select[@id='cc_status_c']")
	private WebElement CCstatusDD;
	
	@FindBy(xpath = "//select[@id='eos_disposition_c']")
	private WebElement DispositionDD;
	
	@FindBy(xpath = "//select[@id='eos_opportunity_status_c']")
	private WebElement opportunitystatusDD;
	
	@FindBy(xpath = "//select[@id='eos_sub_disposition_c']")
	private WebElement SubdispositionDD;
	
	@FindBy(xpath = "//select[@id='eos_sub_status_c']")
	private WebElement SubopportunityDD;
	
	@FindBy(xpath = "(//input[@title='Save'])[2]")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/a[1]")
	private WebElement Editicon;
	
	//basic module caledarpopup xpaths
	@FindBy(xpath = "//button[@id='pickup_appointment_date_c_trigger']") //1
	private WebElement calendaricon;
	//monthyear tag xpath
	@FindBy(xpath = "(//a[@class='calna'])[2]") //2
	private WebElement MonthyearTag;
	//Next Button Xpath
	@FindBy(xpath = "(//a[@class=\"calnavright\"])[2]")  //3
	private WebElement NextButton;
	
	@FindBy(xpath = "//select[@id='pickup_appointment_date_c_hours']") //4
	private WebElement HoursDD;
	
	@FindBy(xpath = "//select[@id='pickup_appointment_date_c_minutes']") //5
	private WebElement MinuteDD;
	
	@FindBy(xpath = "//input[@id='pickup_appointment_address_c']") //6
	private WebElement pickupaddressTF;
	
	@FindBy(xpath = "//select[@id='servicable_c']") //7
	private WebElement servicableDD;
	
	@FindBy(xpath = "//textarea[@id='pickup_appointment_feedback_c']") //8
	private WebElement pickupfeedbackTF;
	
	@FindBy(xpath = "//input[@id='assigned_user_name']") //9
	private WebElement assignedUserTF;
	
	@FindBy(xpath = "//button[@id='btn_assigned_user_name']") //10
	private WebElement selectUserBtn;
	
	@FindBy(xpath = "//span[@class='suitepicon suitepicon-action-clear']") //11
	private WebElement ClearUserBtn;
	
	@FindBy(xpath = "//textarea[@id='leads_description_c']") //12
	private WebElement leadsdescriptionTF;
	
	@FindBy(xpath = "//select[@id='inbound_insta_callback_c']") //13
	private WebElement inboundinstacallDD;
	
	@FindBy(xpath = "//input[@id='merchant_name_c']") //14
	private WebElement TradingNameTF;
	
	@FindBy(xpath = "//input[@id='amount']") //15
	private WebElement loandisbursedTF;
	
	@FindBy(xpath = "//input[@id='loan_amount_sanctioned_c']") //16
	private WebElement loanamountsanctionedTF;
	
	@FindBy(xpath = "//input[@id='pickup_appointment_contact_c']") //17
	private WebElement appointmentcontactNumber;
	
	@FindBy(xpath = "//input[@id='pickup_appointment_pincode_c']") //18
	private WebElement pickupPincode;
	
	@FindBy(xpath = "//input[@id='business_vintage_c']") //19
	private WebElement BusinessvintageTF;
	
	@FindBy(xpath = "//textarea[@id='remarks_c']") //20
	private WebElement RemarksTF;
	
	@FindBy(xpath = "//select[@id='cc_agent_name_c']")//21
	private WebElement ccagentDD;
	
	@FindBy(xpath = "//select[@id='acspm_c']") //22
	private WebElement cardsalepermonthDD;
	
	@FindBy(xpath = "//textarea[@id='eos_remark_c']") //23
	private WebElement ccremarksTF;
	
	@FindBy(xpath = "//input[@id='cam_auto_assign']") //24
	private WebElement CamAutoassignchkBox;
	
	@FindBy(xpath = "//input[@id='channel_source_c']") //25
	private WebElement channelsourceTF;
	
	@FindBy(xpath = "//table[4]/tbody[1]/tr[1]/td[1]")
	private WebElement selectuserFirstName;
	
	
	
	public OpportunityPagetest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	public WebElement getAllStickymenu() {
		return AllStickymenu;
		
	}
  
    public WebElement getOppLink() {
		return OppLink;
	}
	
   public WebElement Clickopplink()
   {
	   return oppurtnamelink;
	
   }
   public void scrollelement() {
	   sp.scrollToElement(Removebtn, "removebutton" );
	   Removebtn.click();
   }
    
   public String getExpectedTitle() {
	   String expectedtitle = ExpectedTitle.getText();
	   return expectedtitle;
   }
   
   public void selectoptionfrommassassignDropDown( String opt) {
	   sp.selectByText(MassAssignGroupDrown,opt);
   }
   
   public void clickcheckboxbutton() {
	   sp.clickCheckBox(checkboxbtn, "checkbox");
   }
   
   public void getOppotunitynameTF(String opportunityname) {
		 oppotunitynameTF.clear();
		 oppotunitynameTF.sendKeys(opportunityname);
	}

	public void getLoanamountTF(String loanamount) {
		loanamountTF.clear();
		loanamountTF.sendKeys(loanamount);
	}

	public void getPickupcityDD(String pickupcity) {
		sp.selectByvalue(pickupcityDD, pickupcity);
	}

	public void getSaveBtn() {
		sp.scrollToElement(saveBtn, "savebtn");
		saveBtn.click();
	}

	public void getEditicon() {
		Editicon.click();
	}

	public void getCCstatusDD(String CCstatus) {
		 sp.selectByvalue(CCstatusDD,CCstatus);
	}

	

	public void getDispositionDD(String Disposition) {
		sp.selectByvalue(DispositionDD,Disposition ); 
	}

	

	public void getOpportunitystatusDD(String oppstatus) {
		sp.selectByvalue(opportunitystatusDD,oppstatus); 
	}

	

	public void getSubdispositionDD(String subdisposition ) {
		sp.selectByvalue(SubdispositionDD, subdisposition); 
	}


	public void getMonthyearTag(String monthYear) {
		sp.clickdatefromcalenderpopup(calendaricon, MonthyearTag,monthYear, NextButton);
	}



	public void getHoursDD(String hoursDD) {
		sp.selectByvalue(HoursDD, hoursDD); 
		
	}




	public void getMinuteDD(String minuteDD) {
		sp.selectByvalue(MinuteDD, minuteDD);
	}




	public void getPickupaddressTF(String adress) {
		 pickupaddressTF.clear();
		 pickupaddressTF.sendKeys(adress);
	}




	public void getServicableDD(String ServicableDD) {
		sp.selectByvalue(servicableDD, ServicableDD); 
	}

	public void getPickupfeedbackTF(String PickupfeedbackTF) {
	  pickupfeedbackTF.clear();
	  pickupfeedbackTF.sendKeys(PickupfeedbackTF);
	}




	public void getAssignedUserTF(String assigneduser) {
		 assignedUserTF.clear();
		 assignedUserTF.sendKeys(assigneduser);
		 getClearUserBtn();
	}



	public void getSelectUserBtn() {
		 selectUserBtn.click();
		 sp.windowHandle();
	      sp.scrollToElement(selectuserFirstName, "selectuserFirstName");
	      selectuserFirstName.click();
		 
	}




	public void getClearUserBtn() {
		 ClearUserBtn.click();
	}



	public void getLeadsdescriptionTF(String Leaddescription) {
		 leadsdescriptionTF.sendKeys(Leaddescription);
	}




	public void getInboundinstacallDD(String InboundInstaCallDD) {
		sp.selectByvalue(inboundinstacallDD, InboundInstaCallDD);
	}




	public void getTradingNameTF(String Business_TradingName) {
		 TradingNameTF.sendKeys(Business_TradingName);
	}




	public void getLoandisbursedTF(String LoanDisbursed) {
		 loandisbursedTF.sendKeys(LoanDisbursed);
	}




	public void getLoanamountsanctioned(String LoanSanctioned) {
		 loanamountsanctionedTF.sendKeys(LoanSanctioned);
	}




	public void getAppointmentcontactNumber(String ContactNumber) {
		String text = appointmentcontactNumber.getText(); 
		if(text.isEmpty()) {
			appointmentcontactNumber.sendKeys(ContactNumber);
		}else {
			System.out.println("appointmentcontactNumber is already present"+text);	
		}
	}




	public void getPickupPincode(String PickupPincode) {
		 String text = pickupPincode.getText();
		 if(text.isBlank()) {
			 pickupPincode.sendKeys(PickupPincode);
		 }else {
			 System.out.println("pickupPincode is already present"+text);
		 }
			 
		 
	}




	public void getBusinessvintageTF(String businessVinatage) {
		 BusinessvintageTF.sendKeys(businessVinatage);
	}




	public void getRemarksTF(String remarks) {
	 RemarksTF.sendKeys(remarks);
	}




	public void getCcagentDD(String CCagentDD) {
		sp.selectByvalue(ccagentDD, CCagentDD); 
	}




	public void getCardsalepermonthDD(String CardsaleperMonth) {
		sp.selectByvalue(cardsalepermonthDD, CardsaleperMonth) ;
	}




	public void getCcremarksTF(String CCremark) {
		ccremarksTF.sendKeys(CCremark);
	}




	public void getCamAutoassignchkBox() {
		 CamAutoassignchkBox.click();
	}




	public void getChannelsourceTF(String Channelsource) {
		 channelsourceTF.sendKeys(Channelsource);
	}

	
	
	



	
	

	
	
	
}
