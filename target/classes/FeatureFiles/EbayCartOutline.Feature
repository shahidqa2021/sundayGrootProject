

  @regression
  
  Feature: Ebay Cart Functionality
  
  Scenario Outline: Adding Different Types of Phone to Cart
    Given open Ebay website
    When Search for "<Brands>"
    Then Item list should have collectin of "<Brands>"
    And select "<Qty>"
    When Adding to "<Cart>"
    Then Item list should be visible to the Cart

    Examples: 
      | Brand  | Qty|    | Cart|
      | Iphone | 1  |    | 1   |
      | Samsung| 2  |    | 2   |
       |Nokia| | 3  |    | 3   |