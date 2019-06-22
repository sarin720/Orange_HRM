package exportFromExcel;
import java.io.File;
import utilityClasses.Utility;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utilityClasses.LocatorActions;
public class ExportDataFromExcel {
	
	public String locatorType;
	public void get_Locator_From_Excel(String locatorName) throws IOException, InvalidFormatException{
		Utility.elementName=locatorName;
		File file = new File("D://RPA//Locator_List.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh = wb.getSheet("Locators");
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String name = sh.getRow(i).getCell(1).getStringCellValue();
			if(name.equals(locatorName))
				{
				   LocatorActions.Actions = sh.getRow(i).getCell(4).getStringCellValue();
				   locatorType = sh.getRow(i).getCell(3).getStringCellValue();
				   LocatorActions.locatorType = sh.getRow(i).getCell(2).getStringCellValue();
				   
				   
				}
			
		}
		wb.close();
		
	}
	
	
}
