@tag2
Feature: Leads Testcases


  Scenario Outline: Editing Leads from leads module
    Given User enters Username and password and click on the Login Btn
   When Mouse move over all sticky menu
    And click on the Leads module link
    Then Leads list page should be display 
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
  |Mr.           |Kuvempu |  kavi  |Connect |Connect_appointment_done |Connect_appointment_done_cam_to_visit_customer|Follow up     | Famous    |arvind.gupta|
  #|Ms.|Akka|Mahadevi|Connect|Connect_not_eligible|Connect_not_eligible_cibil_issue|documents|MansuKododu|sushma.jaiswar|
  
  
  
  
 #Scenario: Verify the Meeting Page when user clicked on Subject Link From activities submodule
  
  #Given User enters Username and password and click on the Login Btn
 #When Mouse move over all sticky menu
 #And click on the Leads module link
 #Then Leads list page should be display
 #When click on LeadsNameLink
 #Then Leadsdetailspage should be display
 #And scroll down and click activities submodule
 #And click Creattask dropdown
 #And click on Schedule meeting option 
 #And Enter subject in <Subject> TF 
# And Select Date from <StartDate>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
   