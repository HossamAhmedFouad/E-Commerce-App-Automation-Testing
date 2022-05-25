@regression
Feature: user should be able to login to the system with his account

  Scenario: user could log in with valid email and password
  Given user navigates to login page
  When user enter valid username and password and clicks the login button
  Then user login successfully
