package com.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFactory {

	public static WebDriver getBrowser(String browserType)
	{
		WebDriver driver=null;
		if(browserType.equalsIgnoreCase("firefox"))
		{
			System.getProperty("webdriver.chrome.driver","./drivers/chromedriver");
			driver=new  ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("chrome"))
		{
			System.getProperty("webdriver.chrome.driver","./drivers/chromedriver");
			driver=new  ChromeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
}
