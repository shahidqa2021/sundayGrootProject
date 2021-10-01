package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartDropDownLocators {

	// Shirt size
	@FindBy(xpath = "//select[@id='msku-sel-2']")
	public WebElement DropDownSize;

	// Shirt Shade
	@FindBy(xpath = "//select[@name='Shade']")
	public WebElement DropDownShade;

	// Add To Cart
	@FindBy(xpath = "//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;
}
