@insta
Feature: Insta Application


  Scenario Outline: Enter the mobile number
    Given AddLeadAPI Payload with register numebr first
    Then addotpAPI Payload with succefully OTP
    And Fetch the lead ID from Insta API
    When Enter Mobile Number
    Then get successful message popup
    When Enter OTP
    Then Landing into quick eligibility check page should be displayed
    And Enter "<Pincode>" "<EmailID>"
    And click on Next button 
    Then user should lands to business pan quick eligibility check page 
    And Enter "<business PAN>" 
    And  click on correct button 
    And click on the close button
    And click on the Next button
    Then Landing into What is your Occupation page
    And Click on the business information
    And click on the Type of business
    And select Drop down value from How old is your Business DD
    And click on the Next button
    Then Landing into Business Nature page
    And  Select your business nature from DD
    And  click on the next button 
    Then Landing into Do you have following registered Business documents? (Any 1) page 
    And click on the Business Document Either YES nor NO
    Then Landing into What is your purpose of taking loan page 
    And Select any one value from What is your purpose of taking loan page
    And click on the Next button
    Then Landing into Individual & Business KYC page
    And Enter the value into Verify Your Business Details of <Registered Business Name>
    And Enter the value into Verify Your Business Details of <Business Registration Date> 
    And Enter the value into Verify Your Business Details of <Business Address>
    And Enter the value into pincode
    And click on the Next button 
    Then KYC verification options page should be displayed
    When Enter CRM URL launch CRM application
    Then verified Home page url
    When Enter valid username and password click on the login btn
    Then Click on the lead options 
    And Verify lead details
    Then Call CRMAPI with leadID while generated From InstathroughMobileNumber
    
    Examples:
    |Pincode|EmailID|
    |560078|vg@gmail.com|
