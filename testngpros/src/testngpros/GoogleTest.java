package testngpros;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class GoogleTest {
  WebDriver driver;
  @BeforeMethod
  @Parameters({"url"})
  public void setUp(String url) {
	  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.get(url);
  }
  

  @Test(priority=3,groups="Title")
  public void googleTitleTest() {
	  String title=driver.getTitle();
	  System.out.println("Title :"+title);
  }
  
  @Test(priority=1,groups="logo")
  public void logoTest() {
	  boolean b=driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	  Assert.assertEquals(true, b);
	  System.out.println("logo "+b);
  }
  
  @Test(priority=2,groups="linktext")
  public void linkTest() {
	  boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	  System.out.println("logo "+b);
  }
  
  @Test(priority=4,groups="test")
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(priority=5,groups="test")
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(priority=6,groups="test")
  public void test3() {
	  System.out.println("test3");
  }
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }

}
