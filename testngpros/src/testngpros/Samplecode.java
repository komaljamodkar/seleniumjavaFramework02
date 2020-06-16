package testngpros;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Samplecode {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.name("userName")).sendKeys("swati12345");
		driver.findElement(By.name("password")).sendKeys("swati12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(2000);
		
		
		
		Select dropdown =new Select(driver.findElement(By.name("creditCard")));
		dropdown.selectByVisibleText("Visa");
		Thread.sleep(3000);
		/*
		dropdown.selectByValue("creditCard");
		Thread.sleep(3000);
		dropdown.selectByIndex(2);*/
		
		driver.findElement(By.name("creditnumber")).sendKeys("abc");
		Select dropdown1 =new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		dropdown1.selectByIndex(5);
		
		Thread.sleep(3000);
		driver.findElement(By.name("creditnumber")).sendKeys("abc");
		Select dropdown2 =new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		dropdown2.selectByIndex(5);
		
		driver.findElement(By.name("buyFlights")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
		Thread.sleep(2000);
		
		
		
  }
}
