Feature: Lead creation via API

Scenarios: create lead via API 
Given Add Place Payload with "<name>"  "<language>" "<address>"
When user calls "CreateLeadAPI" with "POST" http request
Then Lead should be created and validate status code 200
And "Status" responace body is "true"
And "Message" Responace body "Lead Created Successfully"
