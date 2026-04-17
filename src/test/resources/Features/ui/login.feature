@ui
Feature: UI login flow
  As an end user
  I want to log in through the application UI
  So that protected pages are accessible only with valid credentials

  @smoke
  Scenario: Successful UI login
    Given the user is on the practice test login page
    When the user submits username "student" and password "Password123"
    Then the user should be logged in successfully

  @negative
  Scenario: Failed UI login with wrong password
    Given the user is on the practice test login page
    When the user submits username "student" and password "WrongPassword"
    Then the user should remain on the login page
