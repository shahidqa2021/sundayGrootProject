package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Ebay Search Button Without Page Factory Locator
//WebElement btnSearch2 = SetupDrivers.driver.findElement (By.xpath("//input[@value= 'Search']"));
//Search Text Box - Page Factory Locators

import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbaySearchResultLocators {

	// Search Result Validation Locators
	@FindBy(xpath = "//span[contains(text(), 'shoes')]")
	public WebElement txtShoes;

	// Search Category- Without Page Factory Locator Need a method
	public String txtCategory(String Category) {
		WebElement txtCategory = SetupDrivers.driver
				.findElement(By.xpath("//span[contains(text(),'" + Category + "')]"));
		return txtCategory.getText();

	}
	
	public String clickBrands(String Brands) {
		WebElement clickBrands = SetupDrivers.driver.findElement(By.xpath("//h3[contains(text(),'" + Brands + "')]"));
		return clickBrands.getText();
	}


	// selecting Shirt
	@FindBy(xpath = "//span[contains(text(), 'Big & Tall Cotton Tee')]")
	public WebElement InkShirtItem;
}