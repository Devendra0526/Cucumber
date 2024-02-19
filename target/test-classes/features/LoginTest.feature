Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentil
    Given browser is open
    And user is on login page
    When user enter username and password
    And user click on login button
    Then user is navigate to the home page

    Examples: 
      | id    | pass     |
      | Admin | admin123 |
      | Admin | admin123 |
