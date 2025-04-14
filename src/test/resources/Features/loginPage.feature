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

  Scenario Outline: Login with different data
    Given user go to login page
    Then user enter the name "<username>"
    And user enter the pwd "<password>"
    And click submit button

    Examples: 
      | username | password     |
      | poongodi | poongodi1234 |
      | ajai    | ajai125335   |
      | mahesh   | mahesh154536   |
