Feature: Go to Leads to create new Contact.

  Scenario: Confirm Lead is created.
    Given I login to SalesForce website
    Then I click on Leads tab dropdown
    And I click on New Lead
    And I fill new Lead Form
    And I click on Save
    Then I am back on Home page