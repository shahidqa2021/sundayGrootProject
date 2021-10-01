

  @regression
  Feature: Ebay Brand Outline
  
  Scenario Outline: Search for Items with Brand
    Given Open Ebay Website
    When Search for "<Items>"
    And Filter by "<Brand>"
    Then Item list should have product of "<Brand>"

    Examples: 
      | Items  |     Brand |
      | Shirts |     polo  |
      | pants  |    nike   |
      | shoe   |    jordan | 