Feature: Go to Cases to create new Case.

  Scenario: Confirm Case is created.
    Given I login to SalesForce website
    Then I click on Case tab dropdown
    And I click on New Case
    And I fill new Case Form
    And I click on Save
    Then I am back on Home page