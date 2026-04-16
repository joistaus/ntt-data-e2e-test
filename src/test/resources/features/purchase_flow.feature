@purchase
Feature: Purchase flow on SauceDemo

  Scenario: Complete a purchase with valid credentials
    Given the user is logged in with valid credentials
    When they add 2 random products to the cart
    And they proceed to the cart
    And they proceed to checkout
    And they fill in the checkout form
    And they complete the purchase
    Then the order confirmation message should be displayed
