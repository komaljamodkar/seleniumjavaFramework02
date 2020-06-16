package junitproject;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Todayex {
	
	int val1,val2;
	@Before
	public void setUp()
	{
		val1=40;val2=10;
		System.out.println("Values are intialised ");
	}
	
	@Test
	public void testMul()
	{
		int result=val1*val2;
		assertTrue(result==400);
	}
	
	@Test
	public void testDiv()
	{
		int result=val1/val2;
		assertTrue(result==4);
	}

}
