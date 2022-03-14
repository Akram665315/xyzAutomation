Feature: header links

  @chicken
  Scenario: headerLinks should be visible on bank manger page
    Given user lands on xyz bank homepage
    And click on bank manger login
    Then verify that all 3 headerLinks are visible