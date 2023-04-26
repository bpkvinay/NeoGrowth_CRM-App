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
	
	@FindBy(xpath="//select[@id='massassign_group']")
	private WebElement MassAssignGroupDrown;
	
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	private WebElement checkboxbtn;
	
	
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
}