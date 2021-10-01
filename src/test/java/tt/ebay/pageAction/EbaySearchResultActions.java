package tt.ebay.pageAction;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;

	public EbaySearchResultActions() {
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}

	public void verifyShoesItems() {

		// option :1
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();

		// option:2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtShoes.getText(), "shoes");

	}

	public void verifyCategory(String Category) {
		// Option1: not going to work with category
		// EbaySearchResultLocatorsObj.txtCategory.isDisplayed();
		// Option2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtCategory(Category), Category);

	}

	public void selectItem() {
		EbaySearchResultLocatorsObj.InkShirtItem.click();

	}
}