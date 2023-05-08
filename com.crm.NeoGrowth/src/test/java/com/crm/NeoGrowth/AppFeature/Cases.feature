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
   
   
   

  Scenario: Validate Massupdate Should be update in cases and click update button
  When Click On Cases Checkbox 
  And User Click on bulkaction Dropdown and select <Bulkaction> option
  And User Scrolldown Click on Priority dropdown and select <Priority> option
  And Click on CasecategoryDD and select <CasecategoryValue> option
  And Click on CaseSubcategoryDD and select <CaseSubcategoryValue> option
  And Click on CaseDetailDD and select <CaseDetailsValue> option
  And User Scrolldown Click updateBtn
  Then View Update Popup should be display
  And User Scrolldown click OKbtn


