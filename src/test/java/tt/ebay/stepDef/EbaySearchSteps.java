/*package tt.ebay.stepDef;
//In Steps we dont create any constructor because cucumber dont allow it cucumber will stop it

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;
import cucumber.api.PendingException;




public class EbaySearchSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomePageActionsObj.loadEbayHomepage();
	}

	@When("^Search for Shoes$")
	public void search_for_Shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
		}

		@Then("^Item list should only have Shoes related product$")
		public void item_list_should_only_have_Shoes_related_product() throws Throwable {
			 EbaySearchResultActionsObj.verifyShoesItems();
		}
}
	
*/

