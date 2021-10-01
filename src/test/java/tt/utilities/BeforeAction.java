package tt.utilities;

/*BeforeAction is opening the Browser and before irritation from cucumber
before action will run before running any feature file*/

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeAction {

	@Before
	public void beforeActions(Scenario scen) {
		System.out.println(">> Initializing Chrome Driver");
		SetupDrivers.setupDriver(); //calling the method setup driver. Note:we can setup driver method or Get driver method as well 
		System.out.println(scen.getName());
	}

}

