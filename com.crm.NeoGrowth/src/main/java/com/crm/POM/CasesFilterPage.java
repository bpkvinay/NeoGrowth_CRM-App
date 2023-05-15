package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class CasesFilterPage extends Driver{
	
    SeleniumUtility su = new SeleniumUtility();
	
	@FindBy(xpath = "(//a[text()='Cases'])[3]")
	private WebElement CasesModuleLink;

	@FindBy (xpath = "(//a[@title='Filter'])[1]")
	private WebElement FilterIcon;
	
	@FindBy (xpath = "//a[text()='Advanced Filter']")
	private WebElement AdvanceFilterBtn;
	
	@FindBy(xpath="(//a[text()='Quick Filter'])[1]")
	private WebElement quickfiltertab;
	
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
	
	@FindBy (xpath = "//select[@id='email_source_c_advanced']")
	private WebElement EmailsourceBox;
	
	@FindBy (xpath = "//input[@id='search_form_submit_advanced']")
	private WebElement Savebutton;

	@FindBy(xpath = "//table/tbody/tr[1]/td[6]")
	private WebElement SearchResult;
		
	public CasesFilterPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement ClickCasesModuleLink() {
		return CasesModuleLink;
	}

	public WebElement ClickFilterIcon() {
		return FilterIcon;
	}
    
	public WebElement ClickAdvanceFilterBtn() {
		return AdvanceFilterBtn;
	}
	
	public void SwitchtoTab() {
		if (!quickfiltertab.getText().equalsIgnoreCase("Advanced Filter")){
			AdvanceFilterBtn.click();	
		}
		else {
			
			quickfiltertab.click();
   }
	}
	
	public void EnterNumberTF(String CaseNumber) {
		NumberTF.clear();
		NumberTF.sendKeys(CaseNumber);	
	}

	public void EnterSubjectTF(String CaseSubject) {
		SubjectTF.clear();
		SubjectTF.sendKeys(CaseSubject);	
	}

	public void SelectStatusBox(String Status) {	
		su.selectByvalue(StatusBox, Status);		
	}

	public void SelectAssignedtoBox(String Assignedto) {
		su.selectByText(AssignedtoBox, Assignedto);	
	}

	public void EnterCaseownerTF(String Caseowner) {	
		CaseownerTF.clear();
		CaseownerTF.sendKeys(Caseowner);
	}

	public void SelectPriorityBox(String Priority) {
		su.selectByvalue(PriorityBox, Priority);	
	}

	public void EnterAppidTF(String Appid) {
		AppidTF.clear();
		AppidTF.sendKeys(Appid);
	}

	public void EnterNameTF(String Name) {
		NameTF.clear();
		NameTF.sendKeys(Name);	
	}

	public void EnterEmailidTF(String Emailid) {
		EmailidTF.clear();
		EmailidTF.sendKeys(Emailid);	
	}

	public void EnterContactnumberTF(String Contact) {
		ContactnumberTF.clear();
		ContactnumberTF.sendKeys(Contact);	
	}

	public void SelectLocationBox(String Location) {
		su.selectByvalue(LocationBox, Location);	
	}

	public void SelectTypeBox(String Type) {
		su.selectByvalue(TypeBox, Type);	
	}

	public void EnterAgeTF(String Age) {
		AgeTF.clear();
		AgeTF.sendKeys(Age);	
	}

	public void SelectCasecategoryBox(String Casecategory) {
		su.selectByvalue(CasecategoryBox, Casecategory);
	}
    
	public void SelectEmailsourceBox(String Emailsource) {
	    su.selectByvalue(EmailsourceBox, Emailsource);
    }

	public void ClickSavebutton() {
		su.scrollToElement(Savebutton, "savebtn");
		Savebutton.click();	
	}	
	
	public String getSearchResult() {
		String actual = SearchResult.getText();
		return actual;	
	}
}
