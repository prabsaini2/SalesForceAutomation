Feature: Add numbers on Android app.
  @smoke
  Scenario: Add two numbers
    Given I enter first number
    And I enter second number
    When I click on ADD
    Then I get the addition result