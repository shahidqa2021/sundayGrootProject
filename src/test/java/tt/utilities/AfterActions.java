package tt.utilities;

/*AfterAction is closing the browser also we are tearing down the driver
Tearing down browser meaning:
whatever browser we open we are much closing it here*/

/*Note:(tt.runner) folder a.Setup driver b.before action and after action all related to web driver
nothing related to page object model all we doing is connecting the web driver with our Framework properly */
import cucumber.api.java.After;

public class AfterActions {

	@After
	public void afterAction() {
		SetupDrivers.tearDownDriver();
		System.out.println("----------- Test Completed");
	}

}


