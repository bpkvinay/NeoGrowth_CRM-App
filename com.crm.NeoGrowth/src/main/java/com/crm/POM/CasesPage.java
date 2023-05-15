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

}
