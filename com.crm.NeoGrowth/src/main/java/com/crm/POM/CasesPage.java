package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class CasesPage extends Driver {
	
SeleniumUtility su = new SeleniumUtility();
	
	@FindBy(xpath = "(//a[text()='Cases'])[3]")
	private WebElement CasesLink;

	@FindBy(xpath = "//table/tbody/tr[1]/td[2]/a")
	private WebElement PencilIcon;
	
	@FindBy(xpath = "//input[@id='tat_in_days_c']")
	private WebElement TatDaysTF;
	
	@FindBy(xpath = "//select[@id='case_category_c']")
	private WebElement CaseCategoryDropdown;
	
	@FindBy(xpath = "//select[@id='case_subcategory_c']")
	private WebElement CaseSubCategoryDropdown;
	
	@FindBy(xpath = "//select[@id='case_details_c']")
	private WebElement CaseDetailsDropdown;
	
	@FindBy(xpath = "(//input[@class='button primary'])[2]")
	private WebElement SaveButton;
	
	
	public CasesPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	public WebElement ClickCasesLink() {
	 return CasesLink;
	}

	public WebElement ClickPencilIcon() {
		return PencilIcon;
	
	}

	public void getTatDaysTF(String Tatdaysvalue) {
		TatDaysTF.clear();
		TatDaysTF.sendKeys(Tatdaysvalue);
	
	}

	public void ClickCaseCategoryDropdown(String categoryValue) {
		su.selectByText(CaseCategoryDropdown, categoryValue);
		
		
	}

	public void ClickCaseSubCategoryDropdown(String Subcategoryvalue) {
		
		su.selectByText(CaseSubCategoryDropdown, Subcategoryvalue);
	}

	public void ClickCaseDetailsDropdown(String Casedetailvalue) {
		su.selectByText(CaseDetailsDropdown, Casedetailvalue);
		
	}

	public void ClickSaveButton() {
		su.scrollToElement(SaveButton, "savebtn");
		SaveButton.click();
		
	}
	
	/////////////////// Verify Advanced Filter Tab //////////////////////////
	
	@FindBy(xpath = "(//a[text()='Cases'])[3]")
	private WebElement CasesModuleLink;

	@FindBy (xpath = "(//a[@title='Filter'])[1]")
	private WebElement FilterIcon;
	
	@FindBy (xpath = "//*[@id=\"searchDialog\"]/div/div/div[1]/ul/li[2] ")
	private WebElement AdvanceFilterBtn;
	
	@FindBy (xpath = "//input[@id='case_number_advanced']")
	private WebElement NumberTF;
	
	@FindBy (xpath = "//input[@id='name_advanced']")
	private WebElement SubjectTF;
	
	@FindBy (xpath = "//select[@id='state_advanced']")
	private WebElement StatusBox;
	
	@FindBy (xpath = "//select[@id='assigned_user_id_advanced']")
	private WebElement AssignedtoBox;
	
	@FindBy (xpath = "//input[@id='attended_by_c_advanced']")
	private WebElement CaseownerTF;
	
	@FindBy (xpath = "//select[@id='priority_advanced']")
	private WebElement PriorityBox;
	
	@FindBy (xpath = "//input[@id='merchant_app_id_c_advanced']")
	private WebElement AppidTF;
	
	@FindBy (xpath = "//input[@id='merchant_name_c_advanced']")
	private WebElement NameTF;
	
	@FindBy (xpath = "//input[@id='merchant_email_id_c_advanced']")
	private WebElement EmailidTF;
	
	@FindBy (xpath = "//input[@id='merchant_contact_number_c_advanced']")
	private WebElement ContactnumberTF;
	
	@FindBy (xpath = "//select[@id='case_location_c_advanced']")
	private WebElement LocationBox ;
	
	@FindBy (xpath = "//select[@id='type_advanced']")
	private WebElement TypeBox ;
	
	@FindBy (xpath = "//input[@id='age_c_advanced']")
	private WebElement AgeTF;
	
	@FindBy (xpath = "//select[@id='case_category_c_advanced']")
	private WebElement CasecategoryBox;
	
	@FindBy (xpath = "//input[@id='search_form_submit_advanced']")
	private WebElement Savebutton;
	

	
	public WebElement clickCasesModuleLink() {
		return CasesModuleLink;
	}
	
	public WebElement clickFilterIcon() {
		return FilterIcon;
	}
	
	public WebElement clickAdvanceFilterBtn() {
		return AdvanceFilterBtn;
	}

	public void  enterNumberTF(String Number) {
		NumberTF.sendKeys(Number);
	}

	public void enterSubjectTF(String Subject) {
		SubjectTF.sendKeys(Subject);
	}

	public void selectStatusBox(String Status) {
		su.selectByvalue(StatusBox, Status);
		
	}

	public void selectAssignedtoBox(String Assignedvalue) {
		su.selectByText(AssignedtoBox, Assignedvalue);
		
	}

	public void enterCaseownerTF(String Caseowner) {
		su.scrollToElement(CaseownerTF, Caseowner);
		CaseownerTF.sendKeys(Caseowner);
		
	}

	public void selectPriorityBox(String Priority) {
		su.selectByvalue(PriorityBox, Priority);
		
	}

	public void enterAppidTF(String Appid) {
		AppidTF.sendKeys(Appid);
		
	}

	public void enterNameTF(String Name) {
		NameTF.sendKeys(Name);
	
	}

	public void enterEmailidTF(String Emailid) {
		EmailidTF.sendKeys(Emailid);
		
	}

	public void enterContactnumberTF(String Contact) {
		ContactnumberTF.sendKeys(Contact);
		
	}

	public void selectLocationBox(String location) {
		su.selectByvalue(LocationBox, location);
		
	}

	public void selectTypeBox(String type) {
		su.scrollToElement(TypeBox, type);
		su.selectByvalue(TypeBox, type);
		
	}

	public void enterAgeTF(String Age) {
		su.scrollToElement(AgeTF, Age);
		AgeTF.sendKeys(Age);
	}

	public void selectCasecategoryBox(String Casecategory) {
		su.selectByvalue(CasecategoryBox, Casecategory);
		
	}

	public void clickSavebutton() {
		su.scrollToElement(Savebutton, "save");
		Savebutton.click();
		
		
	}
	
	
	
	
	
	
	
	

}
