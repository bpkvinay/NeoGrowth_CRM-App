
Feature: Leads Testcases
   
   Background: 
    Given User enters Username and password and click on the Login Btn
    When Mouse move over all sticky menu
    And click on the Leads module link
    Then Leads list page should be display
  
  
  @Smoke
  Scenario Outline: Validate Edited details should be update in Leads page,when user edit details and click on save button
    
    
    When Click on pencil edit link
    Then Edit page should be display
    When click on First name dropdown and select <FirstnamePrefix>
    And Enter the value in Firstname TF<Firsname>
    And Enter the value in Lastname TF<LastName>
    And Click on CC Status dropdown and select <CCStatus> option
    And Click on  CC dispostion dropdwon and select <CCDispostion> option
    And Click on CC Sub dispostion dropdown and select <CCSubDispostion> option
    And Click on CAM opprtunity status dropdown and select<CAMOpportunity> option
    And Enter any <Remarkvalue> CC remark TF
    And Click on CC agent name and select <CCAgentname>option
    When  User scroll and click on Save buttom
    Then User details should be updated and navigate from edit details page to updated deatils page.
    
  Examples: 
  |FirstnamePrefix|Firsname|LastName|CCStatus|CCDispostion  |CCSubDispostion                    |CAMOpportunity|Remarkvalue|CCAgentname|
  |Mr.           |India |  republic  |Connect |Connect_appointment_done |Connect_appointment_done_cam_to_visit_customer|Follow up     |  createleads |arvind.gupta|
  |Ms.|Loan|she|Connect|Connect_not_eligible|Connect_not_eligible_cibil_issue|documents|clearetask|sushma.jaiswar|
  
  
    @NegativeSmoke
    Scenario Outline: Verify the Error message when Entering Numeric and special characters in FirstNameTF
    When Click on pencil edit link
    Then Edit page should be display
    When click on First name dropdown and select <FirstnamePrefix>
    And Enter the value in Firstname TF<Firsname>
    And Enter the value in Lastname TF<LastName>
    And Click on CC Status dropdown and select <CCStatus> option
    And Click on  CC dispostion dropdwon and select <CCDispostion> option
    And Click on CC Sub dispostion dropdown and select <CCSubDispostion> option
    And Click on CAM opprtunity status dropdown and select<CAMOpportunity> option
    And Enter any <Remarkvalue> CC remark TF
    And Click on CC agent name and select <CCAgentname>option
    When  User scroll and click on Save buttom
    Then Should display the errromesssage <Errormessage> in FirstNameTF
    
    Examples:
    |FirstnamePrefix|Firsname|LastName|CCStatus|CCDispostion|CCSubDispostion|CAMOpportunity|Remarkvalue|CCAgentname|Errormessage|
    |Mr.|123$$!! |  kav  |Connect |Connect_appointment_done |Connect_appointment_done_cam_to_visit_customer|Follow up| Famous|arvind.gupta|First Name Should Contain Alphabets Only!|
  
  
   @NegativeSmoke
    Scenario Outline: Verify the Error message when Entering Numeric and special characters in LastNameTF
    When Click on pencil edit link
    Then Edit page should be display
    When click on First name dropdown and select <FirstnamePrefix>
    And Enter the value in Firstname TF<Firsname>
    And Enter the value in Lastname TF<LastName>
    And Click on CC Status dropdown and select <CCStatus> option
    And Click on  CC dispostion dropdwon and select <CCDispostion> option
    And Click on CC Sub dispostion dropdown and select <CCSubDispostion> option
    And Click on CAM opprtunity status dropdown and select<CAMOpportunity> option
    And Enter any <Remarkvalue> CC remark TF
    And Click on CC agent name and select <CCAgentname>option
    When  User scroll and click on Save buttom
    Then Should display the errromesssage <Errormessage> in LastNameTF
    
    Examples:
    |FirstnamePrefix|Firsname|LastName|CCStatus|CCDispostion|CCSubDispostion|CAMOpportunity|Remarkvalue|CCAgentname|Errormessage|
    |Mr.|kavi |  123$$!!  |Connect |Connect_appointment_done |Connect_appointment_done_cam_to_visit_customer|Follow up| Famous|arvind.gupta|Last Name Should Contain Alphabets Only!|
    
    @NegativeSmoke
    Scenario Outline: Verify the Error message when Entering more than and less than 10 digit number in MobileNumberTF
    When Click on pencil edit link
    Then Edit page should be display
    When click on First name dropdown and select <FirstnamePrefix>
    And Enter the value in Firstname TF<Firsname>
    And Enter the value in Lastname TF<LastName>
    And Enter the value in Mobilenumber TF<Mobilenumber>
    And Click on CC Status dropdown and select <CCStatus> option
    And Click on  CC dispostion dropdwon and select <CCDispostion> option
    And Click on CC Sub dispostion dropdown and select <CCSubDispostion> option
    And Click on CAM opprtunity status dropdown and select<CAMOpportunity> option
    And Enter any <Remarkvalue> CC remark TF
    And Click on CC agent name and select <CCAgentname>option
    When  User scroll and click on Save buttom
    Then Should display the errromesssage <Errormessage> in MobileNumberTF
    
    Examples:
    |FirstnamePrefix|Firsname|LastName|Mobilenumber|CCStatus|CCDispostion|CCSubDispostion|CAMOpportunity|Remarkvalue|CCAgentname|Errormessage|
    |Mr.|kavi | Nanu |98098770|Connect |Connect_appointment_done |Connect_appointment_done_cam_to_visit_customer|Follow up| Famous|arvind.gupta|Please Enter Valid 10 Digit Mobile Number!|
    |Mr.|kavi1 | Nanu1 |%^$568901()|Connect |Connect_appointment_done |Connect_appointment_done_cam_to_visit_customer|Follow up| Famous|arvind.gupta|Please Enter Valid 10 Digit Mobile Number!|
    
    
  
  
  @Smoke1
  Scenario Outline: Verify the Meeting Page when user clicked on Subject Link From activities submodule
  When click on LeadsNameLink
  Then Leadsdetailspage should be display
  And scroll down and click activities submodule
  And click Creattask dropdown
  And click on Schedule meeting option 
  And Enter subject in <Subject> TF 
  And Select Date from <StartDate>
  And Select Date End <EndDate>
  And Click StartTime DropDown and select <StartHour>
  And Click StartMinute DropDown and select <StartMinute>
  And Click EndTime DropDown and select <EndHour>
  And Click EndMinute DropDown and select <EndMinute>
  And Click on Save button
  Then CreateTask Should be created with <Subject>
  When User Click on TaskLink
  Then User should lands to Meetingpage 
  
  Examples:
  |        Subject            |StartDate |EndDate   |StartHour|StartMinute|EndHour|EndMinute|
  |Meeting for Customerdetails|05/27/2023|05/27/2023|03       |15         |03     |30       |
  
  
  #@Smoke2
  # Scenario Outline: Verify the Meeting Page when user clicked on Subject Link From activities submodule
  #When click on LeadsNameLink
  #Then Leadsdetailspage should be display
  #And scroll down and click activities submodule
  #And click Creattask dropdown
  #And click on Schedule meeting option 
  #And Enter subject1 in <Subject1>
  #And Select month year from calender<monthyear>
  #And Select day from calender<date>
  
  
  #Examples: 
  #|Subject1|monthyear|date|
  #|hajs|JUNE 2024|25|
  
Scenario Outline: Verify the logcall task should be created when user click on logcall button from create task dropdown
   When click on LeadsNameLink
   Then Leadsdetailspage should be display
   And scroll down and click activities submodule
   And click Creattask dropdown
   And click on Log Call Option
   And Enter subject in <subject1> TF in Logcall Page
   And select monthyear from calender<monthyear> in Logcall page
   And Click StartTime DropDown and select <StartHour> in logcall page 
   And Click StartMinute DropDown and select <StartMinute> in logcall page 
   And enter <duration> in duration TF in logcall page 
   And Enter <minutes> in Duration Dropdown in logcall page 
   And Select <Status1> and <Status2> from Status Dropdown in logcall page 
   
   Examples:
   |subject1|monthyear|StartHour|StartMinute|duration|minutes|Status1|Status2|
   |schedule logcall|july 2024|10|30|3|30|Outbound|Planned|
   
   
   
   

         
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
   