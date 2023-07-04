@cases
Feature: Cases Module 

 Background: Background Feature
  
   Given User enters Username and password and click on the Login Btn
   When Mouse move over all sticky menu
  
   Scenario: Validate Edited details should be update in cases page, user edit details and click on save button 
    When click on the cases module link
    Then View Cases Page Should be Display
    When User Click on Pencil Icon
    And Entering the value in TATDaysTF <Tatdaysvalue>
    And Click on Case Category dropdown and select <Casecategory> option
    And Click on Case Sub Category dropdown and select <Casesubcategory> option
    And Click on Case Details dropdown and select <Casedetails> option
    Then User Scrolldown click SaveBtn 
    
    Examples:
   |Tatdaysvalue|Casecategory|Casesubcategory|Casedetails|
   |1234567     |Legal       |Withdrawal of Legal/Arbitration|Loan Closed|
    
 
   Scenario: Verify the Search Result when user Click on Filter Icon (Advance Filter Tab)
   When Click on CasesModule Link
   When Click on the Filter Icon
   And Click on the AdvanceFilter button
   And Enter the Value in NumberTF <Number>
   And Enter the value in SubjectTF <Subject>
   And Select the value from Statusbox <Status> 
   And Select the value from AssignedtoBox <Assignedto> 
   And Enter the value in CaseownerTF <Caseowner>
   And Select the value in PriorityBox <Priority>
   And Enter the value in AppidTF <Appid>
   And Enter the  value in NameTF <Name>
   And Enter the value in EmailidTF <Emailid>
   And Enter the value in ContactTF <Contact>
   And Enter the value in LocationTF <Location>
   And Select the value in TypeBox <Type>
   And Enter the value in AgeTF <Age>
   And Select the value in CasecategoryBox <Casecategory>
   And Select the value in EmailsourceBox <Emailsource>
   When User ScrollDown and Click on Save button 
   Then Search Result should be display <SearchResult>
   
   Examples:

   |Number|Subject                                |Status     |Assignedto              |Caseowner               |Priority|Appid |Name         |Emailid            |Contact   |Location   |Type   |Age|Casecategory|Emailsource          |SearchResult|
   |342557|TDS Refund – 111111 - DONT USE THIS- PF|In_progress|Priyanka Mukund Khairnar|Priyanka Mukund Khairnar|P1      |123123|ROHAAN SHARMA|khataljay@gmail.com|9484646494|bhubaneswar|request|0  |legal       |helpdesk@neogrowth.in|ROHAAN SHARMA|
  
  
   
  
