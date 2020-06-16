package junitproject;

import junit.framework.TestCase;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestExample1 extends TestCase  {
   protected double fValue1;
   protected double fValue2;
   
   @Before 
   public void setUp() {
      fValue1 = 3.0;
      fValue2 = 2.0;
      System.out.println("values intialize");
   }
	
   @Test
	public void testAdd1()
	{
	   
		int result=(int) (fValue1+fValue2);
		assertTrue(result==5.0);
	}
	
	@Test
	public void testSub1()
	{
		int result=(int) (fValue1-fValue2);
		assertTrue(result==1);
	}
   
   @Test
   public void testAdd() {
      //count the number of test cases
      System.out.println("No of Test Case = "+ this.countTestCases());
      System.out.println("No of Test Case = "+ countTestCases());

		
      //test getName 
      String name = this.getName();
      System.out.println("Test Case Name = "+ name);

      //test setName
      this.setName("testNewAdd");
      String newName = this.getName();
      System.out.println("Updated Test Case Name = "+ newName);
   }
	
   //tearDown used to close the connection or clean up activities
   public void tearDown(  ) {
	   System.out.println("No of Test Case = "+ this.countTestCases());
   }
}