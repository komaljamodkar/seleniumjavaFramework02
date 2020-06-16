package junitproject;
import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class Assert extends TestCase {
	

	@Test
	   public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	   }
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");

	}

	@Before
	public void before() {
		System.out.println("in before");

	}
	
	@After
	public void after() {
		System.out.println("in after");

	}
	@Test
	   public void testAssertions() {
		String str=new String("alpha");
		String str1=new String("alpha");
		String str2=null;
		String str3="alpha";
		String str4="alpha";
		int val=5;
		int val1=6;
		
		String[] expectedarr= {"o","n","e"};
		String[] actualarr= {"o","n","e"};
		
		assertEquals(str,str1);
		
		assertTrue(val<val1);
		assertFalse(val>val1);
		
		assertNotNull(str1);
	    assertNull(str2);
		
		assertSame(str3,str4);
		assertNotSame(str3,str2);
		
		assertArrayEquals(expectedarr,actualarr);
		
		String string= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",string);
		
		System.out.println("No of Test Case = "+ this.countTestCases());
		
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
