@regression
Feature: User can find filter kind of products using categories

  Scenario: User Selects Desktop item category
  Given User hovers on computers category
  When User selects Desktop item category
  Then User finds Desktop products
