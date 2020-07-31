Feature: Go to Opportunities to create new Task.

  Scenario: Confirm Task is created.
    Given I login to SalesForce website
    Then I click on Tasks dropdown
    And I click on New Task
    And I fill new Task Form
    And I click on Save
    Then I am back on Home page