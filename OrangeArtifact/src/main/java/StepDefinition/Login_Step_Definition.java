package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import exportFromExcel.ExportDataFromExcel;
import utilityClasses.LocatorActions;
import utilityClasses.Utility;
public class Login_Step_Definition {
	Actions actions = new Actions(Utility.driver);
	LocatorActions loc = new LocatorActions();
	ExportDataFromExcel ED = new ExportDataFromExcel();
	public static String textFieldValue=null;
	@Given("^I navigate to url \"([^\"]*)\"$")
	public void i_navigate_to_url(String UrlSpecified) throws Throwable {
		LocatorActions.locatorType = UrlSpecified;
		loc.Element_Actions("Enter_URL");
	}
	
	@Then("^I enter \"([^\"]*)\" in the \"([^\"]*)\" field$")
	public void Enter_TextValue_Webfield(String value,String field) throws Throwable {
		ED.get_Locator_From_Excel(field);
		loc.Element_Actions(ED.locatorType).clear();
		loc.Element_Actions(ED.locatorType).sendKeys(value);
		
	}
	
	@Then("^I click on \"([^\"]*)\"$")
	public void Click_Webfield(String Clickable_Element) throws Throwable
	{
		ED.get_Locator_From_Excel(Clickable_Element);
		loc.Element_Actions(ED.locatorType).click();
	}
	
	@Then("^I verify \"([^\"]*)\" page is launched correctly$")
	public void Verify_Page(String title) throws Throwable
	{
		ED.get_Locator_From_Excel(title);
		if (!(Utility.driver.getTitle().equals(title)))
			Assert.fail();
		
	}
	
	@Then("^I verify if \"([^\"]*)\" is displayed$")
	public void Verify_IsDisplayed(String Field_To_Display) throws Throwable
	{
		ED.get_Locator_From_Excel(Field_To_Display);
		if(!loc.Element_Actions(ED.locatorType).isDisplayed())
			Assert.fail();
	}
	
	@Then("^I scroll to end of the page$")
	public void Scroll_To_EndOfPage() throws Throwable
	{
		loc.Element_Actions("Scroll_To_EndOfPage");
	}
	
	@Then("^I move to the element \"([^\"]*)\"$")
	public void Move_To_The_Element(String Move_To_Element) throws Throwable
	{
		ED.get_Locator_From_Excel(Move_To_Element);
		actions.moveToElement(loc.Element_Actions("Move_To_Element"));
		
	}
	
	@Then("^I upload file \"([^\"]*)\"$")
	public void Upload_File(String file) throws Throwable
	{
		LocatorActions.locatorType =  file;
		loc.Element_Actions("File");
	}
		
	
}
