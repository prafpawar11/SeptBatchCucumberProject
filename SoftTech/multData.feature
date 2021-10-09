Feature: Test the Free CRM App

  Scenario: Test Multiple Data
  
    Given user enter free CRM url
    When user enter valid data
      | darade.kp143@gmail.com | Krushna@123 |
    Then user click on login button
    Then user is on home page of free CRM
