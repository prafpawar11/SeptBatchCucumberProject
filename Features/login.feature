Feature: Test Facebook login page
Scenario: Sanity testing

Given user is on fb login page
When user enter username and password
Then user click on login button
And user is on fb home page
