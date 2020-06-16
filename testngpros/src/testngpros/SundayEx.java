package testngpros;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SundayEx {
  @BeforeTest
  public void Login() {
	  System.out.println("Login Successful");
  }
  
  @AfterTest
  public void Logout() {
	  System.out.println("Logout Successful..");
	  System.out.println("..........");
  }
  
  @Test(priority=1)
  public void FundTransfer() {
	  //Assert.assertEquals("abc", "abcd");
	  System.out.println("FundTransfer Successful");
  }
  @Test (priority=3)
  public void PrepaidRecharge() {
	  System.out.println("PrepaidRecharge Successful");
  }
  
  @Test (priority=2)
  public void BillPayements() {
	  System.out.println("BillPayements Successful");
  }
}
