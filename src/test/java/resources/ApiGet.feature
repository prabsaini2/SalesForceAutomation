Feature: Testing get request

  @smoke
  Scenario Outline:Subtract numbers
    Given I send get request to subtract "<secondNumber>" from "<firstNumber>"
    Then  I get response code as "<Code>"
    Examples:
      | firstNumber | secondNumber | Code |
      |5            |2             |200   |