Feature: Login Functionality of Leaftaps Application

@functional
Scenario Outline: Login with Positive Data

Given Enter the userName as <username>
And enter the Password as <password>
When Click the Login button
Then HomePage should be displayed

Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
|'democsr'|'crmsfa'|
@smoke
Scenario: Login with Negative Data

Given Enter the userName as 'demosalesmanager'
And enter the Password as 'crmsfa123'
When Click the Login button
But Error message should be displayed