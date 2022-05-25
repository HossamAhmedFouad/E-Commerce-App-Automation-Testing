@regression
Feature: User receives order confirmation when checks out
  Scenario: User checks out with products in shopping cart
    Given User navigates to shopping cart and shopping cart has items
    And   User clicks on agree terms of service
    When  User clicks on checkout button
    And   Fills shipment and payment data
    And   Clicks on confirm button
    Then  Order Success Message Appears