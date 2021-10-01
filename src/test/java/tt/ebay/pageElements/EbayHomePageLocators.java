
/*What is Locator or object of a class?
 Locator is the button we click on every website that took us different pages
 for example: in ebay websites search box, search buttonms,Motors,fashion,music,deal,brand outlet,sell these are Locators.
 */
/*How to define a locator?
  inside the attribute we have Input(input is tag),Class,Id,Value=Search attribute
  we can use any of these attribute to find or define the Locator
** How we Define the locator?
  we can define it using input,class,id or value any of these Attribute
   but the most common way of define it by using (Xpath)
   **What is Xpath?
   There is 2 type of xpath 1.Absolute(Head,Body.table,tr,td) and
    2.Relative xpath(relating things with the dome) 
    Example: Syntax to work with Input tags:xpath=//input[@name='name2'and @value='Yes']
     3 way of writing Xpath:1. //tag[@Attributes,'value'] 2. //*[contains(@Attributes, 'value')] 3. //*[contains(text(), 'visual Text')]
**What does contain mean?
  contain is Function of Xpath what it does if i have something n my web Element which is identical  or which has text
     
  **Most Popular way of creating XPATH:
  *         INPUT      ID          Search
   XPATH=//tagname  [@Attribute =  'value']   
  */
/* What is Html?
 it"s a language when it starts with a tag and end with a tag
 Tag help to shape up the locators*/
//Every web page in this world are develop top of HTML
//page Element is the Locator
//locator always come first so we should first create pageElement classes
//we are gonna declare all of the homepage locators to this class
package tt.ebay.pageElements;


import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import tt.utilities.SetupDrivers;


public class EbayHomePageLocators {





//Ebay Search Button Without Page Factory Locator
WebElement btnSearch2 = SetupDrivers.driver.findElement (By.xpath("//input[@value= 'Search']"));


//Search Button - Page Factory Locators
@FindBy(xpath="//input[@value='Search']")
public WebElement btnSearch;

//Search Text Box - Page Factory Locators
@FindBy(xpath="//input[@placeholder= 'Search for anything']")
public WebElement txtbxSearch;

//myEbay
@FindBy(xpath="//a[@title='My eBay']")
public WebElement myEbay;


//Summary Button - Page Factory Locators
@FindBy(xpath="//a[contains(text(),'Summary')]")
public WebElement btnSummary;
}
