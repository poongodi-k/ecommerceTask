Feature: Address page feature

  Scenario: Address filling scenario
    Given user go to login page
    Then user enter the userName
    And user enter the password
    And click login button
    And user add product to the cart
    And user click cart container button
    Then user click checkout button
    And user fill first name
    And user fill last name
    And user fill zipcode
    Then user click continue button
    Then user click finish button
