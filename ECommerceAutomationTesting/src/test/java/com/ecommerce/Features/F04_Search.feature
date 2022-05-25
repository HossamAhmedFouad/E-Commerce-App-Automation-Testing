@regression
Feature: User can search for a product

  Scenario: User searches for a product in search bar
  Given User clicks on search bar
  When  User enters name of a product
  And   User clicks on search button
  Then  User finds product

