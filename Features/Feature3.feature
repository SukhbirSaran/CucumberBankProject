Feature: Check if a payee can be added
Scenario: Check if User navigated to the Add Payee page
 Given User was navigated to Pay Bills Page
 When Read welcome text on the Pay Bills page
 Then It is same as given specifications
Scenario: Go to Add new Payee Page
Given User is at pay bills Page
When User clicks Add new Payee Page
Then User is navigated to Add new Payee Page
Scenario: Add new Payee
 Given User is placed at Add new Payee Page
 When User adds details and clicks to add payee
 Then User gets a confirmation that a user is added
Scenario: Check if Payee is really added
 Given User has received confirmation that payee is added
 When User clicks Payee dropdown to see payees
 Then Checks if the payee is added
 