Feature: Test the Free CRM Application Contact Page

  Background: 
    Given user enter free CRM url
    When user enter valid username and valid password
    Then user click on login button
    Then user is on home page of free CRM

  @ContactPage
  Scenario: Test Regression testing of contact page
    Then verify user is on home page or not
    When user click on contact link
    Then user is on contact page
    And user fillup the contact page details

  @DealsPage
  Scenario: Test Regressioon Testing for Deals Page
    When user click on deals link
    Then user is on deals page
    Then user click on create button of deals page
    Then user enter title of create new deal
    When user click on access public button
    Then we can select drop down name
