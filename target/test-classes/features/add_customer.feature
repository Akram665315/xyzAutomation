Feature: add customer


  Scenario: add customer successfully
    Given user lands on xyz bank homepage
    And click on bank manger login
    And click add customer
    And enter valid info then click add customer
    Then verify customer has been added