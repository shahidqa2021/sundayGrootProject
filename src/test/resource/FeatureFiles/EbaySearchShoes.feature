@regression
Feature: Ebay Search Shoes Functionality

Scenario: search for Shoes
Given Open Ebay Homepage
When Search for Shoes
Then Item list should only have Shoes related product