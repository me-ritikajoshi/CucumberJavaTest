Feature: Authentication service behavior
  As a system owner
  I want authentication rules to be validated in BDD scenarios
  So that business-level login behavior stays correct

  @smoke
  Scenario: Successful authentication with valid credentials
    Given a registered user with username "student" and password "Password123"
    When the user authenticates with username "student" and password "Password123"
    Then authentication should be successful
    And the authenticated username should be "student"

  @smoke
  Scenario: Failed authentication with invalid password
    Given a registered user with username "student" and password "Password123"
    When the user authenticates with username "student" and password "WrongPassword"
    Then authentication should fail
