Feature: Test the Login function of DemoGuru
Scenario Outline: Test the valid Login
Given user is on LoginPage
When user enters <username> and <password>
And click on login button
Then user should land on home page

Examples:
|username|password|
|mngr330489|ugybunU|
|admin|value@123|
