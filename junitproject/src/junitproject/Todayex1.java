package junitproject;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Todayex1 {
	
	int val1,val2;
	@Before
	public void setUp()
	{
		val1=40;val2=10;
		System.out.println("Values are intialised ");
	}
	
	@Test
	public void testAdd()
	{
		int result=val1+val2;
		assertTrue(result==50);
	}
	
	@Test
	public void testSub()
	{
		int result=val1-val2;
		assertTrue(result==30);
	}

}
