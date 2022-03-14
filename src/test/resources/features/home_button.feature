Feature: home button


  Scenario: home button
    Given user lands on xyz bank homepage
    And click customer login
    And select a customer then click login
    Then verify that home button is visible on the welcome page
