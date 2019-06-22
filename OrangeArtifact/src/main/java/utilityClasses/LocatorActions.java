package utilityClasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorActions {
	static WebDriver driver=Utility.driver;
	public static String locatorType;
	public static String Actions;    
	public  WebElement Element_Actions(String element)
	{
		try {
				switch(element)
				{
				case "Enter_URL" : driver.get(LocatorActions.locatorType);
				                   return null;
				case "id": return driver.findElement(By.id(LocatorActions.locatorType));
				case "xpath": return driver.findElement(By.xpath(LocatorActions.locatorType));
				case "classname": return driver.findElement(By.className(LocatorActions.locatorType));
				case "name": return driver.findElement(By.name(LocatorActions.locatorType));				
				case "Move_To_Element" : return driver.findElement(By.xpath(LocatorActions.locatorType));
				                            
				case "File" : Error_Screenshot.uploadFileWithRobot(LocatorActions.locatorType);
				default : Error_Screenshot.ScreenSave(element); return null;
				}
		} catch (Exception e) {
			Assert.fail();
			return null;
		}
		
		
		
	}
	
}

