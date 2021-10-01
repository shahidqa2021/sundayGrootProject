package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayCartDropDownLocators;
import tt.utilities.SetupDrivers;

public class EbayCartDropDownActions {

	EbayCartDropDownLocators EbayCartDropDownLocatorsobj;
	WebDriverWait Wait = new WebDriverWait(SetupDrivers.driver, 30);

	public EbayCartDropDownActions() {
		EbayCartDropDownLocatorsobj = new EbayCartDropDownLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartDropDownLocatorsobj);
	}

	public void selectSizeFromDropDown() throws Exception {

		// selenium Dropdown
		Select myDropDown = new Select(EbayCartDropDownLocatorsobj.DropDownSize);
		myDropDown.selectByVisibleText("4XLT");
		Thread.sleep(2000);
	}

	public void selectShadeFromDropDown() throws Exception {
		// selenium Dropdown
		Select myDropDown = new Select(EbayCartDropDownLocatorsobj.DropDownShade);
		myDropDown.selectByVisibleText("White");
		Thread.sleep(2000);
	}

	public void addToCart() throws Exception {
		EbayCartDropDownLocatorsobj.btnAddCart.click();
		Thread.sleep(5000);
	}
}
