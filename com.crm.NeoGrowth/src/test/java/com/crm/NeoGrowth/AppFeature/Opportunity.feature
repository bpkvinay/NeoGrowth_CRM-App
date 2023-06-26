@opportunity @test
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
        And select the CC Sub-Disposition from <CC Sub Disposition> Drop Down
        And select the CAM Opportunity Status from <CAM Opportunity Status> Drop Down
        And select the CAM Opportunity Sub Status auto updated with respect to opportunity status
        And scroll Down the page and click on the save button 
        Then User page should be upadted
          
        Examples:
        |opportunityname           |loanamount|pickupcity|CC Status|CC Disposition     |CC Sub Disposition                   |CAM Opportunity Status|
        |Royal                     |20000     |VIJAYWADA |Connect  |Connect_existing_cm|Connect_existing_cm_existing_customer|Follow up             |
        
        
        
    @EditPageBasicModuleFullRegression 
    Scenario Outline: verify opportunity user edit page All elements
     When click on the Edit icon
     Then User edit page should be displayed
     When Enter the opportunity name into <opportunityname> TF
     And Enter the loan amount into <loanamount> TF 
     And pick the date from <Pickup appointment Date/Time> and <h> date popup
     And pick the time from <Pickup appointment Time/hours> Time/hours Drop Down
     And pick the time from <Pickup appointment Time min> Time/min Drop Down
     And Enter the address into <Pickup appointment address> TF
     And select the Pickup/appointment city from <pickupcity> Drop Down
     And select the serviceable from <Servicable> Drop Down
     And Enter the  feedback into <Pickup appointment feedback> TF
     And select the CC Status from <CC Status> Drop Down
     And select the CC Disposition from <CC Disposition> Drop Down
     And select the CAM Opportunity Status from <CAM Opportunity Status> Drop Down
     And Enter the Pickup/ appointment allocated to into <Pickup appointment allocated to> TF and clear TF
     And click on the select user icon new window open and scroll down window and select allocated to name from select user page 
     And Enter the Lead Description into <Lead Description> TF
     And select the inbound insta callback value from <Inbound Insta Callback> Drop Down
     And Enter the Business /Trading Name into <Business Name> TF
     And Enter the Loan Amount Disbursed into <Loan Amount Disbursed> TF
     And Enter the Loan Amount Sanctioned into <Loan Amount Sanctioned> TF
     And Enter the Pickup/appointment Contact Number into <Pickup appointment Contact Number> TF
     And Enter the Pickup/ appointment pin code into <Pickup appointment pin code> TF
     And Enter the Business Vintage into <Business Vintage> TF
     And Enter the Remarks into <Remarks> drag Text box
     And select the value from CC Agent Name <CC Agent Name> Drop Down
     And select the value from CC Sub-Disposition <CCSubDisposition> Dropdown
     And select the CAM Opportunity Sub Status auto updated with respect to opportunity status
     And select the value from Average card sales per month <Average card sales per month> Drop Down
     And Enter the CC Remark into <CC Remark> TF
     And Click on the Auto Assign To CAM check box 
     And Enter the Channel Source into <Channel Source> TF 
     And scroll Down the page and click on the save button
     Then opportunity User page should be Updated and visible updated page 
     
     Examples:
