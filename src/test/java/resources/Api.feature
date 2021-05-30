Feature: Get Test
  @smoke
    Scenario: Testing GET Call
    Given I send a get request to subtract 2 from 5
    Then I verify the response code is 200

  Scenario: Testing POST Call
    Given I send a post request
    Then I verify that the response code that comes back is 200

    Scenario: Testing GET Add Call
      Given I send a get request to Add 5 to 6
      Then I verify that the response code is 200

    



