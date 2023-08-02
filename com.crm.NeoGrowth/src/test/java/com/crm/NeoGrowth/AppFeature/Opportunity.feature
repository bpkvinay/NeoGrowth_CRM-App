@opportunity
Feature: opportunity Module
 
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
  
  
  @sanity   @massAssignGroupDropDown   
  Scenario Outline: Verify the remove opportunity
        When User Should select one opportunity
        Then User select <option> from massassignGroupDown dropdown
        Then user scroll and click on remove button
        And Click Ok button from alert popup
        Then opportunity should be deleted
     
     Examples:  
     |option|
     |Alliance telecallers|  
     
     
      @EditPageMandatoryFields
        
        Scenario: verify opportunity User Edit Page
        When click on the Edit icon
        Then User edit page should be displayed
        When Enter the opportunity name into <opportunityname> TF 
        And Enter the loan amount into <loanamount> TF
        And select the Pickup/appointment city from <pickupcity> Drop Down 
        And select the CC Status from <CC Status> Drop Down
        And select the CC Disposition from <CC Disposition> Drop Down
        And select the CC Sub-Disposition from <CC Sub-Disposition> Drop Down
        And select the CAM Opportunity Status from <CAM Opportunity Status> Drop Down
        And select the CAM Opportunity Sub Status auto updated with respect to opportunity status
        And scroll Down the page and click on the save button 
        Then User page should be upadted
          
        Examples:
        |opportunityname           |loanamount|pickupcity|CC Status|CC Disposition     |CC Sub-Disposition                   |CAM Opportunity Status|
        |Royal                     |20000     |VIJAYWADA |Connect  |Connect_existing_cm|Connect_existing_cm_existing_customer|Follow up             |
        
        
        


     
  
