package testngpros;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BMW {
	
	@Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://www.bmw.in/en/");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div/div[2]/div[1]/a/span[2]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div[1]/nav/div/ul/li[4]/a")).click();
			driver.findElement(By.className("image-default ds2-model-card--street-lazy-load ds2-model-card--street-background-img loaded")).click();
			driver.findElement(By.xpath(("//div[@class='description-wrapper tw-relative tw-font-bmw-light tw-pt-200 tw-pb-100']"))).click();
			
	}

}
