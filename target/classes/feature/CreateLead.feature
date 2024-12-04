Feature: Create Lead funtionality
@regression @functional @smoke
Scenario: Create Lead with required data

Given Enter the userName as 'demosalesmanager'
And enter the Password as 'crmsfa'
When Click the Login button
Then HomePage should be displayed
When Click the 'CRM/SFA' Link
Then MainPage should be displayed
When Click the 'Create Lead' Link
Then CreateLead Page Should be displayed