package stepdefinition;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FacebookTest {

	WebDriver driver;
	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1)  {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(arg1);
	   
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) {
		driver.findElement(By.id("pass")).sendKeys(arg1);
	}
	@Then("^Login should fail$")
	public void login_should_fail(){
		driver.findElement(By.id("u_0_b")).click();
		String title=driver.getTitle();
		System.out.println("title");
		Assert.assertEquals("Log in to Facebook | Facebook", title);
		driver.quit();
	}


}
