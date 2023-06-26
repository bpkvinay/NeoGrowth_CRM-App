package com.crm.NeoGrowthstepDef;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class InstaStepDef extends Driver {
	Driver d=new Driver();
	SeleniumUtility sel=new SeleniumUtility();
	
	@When("Enter Mobile Number")
	public void enter_mobile_number() {
    	long rand = d.randomnumber(500000);
		String vg=String.valueOf(rand);
		String num = "95421"+vg;
    	System.out.println(num);
		   driver.findElement(By.xpath("(//input[@id=\"mobile-number\"])[1]")).sendKeys(num);
		     
		 			   driver.findElement(By.xpath("(//input[@id='agreement'])[1]")).click();
		 			   driver.findElement(By.xpath("(//button[@id=\"submit\"])[1]")).click();
	}
    	
    	
	
	   
	

	@Then("get successful message popup")
	public void get_successful_message_popup() {
		WebElement flashMessage = driver.findElement(By.xpath("//div[text()='OTP sent successfully']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(flashMessage));
		String flashMessageText = flashMessage.getText();
		System.out.println(flashMessageText);
		Assert.assertEquals(flashMessageText, "OTP sent successfully");
		
	}

	@When("Enter OTP")
	public void enter_otp() {
		 driver.findElement(By.xpath("(//input[@type=\"number\"])[1]")).sendKeys("1");
		 driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("2");
		 driver.findElement(By.xpath("(//input[@type=\"number\"])[3]")).sendKeys("3");
		 driver.findElement(By.xpath("(//input[@type=\"number\"])[4]")).sendKeys("4");
		 driver.findElement(By.xpath("(//input[@type=\"number\"])[5]")).sendKeys("5");
		 driver.findElement(By.xpath("(//input[@type=\"number\"])[6]")).sendKeys("6");
		 		 		 
	}

	
	@When("click on Verifying button")
	public void click_on_verifying_button() {
		driver.findElement(By.xpath("(//button[@id=\"submit-verify-otp\"])[1]")).click();
	}

	@Then("Landing into quick eligibility check page should be displayed")
	public void landing_into_quick_eligibility_check_page_should_be_displayed() {
	    
	}
	
	@Then("Fetch the lead ID from Insta API")
		public void Fetch_the_lead_ID_from_Insta_API() {
		
//		RestAssured.given().baseUri("")
		
	}

	@Then("Enter {string} {string}")
	public void enter(String string, String string2) {
	    WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Eg., 560078']"));
	   pincode.sendKeys("560078");
	    WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter here']"));
	    email.sendKeys("neo123@gmail.com");
	}

	@Then("click on Next button")
	public void click_on_next_button() {
	    driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	@Then("user should lands to business pan quick eligibility check page")
	public void user_should_lands_to_business_pan_quick_eligibility_check_page() {
		
	}

	@Then("Enter {string}")
	public void enter(String string) {
	    WebElement PanNumber = driver.findElement(By.xpath("//input[@placeholder='XXXXX0000X']"));
	    PanNumber.sendKeys("CBKPS6194L");
	}

	@Then("click on correct button")
	public void click_on_correct_button() {
	    driver.findElement(By.xpath("//button[text()='Correct']")).click();
	    
	}

	@Then("click on the close button")
	public void click_on_the_close_button() {
		 driver.findElement(By.xpath("//button[text()='Close']")).click();
	}

	@Then("click on the Next button")
	public void click_on_the_next_button() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	@Then("Landing into What is your Occupation page")
	public void landing_into_what_is_your_occupation_page() {
	    
	}

	@Then("Click on the business information")
	public void click_on_the_business_information() {
	   driver.findElement(By.xpath("//p[text()='Business Owner']")).click();
	}

	@Then("click on the Type of business")
	public void click_on_the_type_of_business() {
		driver.findElement(By.xpath("//p[text()='Books and Stationary']")).click();
	}

	@Then("select Drop down value from How old is your Business DD")
	public void select_drop_down_value_from_how_old_is_your_business_dd() {
		WebElement dd = driver.findElement(By.xpath("//img[@alt='arrow']"));
		dd.click();
		driver.findElement(By.xpath("//input[@value='>36 months']")).click();
	  
	}

	@Then("Landing into Business Nature page")
	public void landing_into_business_nature_page() {
	    
	}

	@Then("Select your business nature from DD")
	public void select_your_business_nature_from_dd() {
	  WebElement natureDD = driver.findElement(By.xpath("//select[@class='px-4 py-3 w-full']")); 
	  sel.selectByvalue(natureDD, "1");
	  
	}

	@Then("click on the next button")
	public void click_on_the_next_button1() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	@Then("Landing into Do you have following registered Business documents? \\(Any {int}) page")
	public void landing_into_do_you_have_following_registered_business_documents_any_page(Integer int1) {
	    
	}

	@Then("click on the Business Document Either YES nor NO")
	public void click_on_the_business_document_either_yes_nor_no() {
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
	}
	
	@Then("Landing into What is your purpose of taking loan page")
	public void landing_into_what_is_your_purpose_of_taking_loan_page() {
	    
	}
	
	@Then("Select any one value from What is your purpose of taking loan page")
	public void select_any_one_value_from_what_is_your_purpose_of_taking_loan_page() {
	    driver.findElement(By.xpath("//p[text()='Expansion']")).click();
	    driver.findElement(By.xpath("//button[text()='Next']")).click();
	}
	
	@Then("Landing into Individual & Business KYC page")
	public void landing_into_individual_business_kyc_page() {
	    
	}

	@Then("Enter the value into Verify Your Business Details of <Registered Business Name>")
	public void enter_the_value_into_verify_your_business_details_of_registered_business_name() {
	    driver.findElement(By.xpath("//input[@name='business-name']")).sendKeys("NeoCash pvt ltd");
	}

	@Then("Enter the value into Verify Your Business Details of <Business Registration Date>")
	public void enter_the_value_into_verify_your_business_details_of_business_registration_date() {
	  driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).sendKeys("05/02/1993"); 
	}

	@Then("Enter the value into Verify Your Business Details of <Business Address>")
	public void enter_the_value_into_verify_your_business_details_of_business_address() {
	    driver.findElement(By.xpath("//input[@name='business-address']")).sendKeys("bangalore");
	}
	
	@Then("Enter the value into pincode")
	public void enter_the_value_into_pincode() {
		driver.findElement(By.xpath("(//input[@placeholder='Enter here'])[5]")).sendKeys("560078");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
	}

	@Then("KYC verification options page should be displayed")
	public void kyc_verification_options_page_should_be_displayed() {
//	    RestAssured.given().baseUri("https://crm2_0uat.neogrowth.in")
//	    .when().get("/index.php?entryPoint=crmapi").body("")
	}
	
	@When("Enter CRM URL launch CRM application")
	public void enter_crm_url_launch_crm_application() {
	  driver.get("https://crm2_0uat.neogrowth.in");
		
	}
	
	@When("Enter valid username and password click on the login btn")
	public void enter_valid_username_and_password_click_on_the_login_btn() {
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Pavan.Joshi");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Gadga@12345");
	    driver.findElement(By.xpath("//button[@class=\"button\"]")).click();
	    
	}
      

	@Then("verified Home page url")
	public void verified_home_page_url() {
	    
	}

	
	@Then("Click on the lead options")
	public void click_on_the_lead_options() {
	    
	}

	@Then("Verify lead details")
	public void verify_lead_details() {
	    
	}

	
	
	


}
