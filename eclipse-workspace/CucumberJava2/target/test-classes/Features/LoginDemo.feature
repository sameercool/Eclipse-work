Feature: Test login functionality

  Scenario Outline: check login is successful with given credentials
    Given browser is opened
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the homepage
    Examples:
      | username | password |
      | Raghav |   12345|
      | ele |    12345|
