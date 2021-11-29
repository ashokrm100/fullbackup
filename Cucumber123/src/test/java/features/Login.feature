Feature: Application Login
Scenario: Home Page Default Login
Given User is on Landing Page
When User login into application with Username and Password
Then Home page is populated
And cards are displayed
