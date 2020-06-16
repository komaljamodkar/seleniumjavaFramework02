package testngpros;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SundayEx1 {
  @BeforeMethod
  public void Login() {
	  System.out.println("Login Successful");
  }
  
  @AfterMethod
  public void Logout() {
	  System.out.println("Logout Successful");
  }
  
  @Test(priority=1)
  public void Search() {
	  //Assert.assertEquals("abc", "abcd");
	  System.out.println("Search Successful");
  }
  
  @Test (priority=2)
  public void AdvancedSearch() {
	  System.out.println("AdvancedSearch Successful");
  }
}
