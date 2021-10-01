@regression
Feature: Ebay Cart Functionality

  Scenario: Adding items to Cart
    Given open Ebay website
    When Search for shoe
    And Click on the shoe ,select the size,color and Quantity
    Then Customer should be able to add the Shoe into the Cart
