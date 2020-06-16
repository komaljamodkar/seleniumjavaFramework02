package testngpros;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven1 {

	WebDriver driver;
	String url="https://www.phptravels.net/home";
	@Test (dataProvider="testdata")
	
	public void setUp(String val1,String val2) throws InterruptedException
	{
		String username=val1;
		String password=val2;
		System.out.println("username :"+username+" "+"password :"+password);
		System.out.println();
		
			  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			  driver =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			  driver.get(url);
			  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  
			  //driver.findElement(By.className("btn btn-text-inherit btn-interactive")).click();
			  
			  //driver.findElement(By.id("dropdownCurrency")).click();
			  
			  //driver.findElement(By.xpath("//*[@id=\"dropdownCurrency\"]")).click();
			  //driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[8]")).click();
			  
			  driver.findElement(By.cssSelector(".dropdown-login > a:nth-child(1)")).click();
			  driver.findElement(By.cssSelector("a.tr:nth-child(1)")).click();
			  driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();
			  
			  
			  
			  driver.findElement(By.name("username")).sendKeys(username);
			  
			  driver.findElement(By.name("password")).sendKeys(password);
			  
			  driver.findElement(By.tagName("submit")).click();
			driver.close();
				
				
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@DataProvider(name="testdata")
	public Object[] [] readExcel() throws BiffException, IOException
	{
		File f=new File("/home/swati/Desktop/data1.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		
		int rows=s.getRows();
		int columns=s.getColumns();
		
		System.out.println(rows);
		//System.out.println(columns);
		String InputData[][]=new String [rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				Cell c=s.getCell(j, i);
				InputData[i][j]=c.getContents();
				//System.out.println(InputData[i][j]);
				
			         
			}
		}
		
		return InputData;
	}
	
}
