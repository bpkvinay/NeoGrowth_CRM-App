package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class Leadspage extends Driver{
	
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
	
	
	
	public Leadspage(WebDriver driver) {
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
	
	public void getoption() {
		sel.togetoptionspresentindropdown(CCDispostiondropdown);
//sel.togetoptionspresentindropdown(CamoppSubStatus);
}

}
