Feature: login

  Scenario: customer login
    Given user lands on xyz bank homepage
    And click customer login
    And select a customer then click login
    Then verify that customer is logged in
