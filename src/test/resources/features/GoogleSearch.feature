Feature: feature to test GoogleSearch funtionality

  Scenario: Validate google search is woriking
    Given browser is open
    And user is on google search  page
    When user enter text in search box
    And hits enter
    Then user is navigate to search result
