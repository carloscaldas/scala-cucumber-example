  Feature: Sum
  In order to avoid making mistakes
  As an accountant
  I want to sum numbers

  Scenario: Sum 2 variables
    Given a variable x with value 1
    And a variable y with value 4
    When I sum x + y
    Then I get 5


