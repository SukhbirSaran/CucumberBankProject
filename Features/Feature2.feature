Feature: Test that a user is able to transfer funds from one account to another
Scenario: Select accounts, enter amount and transfer funds
 Given User is logged in
 When User selects and enters the amount
 Then Funds are transferred
Scenario: check confirmation message and go to account summary page
Given User has transferred funds 
When Confirmation screen has shown up with a message
Then Check confirmation message and go to Account Summary Page
Scenario: See if the account balance has changed in two accounts
 Given User is at Account Summary Page
 When Read funds in both FROM and TO accounts
 Then Check  for correct amount and to Add Payee page