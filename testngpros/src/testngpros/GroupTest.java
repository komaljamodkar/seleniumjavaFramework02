package testngpros;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTest {
	@BeforeGroups (groups= {"regression"})
	  public void Login() {
		  System.out.println("Login Successful");
	  }
	  
	  @AfterGroups (groups= {"regression"})
	  public void Logout() {
		  System.out.println("Logout Successful..");
		  System.out.println("..........");
	  }
	  
	  @Test(groups= {"sanity"})
	  public void FundTransfer() {
		  //Assert.assertEquals("abc", "abcd");
		  System.out.println("FundTransfer Successful");
	  }
	  
	  @Test (groups= {"sanity","regression"})
	  public void Search() {
		  //Assert.assertEquals("abc", "abcd");
		  System.out.println("Search Successful");
	  }
	  
	  @Test (groups= {"regression"})
	  public void PrepaidRecharge() {
		  System.out.println("PrepaidRecharge Successful");
	  }
	  
	  @Test (groups= {"regression"})
	  public void BillPayements() {
		  System.out.println("BillPayements Successful");
	  }
}
