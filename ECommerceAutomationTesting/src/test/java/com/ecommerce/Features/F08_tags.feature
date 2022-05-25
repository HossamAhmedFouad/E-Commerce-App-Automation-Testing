@regression
Feature: User could select different tags

  Scenario: User finds cameras when selects camera tag
  Given User navigates to electronics category
  When  User selects camera tag
  Then  User finds cameras products
