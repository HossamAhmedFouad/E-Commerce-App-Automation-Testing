@regression
Feature: User should be able to reset his password incase forgotten

  Scenario: User could reset his/her password successfully
    Given User navigates to login page
    When  User Clicks on Forgot Password
    And   User enters his email address and clicks on recover
    Then  A message appears that says "Email with instructions has been sent to you."
