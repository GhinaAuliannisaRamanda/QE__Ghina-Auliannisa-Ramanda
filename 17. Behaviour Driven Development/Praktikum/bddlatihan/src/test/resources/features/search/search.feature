Feature: Search
  As a user
  I want to search someone linkedin profile
  So that i can see someone linkedin profile

  Scenario: Success Search
    Given I go to search bar
    When I input valid people name or groups
    And  I Click Result
    Then I can see general information

    Scenario: Failed Search
      Given I go to search bar
      When I input random phrasing text or long typing
      And  I Click Result
      Then I will get no result found, Try shortening or rephrasing your search