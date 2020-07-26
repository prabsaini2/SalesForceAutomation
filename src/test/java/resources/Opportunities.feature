Feature: Go to Opportunities to create new Opportunities.

  Scenario: Confirm Opportunity is created.
    Given I login to SalesForce website
    Then I click on Opportunity dropdown
    And I click on New Opportunity
    And I fill new Opportunity Form
    And I click on Save
    Then I am back on Home page