@regression
Feature: User could filter the color of a product if it is an option

  Scenario: User Selects Apparel category and selects shoes and filters their color to red
  Given User at Apparel category and shoes sub category
  When  User filters color to red
  Then  User sees red shoes only