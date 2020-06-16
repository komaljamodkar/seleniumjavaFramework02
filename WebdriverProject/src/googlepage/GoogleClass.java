package googlepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleClass {
	public static void main(String[] args)
	{
		/*System.getProperty("webdriver.chrome.driver","./drivers/chromedriver");
		WebDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc");
		List<WebElement> links=driver.findElements(By.tagName("input"));
		System.out.println("links: "+links.size());
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc123");
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.close();
		driver.quit();
	}

}
