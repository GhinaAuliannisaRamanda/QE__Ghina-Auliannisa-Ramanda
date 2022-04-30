Feature: Calculate Operation


  Scenario: As a user, i want to get sum results
    Given I want to calculate
    When I click button number "5" on the list
    And I click button plus on the list
    And I click button number "4" on the list
    And I click button equal
    Then I get 9

  Scenario: As a user, i want to get subtraction
    Given I want to calculate
    When I click button number "9" on the list
    And I click button min on the list
    And I click button number "3" on the list
    And I click button equal
    Then I get 6
