Feature: Add numbers on Ios app.

@smoke
  Scenario: Add two numbers
    Given I enter first number in iOS APP
    And I enter second number in iOS APP
    When I click on ADD button
    Then I get the addition result in the result section

