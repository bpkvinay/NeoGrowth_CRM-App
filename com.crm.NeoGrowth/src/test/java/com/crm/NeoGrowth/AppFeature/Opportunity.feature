
Feature: Opportunity Feature
 
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
  
  
  @sanity      
  Scenario Outline: Verify the remove opportunity
        When User Should select one opportunity
        Then User select <option> from massassignGroupDown dropdown
        Then user scroll and click on remove button
        And Click Ok button from alert popup
        Then opportunity should be deleted
     
     Examples:  
     |option|
     |Alliance telecallers|  
     
     
      @editpage
        
        Scenario: verify opportunity User Edit Page
        When click on the Edit icon
        Then User edit page should be displayed
        When Enter the opportunity name into <opportunityname> TF 
        And Enter the loan amount into <loanamount> TF
        And select the Pickup/appointment city from <pickupcity> Drop Down
        And scroll the page and click on the save button
        
        Examples:
        |opportunityname           |loanamount|pickupcity|
        |Royal                     |20000     |VIJAYWADA |
        
    
  
