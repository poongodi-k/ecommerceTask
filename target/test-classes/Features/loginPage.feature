Feature: Login feature

  Scenario: Login successful
    Given user go to login page
    Then user enter the userName
    And user enter the password
    And click login button

  Scenario: Login failed
    Given user go to login page
    Then user enter the incorrect username
    And user enter the incorrect password
    And click login button
