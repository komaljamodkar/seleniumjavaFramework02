package testngpros;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class NewExample {
	WebDriver driver;
	  @Test
	 
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  String pageTitle=driver.getTitle();
		  Assert.assertEquals(pageTitle, "Gmail");
	  }
	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
}
