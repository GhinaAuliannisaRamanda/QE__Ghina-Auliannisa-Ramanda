Feature:  My Network
  As a user
  I want manage my invitation
  So that i can accept or ignore invitation

  Scenario: Accept
    Given I go to my network invitation page
    When I see invitation connection
    And I click accept
    Then I got new connection

    Scenario: Ignore
      Given I go to my network invitation page
      When I see invitation connection
      And I click ignore
      Then i got nothing change

