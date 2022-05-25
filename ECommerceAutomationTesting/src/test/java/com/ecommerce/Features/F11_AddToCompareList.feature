@regression
Feature: User could add products to compare list
  Scenario: User selects Books category and clicks on a book and add it to compare list
    Given User navigates to Books category two
    And   User selects First Prize Pies book two
    When  User clicks on add to compare list
    Then  Confirmation message appears that product has been added to compare list