package com.crm.POM;

import java.util.ArrayList;
import java.util.List;

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
	@FindBy(xpath = "//button[@id='pickup_appointment_date_c_trigger']")
	private WebElement calendaricon;
	//monthyear tag xpath
	@FindBy(xpath = "(//a[@class='calna'])[2]")
	private WebElement MonthyearTag;
	//Next Button Xpath
	@FindBy(xpath = "(//a[@class=\"calnavright\"])[2]")
	private WebElement NextButton;
	
	@FindBy(xpath = "//select[@id='pickup_appointment_date_c_hours']")
	private WebElement HoursDD;
	
	@FindBy(xpath = "//select[@id='pickup_appointment_date_c_minutes']")
	private WebElement MinuteDD;
	
	@FindBy(xpath = "//input[@id='pickup_appointment_address_c']")
	private WebElement pickupaddressTF;
	
	@FindBy(xpath = "//select[@id='servicable_c']")
	private WebElement servicableDD;
	
	@FindBy(xpath = "//textarea[@id='pickup_appointment_feedback_c']")
	private WebElement pickupfeedbackTF;
	
	@FindBy(xpath = "//button[@id='btn_assigned_user_name']")
	private WebElement selectUserBtn;
	
	@FindBy(xpath = "//span[@class='suitepicon suitepicon-action-clear']")
	private WebElement ClearUserBtn;
	
	//@FindBy(xpath = "")
	
	
	
	
	
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

	

	public void getSubopportunityDD(String subopportunity) {
		sp.selectByvalue(SubopportunityDD, subopportunity);
	}

	
	

	
	
	
}
