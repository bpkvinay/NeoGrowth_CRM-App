
Feature: opportunity
 
  Background: Background Feature
  
  Given User enters Username and password and click on the Login Btn
   When Mouse move over all sticky menu
    And click on the opportunity module link
    

 
  Scenario: Verify opportunity home page
    Then opportunity Home page should be visible
    Then user scroll and click on remove button

  Scenario: Verify opprtunitydetails page
        When user clicked on firstuser name link 
        Then user should lands to opportunity details page 
        
        
    
  
