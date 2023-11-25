package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.w3c.dom.events.EventException;

public class UtilityClass 
{
	//@Author Name: Sanjay
	//This method is use to get Test data from excel sheet
	//need to pass 2 inputs 1:rowIndex 2:colIndex 
	public static String GetTD(int rowIndex,int colIndex) throws EventException, IOException 
	{
		//FileInputStream file=new FileInputStream("C:\\Users\\rajes\\eclipse-workspace\\Selenium\\TestData\\ExcelSheet_Paramitarization.xlsx");
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\ExcelSheet_Paramitarization.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		 return value;
	}
	public static void captureSS(WebDriver driver,int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\rajes\\eclipse-workspace\\Selenium\\FailedTCesSS\\TestcaseID" +TCID+".jpg");
		File dest=new File(System.getProperty("user.dir")+"\\FailedTCesSS\\TestcaseID" +TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	public static String getDataFromPF(String key) throws IOException 
	{
		//FileInputStream file=new FileInputStream("C:\\Users\\rajes\\eclipse-workspace\\Selenium\\PropertyFile.Properties");
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFile.Properties");
		Properties p=new Properties();
		p.load(file);
		
		String value = p.getProperty(key);
		return value;
	}
	
}
