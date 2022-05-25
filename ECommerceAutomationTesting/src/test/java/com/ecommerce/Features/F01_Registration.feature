@regression
Feature: User should be able to register a new account to the system

  Scenario: User Register with valid data
    Given User navigates to register page
    When User enters first name and last name
    And  User enters email
    And  User enters password
    And  User confirms password and clicks register button
    Then User registers successfully

