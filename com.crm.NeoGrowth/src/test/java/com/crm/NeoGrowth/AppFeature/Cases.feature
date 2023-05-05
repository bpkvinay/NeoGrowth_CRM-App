@cases
Feature: Cases Module 

 Background: Background Feature
  
  Given User enters Username and password and click on the Login Btn
   When Mouse move over all sticky menu
   
   
   Scenario: Validate Edited details should be update in cases page, user edit details and click on save button 
    When click on the cases module link
    Then View Cases Page Should be Display
    When User Click on Pencil Icon
    And Entering the value in TATDaysTF "<Tatdaysvalue>"
    And Click on Case Category dropdown and select <Casecategory> option
    And Click on Case Sub Category dropdown and select <Casesubcategory> option
    And Click on Case Details dropdown and select <Casedetails> option
    Then User Scrolldown click SaveBtn
    
    Examples:
   |Tatdaysvalue|Casecategory|Casesubcategory                |Casedetails|
   |9865432     |Legal       |Withdrawal of Legal/Arbitration|Loan Closed|
   
  

