package com.driver.factory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class WikiTest {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=DemoFactory.getBrowser("chrome");
		driver.get("https://www.wikipedia.org/");
		
		driver.findElement(By.id("searchInput")).sendKeys("automation");
		//dropdown
		
		Select dropdown =new Select(driver.findElement(By.id("searchLanguage")));
		dropdown.deselectByIndex(4);
		driver.findElement(By.className("pure-button")).submit();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./s1.png");
		FileUtils.copyFile(src, destFile);
	}
	
	
}
