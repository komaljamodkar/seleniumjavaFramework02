package KDD.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableFunction {

	WebDriver driver;
	public  String[][] fetchData()
	{
		Workbook wb=null;
		String[][] data=null;
		try {
			String path = fetchProperty("KEYWORD_PATH");
			File excel = new File(path);
			FileInputStream file = new FileInputStream(excel);
			
			System.out.println(path);
			
			String extn=path.substring(path.indexOf(".")+1);
			System.out.println(extn);
			
			if(extn.equals("xlsx"))
			{
				wb=new XSSFWorkbook(file); 
			}
			else
			{
				wb=new HSSFWorkbook(file); 
			}
			
			Sheet sheet = wb.getSheet("Sheet");
			
			int rownum=sheet.getLastRowNum();
			int column=sheet.getRow(0).getLastCellNum();
			
			data=new String[rownum][column];
			
			for(int i=0;i<rownum;i++)
			{
				Row row=sheet.getRow(i);
				
				for(int j=0;j<column;j++)
				{
					Cell cell=row.getCell(j);
					String value=cell.toString();
					data[i][j]=value;
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {wb.close();
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return data;
	}
	
	public static String fetchProperty(String text)
	{
		Properties prop=new Properties();
		FileInputStream input;
		
		try {
			input = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/objects.properties");
			prop.load(input);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return prop.getProperty(text);
	}
	
	public void lauchApp()
	{
		System.getProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(fetchProperty("URL"));
	}
	
	public void fillText(String locatorBy,String locatorValue,String text)
	{
		switch(locatorBy)
		{
		case "xpath":
			driver.findElement(By.xpath(locatorValue)).sendKeys(text);
			break;
		case "name":
			driver.findElement(By.name(locatorValue)).sendKeys(text);
			break;
		}
	}
	
	public void click(String locatorBy,String locatorElement)
	{
		switch(locatorBy)
		{
		case "xpath":
			driver.findElement(By.xpath(locatorElement)).click();
			break;
		case "name":
			driver.findElement(By.name(locatorElement)).click();
			break;
		}
		
	}
	
	public void driverClose()
	{
		driver.close();
	}
}

