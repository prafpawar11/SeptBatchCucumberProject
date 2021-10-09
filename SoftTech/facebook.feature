Feature: test facebook application

  Scenario Outline: test end to end testing login
    Given open fb application
    When enter valid "<username>"
    And entr pass "<password>"
    Then homepage fb

    Examples: 
      | username | password |
      | pune1    | mumbai1  |
      | pune2    | mumbai2  |

    Examples: 
      | username | password |
      | Delhi1   | mumbai1  |
      | Delhi2   | mumbai2  |
      
          Examples: 
      | fn | ln |
      | Delhi1   | mumbai1  |
      | Delhi2   | mumbai2  |
    
