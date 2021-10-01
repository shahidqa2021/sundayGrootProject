package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

//main reason for pageAction is to developing the common function
/* Basic concepts of page object model : keep the separate locator of the separate pages in the separate classes 
and keep the separate common function or Action of the different pages of the application  into different classes
 we should not put anything together that will make us confuse

//page Action model define all of the Locator  and action of different pages we gonna put it into different class

/*the main reason for page object model is  to create the classes separate so that
help the Automation enginner to organize the Framework 99% of automation Framework use page object model */

/* how it will make us confuse ?
 Example: if we have 50 to 100 test cases or more everything is up and running
 without any issue the only way we can succeed it by following 
  page object model because we have the page object model in place each classes have different pages
 and its really organize thats why it never get messed up
 */
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.SetupDrivers;

//Main reason for this to developing the function
public class EbayHomePageActions {

	EbayHomePageLocators EbayHomePageLocatorsObj;

	public EbayHomePageActions() {
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);

	}

	public void loadEbayHomepage() { // we dont need it because we have this n
										// setupdriver class
		SetupDrivers.driver.get("https://www.ebay.com/"); // This is where we
															// are calling the
															// websites
	}
	// Implicit Wait
	/*
	 * SetupDrivers.driver.manage() .timeouts().implicitlyWait(20,
	 * TimeUnit.SECONDS);
	 * 
	 * Explicit wait
	 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
	 * "//input[@id='gh-ac']")));
	 * 
	 * //Hard Pause Thread.sleep(3000); }
	 */

	public void searchShoes() {
		EbayHomePageLocatorsObj.txtbxSearch.clear(); // going to ebay and
														// clearing search box

		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes"); // going to ebay
																// and search
																// for shoe

		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchProducts(String Products) {
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Products);
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchShirt() {

		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void mouseHoverMyebay() throws InterruptedException {
		// Click on summary by mouse hover myEbay
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.myEbay);
		actions.perform();
		Thread.sleep(5000);
	}

	public void clickSummary() throws InterruptedException {
		EbayHomePageLocatorsObj.btnSummary.click();
		Thread.sleep(5000);

	}

}