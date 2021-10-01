

  @regression
  
  Feature: Ebay Logo Feature
  
  Scenario: Ebay Logo should take me to HomePage
    Given Open Ebay HomePgae
    And Search for Accessories
    When click search
    Then Item list should only have Accessories related product
    When Click on Ebay Logo
    Then Ebay Logo should take me to Homepage
    

  
     
