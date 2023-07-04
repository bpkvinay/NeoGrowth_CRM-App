package com.crm.POM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class LeadsEditspage extends Driver{
	
	private static final String String = null;

	SeleniumUtility sel=new SeleniumUtility();
	
	@FindBy(xpath="(//a[text()='Leads'])[3]")
	private WebElement Leadslnk;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[2]/a")
	private WebElement pencillink;
	
	@FindBy(xpath="//select[@name=\"salutation\"]")
	private WebElement PrefixNameDrop;
	
	@FindBy(xpath="//select[@id='cc_status_c']")
	private WebElement CCstatusDropdown;
	
	@FindBy(xpath="//input[@name=\"first_name\"]")
	private WebElement FirstnameTF;
	
	@FindBy(xpath="//input[@name=\"last_name\"]")
	private WebElement LastnameTF;
	
	@FindBy(xpath="//select[@id='eos_sub_disposition_c']")
	private WebElement CCSubDipostionDropdown;
	
	@FindBy(xpath="//select[@id=\"eos_disposition_c\"]")
	private WebElement CCDispostiondropdown;
	
	@FindBy(xpath="//select[@name=\"eos_opportunity_status_c\"]")
	private WebElement Opportunitystatus;
	
	@FindBy(xpath="//textarea[@id=\"eos_remark_c\"]")
	private WebElement remarkTF;
	
	@FindBy(xpath="//select[@id='select']")
	private WebElement SubDispositionDropdown;
	
	@FindBy(xpath="//select[@id='eos_sub_status_c']")
	private WebElement CamoppSubStatus;
	
	@FindBy(xpath="//select[@name='cc_agent_name_c']")
	private WebElement agentNameTF;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement Savebtn;
	
	@FindBy(xpath=("//table/tbody/tr[1]/td[3]/b"))
	private WebElement LeadsNameLink;
	
	@FindBy(xpath="//div[normalize-space()='First Name Should Contain Alphabets Only!']")
	private WebElement FirstNameTFErromessage;
	
	@FindBy(xpath="//div[contains(text(),'Last Name Should Contain Alphabets Only!')]")
	private WebElement LastNameTFErrormessage;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement MobileNumberTF;
	
	@FindBy(xpath="//div[normalize-space()='Please Enter Valid 10 Digit Mobile Number!']")
	private WebElement MobilenumberErrormessage;
	
	@FindBy(xpath="//h2[@class='module-title-text']")
	private WebElement editpagetitle;
	
	@FindBy(xpath="//span[@id='first_name']")
	private WebElement updatedFirstnameTF;
	
	@FindBy(xpath="//ul[@id='selectLinkTop']//label[@class='glyphicon bootstrap-checkbox initialized-checkbox glyphicon-unchecked']")
	private WebElement SelectBox;
	
	@FindBy(xpath="(//span[@class='suitepicon suitepicon-action-caret'])[4]")
	private WebElement dropdownicon;
	
	@FindBy(xpath="//a[@id='massupdate_listview_top']")
	private WebElement massupdateoption;
	
	@FindBy(xpath="//button[@id='mass_assigned_user_name_btn']")
	private WebElement clickmassassignedusernamearrow;
	
	@FindBy(xpath="//input[@id='user_name_advanced']")
	private WebElement advancenameusernameTF;
	
	@FindBy(xpath="//input[@id='search_form_submit']")
	private WebElement advancepagesearchbtn;
	
	@FindBy(xpath="(//table/tbody/tr[1]/td[2])[4]")
	private WebElement captureusername;
	
	@FindBy(xpath="//input[@id='update_button']")
	private WebElement massupdatebutton;
	
	
	public LeadsEditspage(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}



	public void Leadslnk() {
		Leadslnk.click();
		
	}
	public void clickpencillnk() {
		 pencillink.click();
	}
	public void getPrefixNameDrop(String prefix) {
		sel.selectByvalue(PrefixNameDrop,prefix);
		
	}
	public void getCCstatusDropdown(String ccstatusvalue) {
		sel.selectByvalue(CCstatusDropdown, ccstatusvalue);
	}
	public void EnterFirstnameTF(String firstnamevalue) {
		FirstnameTF.clear();
		FirstnameTF.sendKeys(firstnamevalue);
	}
	public void EnterLastnameTF(String lastnamevalue) {
		LastnameTF.clear();
		LastnameTF.sendKeys(lastnamevalue);
	}
	public void ClickCCSubDipostionDropdown(String CCsubvalue) {
		sel.selectByvalue(CCSubDipostionDropdown, CCsubvalue);
	}
	public void ClickCCDispostiondropdown(String CCDispostionvalue ) {
		sel.selectByvalue(CCDispostiondropdown, CCDispostionvalue);
	}
	public void ClickcamOpportunitystatus(String oppstatusvalue ) {
	    sel.selectByvalue(Opportunitystatus, oppstatusvalue);
	}
    public void EnterRemarkTF(String value) {
		remarkTF.clear();
		remarkTF.sendKeys(value);
	}
	public void ClickSubDispositionDropdown(String subdispostionvalue) {
		sel.selectByvalue(SubDispositionDropdown, subdispostionvalue);
	}
	public void getCamoppSubStatus(String camoppstatus) {
		sel.selectByvalue(CamoppSubStatus, camoppstatus);
	}
	public void getAgentNameTF(String agentnamevalue ) {
		sel.selectByvalue(agentNameTF, agentnamevalue);
	}
	public void clicksavebutton() {
		Savebtn.click();
	}
	public void Scrollbtn() {
		sel.scrollToElement(Savebtn, "SaveButton");
		Savebtn.click();
	}
	
	public void EnterMobileNumber(String number) {
		MobileNumberTF.clear();
		MobileNumberTF.sendKeys(number);
	}
	
	public void getoption() {
		sel.togetoptionspresentindropdown(CCDispostiondropdown);
}
	public void ClickLeadsNameLink() {
		LeadsNameLink.click();
	}
     public String getactualFirstnameTFerrormessage() {
    	 String actualmessage = FirstNameTFErromessage.getText();
		return actualmessage;
     }
    
     public String getactualLastnameTFerrormessage() {
    	 String actualmessage = LastNameTFErrormessage.getText();
		return actualmessage;
     }  
     
     public String getactualmobilenumberTFerrormessage() {
    	 String actualmessage = MobilenumberErrormessage.getText();
    	 return actualmessage;
     }
     
     public String geteditpagetext() {
    	 return editpagetitle.getText();
    	 
     }
     
     public String getupdatedfirstnameTF() {
    	 return updatedFirstnameTF.getText();
     }
     public void clickboxcheck() {
    	 sel.clickCheckBox(SelectBox,"checkbox");
     }
     public void selectcheckboxandclickmassupdate() {
    	 dropdownicon.click();
    	 massupdateoption.click();
     }
     public void clickmassassignedusernamearrow()
     {   
    	 
    	 clickmassassignedusernamearrow.click();
     }
     
     public void enterusernameadvanceTF(String username ) {
    	 advancenameusernameTF.clear();
    	 advancenameusernameTF.sendKeys(username);
     }
     
     public void clickSearcbutton() {
    	 advancepagesearchbtn.click();
     }
     
     public String actualusername() {
    	 return captureusername.getText();
    	 
     }
     
     public void clickusername(String adavanceusername ) {
    	if (actualusername().equalsIgnoreCase(adavanceusername)) {
    		captureusername.click();
    	}
    	else {
    		Assert.fail("username is not found, please search valid username" + adavanceusername);
    	}
    	
     }
     
     public void clickupdatebutton() {
    	 massupdatebutton.click();
    	 
     }
}

