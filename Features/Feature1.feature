
Feature: Test that few links like Online Banking, Feedback work fine, text on the Home page is fine and user can login
Scenario: Basic links exist and user can log in
 Given Open the browser, launch the application 
 When Read text under various headings
 Then It is same as specifications 
Scenario: Check if links on the home page work
 Given Application launched, text correct under headings
 When I open links on home page
 Then Links work, user moves to login page
Scenario: User can login
Given User is on the login page
 When User enters username and password
 Then User can login into account
 