Feature: open account

  Scenario: open account
    Given user lands on xyz bank homepage
    And click on bank manger login
    And click on open account header link
    And select a customer name and currency then click the process
    Then verify account has been opened
