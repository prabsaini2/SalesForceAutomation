Feature: Go to Accounts to create new Account.
  Background:
    Given I login to SalesForce website
    When I click on Accounts tab dropdown
    And I click on New Account


  Scenario: Confirm Account is created.
    And I fill the New Account form
    And I click on Save
    Then I am back on Home page
    And I delete the created Account
  @smoke
  Scenario Outline: Confirm account is created with scenario outline
  And I fill details "<Name>" "<fax>" "<BillingStreet>" "<BillingCountry>"
    And I click on Save
    Then Verify the account is created for "<Name>"
    And I delete the created Account
    Examples:
    |Name|fax|BillingStreet|BillingCountry|
    |Jassi|2586|12 Bhandup |India         |
    |Sunny|7589| 231 Mulund|India         |
    |Aman |7589|78 Kalyan  |India         |
  












