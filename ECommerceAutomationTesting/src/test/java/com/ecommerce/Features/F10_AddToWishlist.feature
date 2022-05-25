@regression
Feature: User could add products to wishlist
  Scenario: User selects Books category and clicks on a book and add it to wishlist
    Given User navigates to Books category three
    And   User selects First Prize Pies book three
    When  User clicks on wishlist
    Then  Confirmation message appears that product has been added to wishlist