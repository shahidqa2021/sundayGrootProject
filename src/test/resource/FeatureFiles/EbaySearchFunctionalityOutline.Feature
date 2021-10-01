
@regression
Feature: Ebay Search Functionality outline

  Scenario Outline: Search for different products
		Given Opens Ebay Homepage
		When Search for specific "<Products>"
		Then Item list should have only specific "<Category>"


	Examples:
|Products		  | Category   |
|Shirt			  | shirt      |
|Sweatpants	  | sweatpants |
|Hats	  		  | hats       |

