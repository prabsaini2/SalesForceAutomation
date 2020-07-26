Feature: Login to SalesForce

  Scenario: Login to SalesForce as a valid user.
    Given I login to SalesForce website
    Then Confirm login is done
    And I am on Home Page