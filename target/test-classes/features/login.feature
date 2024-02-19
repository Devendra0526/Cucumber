#Author
#Date
@SmokeScenario
Feature: feature to test login funtionality

  @smokeTest
  Scenario: check login is successful with valid credential
    Given user is on login page
    When user enter username and password
    And click on login button
    Then user is navigate to the home page
