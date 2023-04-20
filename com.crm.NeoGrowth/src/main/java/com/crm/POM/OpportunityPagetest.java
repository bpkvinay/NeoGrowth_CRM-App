package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

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
	
   public void Clickopplink() throws InterruptedException
   {
	   oppurtnamelink.click();
	
   }
   public void scrollelement() {
	   sp.scrollToElement(Removebtn, "removebutton" );
	   Removebtn.click();
   }
    
   public String getExpectedTitle() {
	   String expectedtitle = ExpectedTitle.getText();
	   return expectedtitle;
   }
}
