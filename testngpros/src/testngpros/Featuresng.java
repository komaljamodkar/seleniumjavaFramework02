package testngpros;

import org.testng.annotations.Test;

public class Featuresng {
  @Test
  public void loginpageTest() {
	  System.out.println("login test");
	  //int x=9/0; skipped test cases
  }
  
  @Test(dependsOnMethods="loginpageTest")
  public void homepageTest() {
	  System.out.println("homepage test");
	  
  } 
  
  @Test(dependsOnMethods="loginpageTest")
  public void searchpageTest() {
	  System.out.println("searchpage test");
	  
  } 
  
  @Test(dependsOnMethods="loginpageTest")
  public void regTest() {
	  System.out.println("reg test");
	  
  } 
}
