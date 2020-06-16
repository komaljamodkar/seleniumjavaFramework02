package junitproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({Assert.class,Annotclass.class})

public class MainCl extends TestCase{
	@Test
	public void setUp()
	{
		System.out.println("No of Test Case : = "+ this.countTestCases());
	}
   
} 
