Feature: Go to Contacts to create new Contact.

  Scenario: Confirm Contact is created.
    Given I login to SalesForce website
    Then I click on Contacts tab dropdown
    And I click on New Contacts
    And I fill new Contact Form
    And I click on Save
    Then I am back on Home page

