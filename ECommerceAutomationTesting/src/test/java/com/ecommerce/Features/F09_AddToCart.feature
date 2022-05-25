@regression
Feature: User Could Add Products To Shopping Cart
  Scenario: User selects Books category and clicks on a book and add it to shopping cart
    Given User navigates to Books category one
    And   User selects First Prize Pies book one
    When  User clicks on add to cart
    Then  Confirmation message appears that product has been added to shopping car