  Feature: Multiplication
  In order to avoid making mistakes
  As an accountant
  I want to multiply numbers

  Scenario: Multiply two variables
    Given a variable x with value 3
    And a variable y with value 4
    When I multiply x * y
    Then I get 12