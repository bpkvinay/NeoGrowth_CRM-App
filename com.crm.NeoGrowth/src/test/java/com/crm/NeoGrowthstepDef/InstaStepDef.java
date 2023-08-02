package com.crm.NeoGrowthstepDef;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.Pojo.LeadCreation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;


public class InstaStepDef extends Driver {
	static Driver d= new Driver();
	SeleniumUtility sel = new SeleniumUtility();
	LeadCreation lc= new LeadCreation(driver);
	
	
	static long rand = d.randomnumber(50000);
	static	String vg=String.valueOf(rand);
	static String num = "95421"+vg;
	 static  String leadId;
	 String query="select id from leads where phone_mobile='"+num+"'";

	@When("Enter Mobile Number")
	public void enter_mobile_number() throws InterruptedException {
   //	lc.getOTP();
		driver.findElement(By.xpath("(//input[@id=\"mobile-number\"])[1]")).sendKeys(num);
	Thread.sleep(1000);
		System.out.println(num);
        

        driver.findElement(By.xpath("(//input[@id='agreement'])[1]")).click();

        driver.findElement(By.xpath("(//button[@id=\"submit\"])[1]")).click();
        
        Reporter.log(num);
        
	}

	@Then("get successful message popup")
	public void get_successful_message_popup() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("Enter OTP")
	public void enter_otp() {
     lc.enterOTP();
	}
	
	@Then("Landing into quick eligibility check page should be displayed")
	public void landing_into_quick_eligibility_check_page_should_be_displayed() {
	    
	}
	
	@Then("Fetch the lead ID from Insta API")
		public void Fetch_the_lead_ID_from_Insta_API() {
		Response response = RestAssured.given()
		          .baseUri("https://crm2_0uat.neogrowth.in")
		          .body("{\r\n"
		                  + "  \"lead_id\": \""+leadId+"\"\r\n"
		                  + "}")
		          .headers("REQUESTEDMODULE", "Lead", "REQUESTEDMETHOD", "Fetch", "Content-Type", "application/json;charset=utf-8","Accept", "application/json, text/plain, application/json",
		          		"Authorization", "BasicTkczOTU6V2VsY29tZUAxMjM=","User-Agent", "PostmanRuntime/7.32.2","Accept-Language", "en-US","Cache-Control", "no-cache",
		          		"AUTHORIZEDAPPLICATION","N30gr0wth")
		          .when().log().all().get("/index.php?entryPoint=crmapi")
		          .then().log().all().assertThat().statusCode(200).extract().response();

	  String responseBody = response.jsonPath().getString("Leads[0].channel_source");
		  System.out.println(responseBody);
		  
		     }
		
		
	

	@Then("Enter {string} {string}")
	public void enter(String string, String string2) {
	lc.enterpincodeandemailid(string, string2);
	}

	@Then("click on Next button")
	public void click_on_next_button() {
	   lc.clickNextButton();
	}

	@Then("user should lands to business pan quick eligibility check page")
	public void user_should_lands_to_business_pan_quick_eligibility_check_page() {
		
	}

