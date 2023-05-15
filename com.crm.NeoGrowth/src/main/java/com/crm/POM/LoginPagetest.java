package com.crm.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
  


public class LoginPagetest extends Driver{
	SeleniumUtility su= new SeleniumUtility();
	Driver dr=new Driver();
	@FindBy(name="username")
	private  WebElement UserTF;
	
	@FindBy(name="password")
	private WebElement PasswordTF;
	
	@FindBy(className = "button")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//span[@class='globallabel-user']")
	private WebElement Logoutbtn;
	
	@FindBy(xpath="//ul[@aria-labelledby='with-label']//a[@id='logout_link']")
    private WebElement LogoutLink;
	
	public LoginPagetest(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	
	public WebElement getUserTF() {
		return UserTF;
				
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public void loginpage() throws IOException {
		
		UserTF.sendKeys(dr.readConfig("UserName"));
		PasswordTF.sendKeys(dr.readConfig("Password"));
		LoginBtn.click();
		
	}
   
	public void Logout() {
		su.moveToElement(Logoutbtn);
		LogoutLink.click();
	}
}
