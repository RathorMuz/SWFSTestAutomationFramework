Feature: Add a product to cart

  Background:
    Given User is on the main page

  Scenario: Add a product to cart
    When user click on Add to cart button
    And click on cart icon
    Then product should be added to cart successfully
    And item should show in cart