package com.crm.Pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;

public class LeadCreation extends Driver {
	
	
   @FindBy(xpath="(//input[@id='mobile-number'])[1]")
   private WebElement InstaMobileNumberTF;
   
   @FindBy(xpath="(//input[@id='agreement'])[1]")
   private WebElement AgreementCheckbox;
   
   @FindBy(xpath="(//button[@id='submit'])[1]")
   private WebElement SubmitButton;
   
   
   @FindBy(xpath="(//input[@type=\"number\"])[1]")
		   private WebElement OTP1stBOx;
   
   @FindBy(xpath="(//input[@type=\"number\"])[2]")
   private WebElement OTP2ndBOx;
   
   @FindBy(xpath="(//input[@type=\"number\"])[3]")
   private WebElement OTP3rdBOx;
   
   @FindBy(xpath="(//input[@type=\"number\"])[4]")
   private WebElement OTP4thBOx;
   
   @FindBy(xpath="(//input[@type=\"number\"])[5]")
   private WebElement OTP5thBOx;
   
   @FindBy(xpath="(//input[@type=\"number\"])[6]")
   private WebElement OTP6thBOx;
   
   @FindBy(xpath="(//button[@id='submit-verify-otp'])[1]")
   private WebElement verifybutton;
   
   @FindBy(xpath="//input[@placeholder='Eg., 560078']")
   private WebElement pincodeTF;
   
   @FindBy(xpath="//input[@placeholder='Enter here']")
   private WebElement EmailIDTF;
   
   @FindBy(xpath="//button[text()='Next']")
   private WebElement NextButton;
	 
   public LeadCreation(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   public void getOTP() {
	   InstaMobileNumberTF.sendKeys(getrandomnumber());
	   AgreementCheckbox.click();
	   SubmitButton.click();
   }
   
   public void enterOTP() {
	   OTP1stBOx.sendKeys("1");
	   OTP2ndBOx.sendKeys("2");
	   OTP3rdBOx.sendKeys("3");
	   OTP4thBOx.sendKeys("4");
	   OTP5thBOx.sendKeys("5");
	   OTP6thBOx.sendKeys("6"); 
	   verifybutton.click();
	   
   }
   
   public void enterpincodeandemailid(String Pin,String gmailID) {
	   pincodeTF.sendKeys(Pin);
	   EmailIDTF.sendKeys(gmailID);
	   
   }
   
   public void enteronlypincode(String Pin) {
	   
   }
   
   public void clickNextButton() {
	   NextButton.click();
   }
   
}