|Pickup appointment Date/Time|h |Pickup appointment Time/hours|Pickup appointment Time min|Pickup appointment address|Servicable|Pickup appointment feedback|Pickup appointment allocated to|Lead Description                                                                         |Inbound Insta Callback|Business Name           |Loan Amount Disbursed|Loan Amount Sanctioned|Pickup appointment Contact Number|Pickup appointment pin code|Business Vintage|Remarks         |CC Agent Name   |Average card sales per month|CC Remark |Channel Source|opportunityname|loanamount|pickupcity|CC Status  |CC Disposition                      |CCSubDisposition|CAM Opportunity Status|
|    May 2024                |12|          12                 |      15                   |   Bangalore              | true     |Post Appointment Feedback  |Ramachandra Bande              |lead (Pb), a soft, silvery white or grayish metal in Group 14 (IVa) of the periodic table|yes                   |pvn technologies pvt Ltd|100000               |     99999            |9845213456                       |560045                     |2               |Coustmer is Good|vijaylaxmi.kahar|More than 2 Lakhs           |Client God|Insta         |Royal          |20000     |VIJAYWADA |Connect    |Connect_existing_cm                 |1               |Follow up             |             
|June 2025                   |15|10                           |30                         |Mumbai                    |false     |appointment done           |ViratRaj                       |Lead will handle whole team with guidlines                                               |no                    |pvn_vbr insta  tech ltd |10000                |      999             |9972321432                       |560025                     |4               |customer is imp |arvind.gupta    |Less than one lakh          |Soon open |cust app      | pavan         |25000     |CHENNAI |not_connect|not_connect_notconnected_callcenter   |5               |   documents          |     
     
     #@homepageverification
     #Scenario: Verify the major sticky menu
     #When user verifies the below sticky menu headers
     #|SALES|
     #|MARKETING|
     #|SUPPORT|
     #|ACTIVITIES|
     #|COLLABORATION|
     #|ALL|
     
   @EditpageOtherspageFullRegression
   Scenario: Verify the opportunity Other page All elements
   When click on the Edit icon
   Then User edit page should be displayed
    When Enter the opportunity name into <opportunityname> TF 
    And Enter the loan amount into <loanamount> TF
    And select the Pickup/appointment city from <pickupcity> Drop Down 
    And select the CC Status from <CC Status> Drop Down
    And select the CC Disposition from <CC Disposition> Drop Down
    And select the CC Sub-Disposition from <CC Sub Disposition> Drop Down
    And select the CAM Opportunity Status from <CAM Opportunity Status> Drop Down
    And select the CAM Opportunity Sub Status auto updated with respect to opportunity status
    #//Other Page
    And select value from <Sales Stage> DD
    #And select value from <Opportunity Sub-Status> DD
    And Select value from <Type> DD
    And Enter the value into <Scheme> TF
    And Enter the value into <DSA Code> TF
    And Enter the value into <Advanced Suite ID> TF
    And Enter the value into <CONTROL PROGRAM> TF
    And Enter the value into <Product Type> TF
    And Enter the value into <Seller ID on Online Marketplace /Platform> TF
    And Enter the value into <Seller's Partner Rating on Online Marketplace /Platform> TF
    And Enter the valure into <Partner Id> TF
    And Enter the value into <Industry> TF
    And Enter the value into <Referral Agent ID> TF
    And Select the date from <Escalation Time> date icon and select value from <Hours> DD and <Min> DD
    And Select the value from <Business Vintage(Base cap minimum 2 years to maximum 50 years)> DD
    And Select the value from <Shop has cemented roof> DD
    And Select the value from <Pitch for Accelerator program> DD
    And Select the value from <House Status> DD
    And Enter the value into <Campaign Id> TF 
    And Enter the value into <Campaign Medium> TF
    And Enter the value into <Campaign Source> TF
    And Select the Date From <Birthdate> calender icon 
    And Enter the <Purpose of Loan Master ID> TF
    And Enter the value into <Consent> TF
    And Select the value From <Opportunity Status> DD
    And Select the value From <Alliance Opportunities Status> DD
    And Select the value From <Pre Operations Status> DD
    And Select the value into <Alliance Lead Docs shared> TF
    And Select the value From <Lead Source> DD
    And Enter the value into <Application ID> TF
    And Enter the value From <Digital> DD
    And Enter the value into <Product> TF
    And Enter the value into <Seller's Customer Rating on Online Marketplace /Platform> TF
    And Enter the value into <Average monthly sales for last 3 months> TF
    #And Enter the value into <Escalation name> TF //Text box not visible when editing enable
    And Enter the value into <Escalation_To> TF
    And Select the value from <Business License> DD
    And Select the value from <Any EMI bounce in last 6 months> DD
    And Select the value from <Nature of Business> DD
    And Select the value from <Shop Status> DD
    And Enter the value into <Campaign Name> TF
    And Enter the value into <Campaign Content> TF
    And Enter the value into <Campaign Term> TF
    And Enter the value into <PAN No> TF
    And Enter the value into <Business Vintage Years> TF
    And Enter the value into <Email> TF
    Then validate data saved successfully
    
     
  
