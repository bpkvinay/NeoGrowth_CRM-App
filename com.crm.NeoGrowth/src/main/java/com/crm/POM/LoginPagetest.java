package com.crm.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericUtilis.Driver;
  


public class LoginPagetest extends Driver{
	//Driver driver;
	//WebDriver driver;
	@FindBy(name="username")
	private  WebElement UserTF;
	
	@FindBy(name="password")
	private WebElement PasswordTF;
	
	@FindBy(className = "button")
	private WebElement LoginBtn;

	
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
	
//	public void getusername() {
//		UserTF.sendKeys("vinay");
//	}
//	
//	public void getpass() {
//		PasswordTF.sendKeys("dhsgf");
//	}
//	public void click() {
//		LoginBtn.click();
//	}
	
	//Business lib
	public void loginpage() {
		UserTF.sendKeys("Pavan.Joshi");
	    PasswordTF.sendKeys("Haveri@1234");
		LoginBtn.click();
	}

}
