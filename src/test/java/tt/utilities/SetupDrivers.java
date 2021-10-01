package tt.utilities;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class SetupDrivers {
	/*set up driver class is preety much we set up the drivers 
		there is 2 way we can connect the driver with our Framework */
		public static WebDriver driver;

		public static void setupDriver() {
			 System.setProperty("webdriver.chrome.driver", "C:\\TTSoftware\\chromedriver.exe");
			/* WebDriverManager.chromedriver().browserVersion("88.0.4324.96").setup(); 
			 * Line 15 and 16 thsese are the 2 way we connect the chrome driver to our laptop*/
			ChromeOptions options = new ChromeOptions();//from this line we can add options in our webDriver
			options.addArguments("--disable-notifications");//disabling notification
			options.addArguments("--start-maximized");//minimizing or maximizing the browser when browser pop up by adding arguements
			driver = new ChromeDriver(options); // This is how we initialize
												// chromeDriver
		
			driver.get("https://www.ebay.com/"); /*this is the place we are calling the Web Pages,
			we can delete from here if we want and call this method on separate action class
			inside the action class we can create the method to load the Homepage
			 */
		}

		public static WebDriver getDriver() { //getter and setter method from Encapsulation setting up the method and getting the driver
			return driver;
		}

		public static void tearDownDriver() { //Tearing down the driver
			driver.quit();
		}
	}

