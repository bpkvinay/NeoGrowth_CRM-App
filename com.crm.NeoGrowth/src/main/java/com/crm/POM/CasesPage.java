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
	private WebElement caseslink;

	@FindBy(xpath = "//table/tbody/tr[1]/td[2]/a")
	private WebElement PencilLink;
	
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
	 
	public WebElement getCaseslink() {
		return caseslink;
	}

	public WebElement getPencilLink() {
		return PencilLink;
	}

	public WebElement getTatDaysTF(String Tatdaysvalue) {
		TatDaysTF.clear();
		TatDaysTF.sendKeys(Tatdaysvalue);
		return TatDaysTF;
	}

	public void getCaseCategoryDropdown(String subcategoryvalue) {
		su.selectByText(CaseCategoryDropdown, subcategoryvalue);
		
		
	}

	public void getCaseSubCategoryDropdown(String Casesubvalue) {
		
		su.selectByText(CaseSubCategoryDropdown, Casesubvalue);
	}

	public void getCaseDetailsDropdown(String Casedetailvalue) {
		su.selectByText(CaseDetailsDropdown, Casedetailvalue);
		
	}

	public void getSaveButton() {
		su.scrollToElement(SaveButton, "savebtn");
		SaveButton.click();
		
	}
}
