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
        
        
        
    
    Scenario: verify opportunity user edit page All elements
     When click on the Edit icon
     Then User edit page should be displayed
     When Enter the opportunity name into <opportunityname> TF
     And Enter the loan amount into <loanamount> TF 
     And pick the date from <Pickup/appointment Date/Time> date popup
     And pick the time from <Pickup/ appointment Time/hours> Time/hours Drop Down
     And pick the time from <Pickup/ appointment Time> Time/min Drop Down
     And Enter the address into <Pickup/appointment address> TF
     And select the Pickup/appointment city from <pickupcity> Drop Down
     And select the serviceable from <Servicable> Drop Down
     And Enter the  feedback into <Pickup/ appointment feedback> TF
     And select the CC Status from <CC Status> Drop Down
     And select the CC Disposition from <CC Disposition> Drop Down
     And select the CAM Opportunity Status from <CAM Opportunity Status> Drop Down
     #And Enter the Pickup/ appointment allocated to into <Pickup/ appointment allocated to> TF and clear TF
     #And click on the select user icon new window open and scroll down window <select allocated to name> select user name
     #And Enter the Lead Description into <Lead Description> TF
     #And select the inbound insta callback value from <Inbound Insta Callback> Drop Down
     #And Enter the Business /Trading Name into <Business /Trading Name> TF
     #And Enter the Loan Amount Disbursed into <Loan Amount Disbursed> TF
     #And Enter the Loan Amount Sanctioned into <Loan Amount Sanctioned> TF
     #And Enter the Pickup/appointment Contact Number into <Pickup / appointment Contact Number> TF
     #And Enter the Pickup/ appointment pin code into <Pickup/ appointment pin code> TF
     #And Enter the Business Vintage into <Business Vintage> TF
     #And Enter the Remarks into <Remarks> drag Text box
     #And select the value from CC Agent Name <CC Agent Name> Drop Down
     And select the value from CC Sub-Disposition <CC Sub-Disposition> Drop Down
     And select the CAM Opportunity Sub Status auto updated with respect to opportunity status
     #And select the value from Average card sales per month <Average card sales per month> Drop Down
     #And Enter the CC Remark into <CC Remark> TF
     #And Click on the Auto Assign To CAM check box 
     #And Enter the Channel Source into <Channel Source> TF
     And scroll Down the page and click on the save button
     Then opportunity User page should be Updated and visible updated page 
     
    
     
     #@homepageverification
     #Scenario: Verify the major sticky menu
     #When user verifies the below sticky menu headers
     #|SALES|
     #|MARKETING|
     #|SUPPORT|
     #|ACTIVITIES|
     #|COLLABORATION|
     #|ALL|

     
  
