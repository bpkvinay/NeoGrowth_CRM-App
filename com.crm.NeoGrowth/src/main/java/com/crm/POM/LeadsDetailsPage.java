package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;

public class LeadsDetailsPage extends Driver{
	
	@FindBy(xpath="//span[contains(@class,\"suitepicon suitepicon-module-activities\")]")
	private WebElement ActivitiesLink;
	
	@FindBy(xpath="//a[text()='Create Task']")
	private WebElement CreatTaskActivitesBtn;
	
	@FindBy(xpath="//span[@class='suitepicon suitepicon-action-caret subhover']")
	private WebElement CreateTaskDropDownFromActivites;
	
	public LeadsDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickActivitiesLink() {
		ActivitiesLink.click();
	}

}