	@Then("Enter {string}")
	public void enter(String string) {
	    lc.enterpan(string);
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
	
	@Then("Enter the value into pincode {string}")
	public void enter_the_value_into_pincode(String string) {
		
//		driver.findElement(By.xpath("(//input[@placeholder='Enter here'])[5]")).sendKeys("560040");
//		driver.findElement(By.xpath("//button[text()='Next']")).click();
		lc.enterpincode(string);
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
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("vinay.gaonkar");
	    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("India@12345");
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
	
	@Given("AddLeadAPI Payload with {string}")
	public void add_lead_api_payload_with(String string) throws IOException { 
		
		
}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
	    
		
	
	}
	@Then("the call Payload with {string} {string}")
	public void the_call_payload_with(String string, String string2) throws IOException {
		
	}

	@Then("calls endpoint {string} with {string} http request")
	public void calls_endpoint_with_http_request(String string, String string2) {
		
	}

	@Then("verifyOTP call got success with status code {int}")
	public void verify_otp_call_got_success_with_status_code(Integer int1) {
		
	}
	@Given("AddLeadAPI Payload with register numebr first")
	public void add_lead_api_payload_with_register_numebr_first() 
	{
		RestAssured.baseURI="https://uat.advancesuite.in:3071";
		 Response respo = given().header("Content-Type","application/json").body("{\r\n"
				+ "  \"mobile\": \""+num+"\"\r\n"
				+ "}")
		 .when().log().all().post("/api/v2/otp")
		.then()
		.assertThat().statusCode(200).extract().response();
    String msg= respo.jsonPath().getString("message");
    System.out.println(msg); 
    }
	

	@Then("addotpAPI Payload with succefully OTP")
	public void addotp_api_payload_with_succefully_otp() {
		RestAssured.baseURI="https://uat.advancesuite.in:3071/api/v2/register";
   	 String requestBody = "{ \"mobile\": \""+num+"\", \"otp\": \"123456\", \"lead_source\": \"Marketing\" }";

		  Response respo1 = given().headers("Content-Type","application/json","User-Agent","PostmanRuntime/7.32.3","Accept","*/*")
				  .body(requestBody)
		      .when().log().all().post()
		      .then().assertThat().statusCode(200)
		        .extract().response();
	  leadId = respo1.jsonPath().getString("data.lead.crm_lead_id");
	  System.out.println(num);
 System.out.println(leadId);
 }
	
	@Then("Call CRMAPI with leadID while generated From InstathroughMobileNumber")
	public void call_crmapi_with_lead_id_while_generated_from_instathrough_mobile_number() {
		String leadidfetch =
				"{\r\n"
		+ "\"lead_id\":\""+leadId+"\"\r\n"
		+ "}";
		Response response = RestAssured.given()
		          .baseUri("https://crm2_0uat.neogrowth.in")
		          .body(leadidfetch)

		          .headers("REQUESTEDMODULE", "Lead", "REQUESTEDMETHOD", "Fetch", "Content-Type", "application/json;charset=utf-8","Accept", "application/json, text/plain, application/json",
		          		"Authorization", "BasicTkczOTU6V2VsY29tZUAxMjM=","User-Agent", "PostmanRuntime/7.32.2","Accept-Language", "en-US","Cache-Control", "no-cache",
		          		"AUTHORIZEDAPPLICATION","N30gr0wth")
		          .when().log().all().get("/index.php?entryPoint=crmapi")
		
	  // RestAssured.baseURI="https://crm2_0uat.neogrowth.in/";
	   //Response response = given().headers("Content-Type","application/json").body(leadidfetch)
	  // .when().log().all().get("index.php?entryPoint=crmapi")
	   .then().assertThat().statusCode(200).extract().response();
	  String leadsource = response.jsonPath().getString("Leads[0].lead_source");
	  String phonemobile= response.jsonPath().getString("Leads[0].phone_mobile");
	  String productC=  response.jsonPath().getString("Leads[0].product_c");
	  String sourceType= response.jsonPath().getString("Leads[0].source_type");
	  String channel_source=response.jsonPath().getString("Leads[0].channel_source");
	  System.out.println(leadsource);
	  System.out.println(phonemobile);
	  System.out.println(productC);
	  System.out.println(sourceType);
	  System.out.println(channel_source);
	  Assert.assertEquals("Marketing", leadsource);
	  Assert.assertEquals(num, phonemobile);
	  Assert.assertEquals("Insta Express Digital", productC);
	  Assert.assertEquals("NeoCash Insta", sourceType);
	  Assert.assertEquals("Insta", channel_source);
	
	}
	
	@Then("Verify LeadID from database by putting mobilenumber")
	public void verify_lead_id_from_database_by_putting_mobilenumber() throws SQLException, IOException {
		
		sel.mysqlconnector();
		  String DBLeadID  = sel.executequery(query,"id");
		Assert.assertEquals(DBLeadID, leadId);
		System.out.println(DBLeadID);
		System.out.println(leadId);
		
		
	}
}

