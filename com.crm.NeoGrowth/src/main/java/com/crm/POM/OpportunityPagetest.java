package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

public class OpportunityPagetest extends Driver{
	
	

	public SeleniumUtility sp=new SeleniumUtility();
	
	//WebDriver driver;
	@FindBy(xpath ="//a[@id='grouptab_5']")
	private WebElement AllStickymenu;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[2]")
	private WebElement OppLink;
	
	
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
	
//	public void clickAllTab() {
//		sp.moveToElement(AllStickymenu);
//		OppLink.click();
//	}
//	
}
