package testngpros;

import org.testng.annotations.Test;

public class NewTesttimeout {
	/* @Test(timeOut=1000)
	  
	  public void loopin() {
		  int i=1;
		  while(i==1)
		  System.out.println(i);
	  }*/
	 
	 @Test(expectedExceptions=ArithmeticException.class)
	  
	  public void test() {
		  int i=9/0;
		  System.out.println(i);
	  }
	 
	 @Test
	  
	  public void test1() {
		  
		  System.out.println("test1");
	  }
	 @Test(enabled=false)
	  
	  public void test2() {
		  
		  System.out.println("test2");
	  }
}


