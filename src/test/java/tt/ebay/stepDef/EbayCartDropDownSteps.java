package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartDropDownActions;

import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayCartDropDownSteps {

	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	EbayCartDropDownActions EbayCartDropDownActionsObj = new EbayCartDropDownActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomePageActionsObj.loadEbayHomepage();

	}

	@When("^Search for shirt$")
	public void search_for_shirt() throws Throwable {
		EbayHomePageActionsObj.searchShirt();

	}

	@When("^Select first shirt on item list$")
	public void select_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectItem();

	}

	@When("^select size$")
	public void select_size() throws Throwable {
		EbayCartDropDownActionsObj.selectSizeFromDropDown();
	}

	@When("^Select shade$")
	public void select_shade() throws Throwable {
		EbayCartDropDownActionsObj.selectShadeFromDropDown();

	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartDropDownActionsObj.addToCart();

	}
}
