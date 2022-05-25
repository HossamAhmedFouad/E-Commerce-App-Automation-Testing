@regression
Feature: User can switch between currencies US Dollar - Euro

  Scenario: User changes currency from US Dollar to Euro
  Given User clicks on drop list
  When  User clicks on Euro
  Then  User find the price of products in Euro