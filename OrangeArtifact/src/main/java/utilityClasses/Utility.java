package utilityClasses;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import exportFromExcel.ExportDataFromExcel;
public class Utility {
	public static String elementName;
	ExportDataFromExcel ED = new ExportDataFromExcel();
	public static WebDriver driver;
	public static String Actions;
	public static String locatorType;
	@Before
	public void beforeScenario()
	{
	
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@After
	public void afterScenario(Scenario sc)
	{
		Error_Screenshot.ScreenSave("Feature_"+sc.getId().split(";")[0]+"_Scenario_"+sc.getId().split(";")[1]+"_Element_"+Utility.elementName+"_Error");
	}

}
