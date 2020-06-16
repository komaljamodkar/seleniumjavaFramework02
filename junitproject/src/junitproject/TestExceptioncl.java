package junitproject;

import org.junit.Before;
import org.junit.Test;

public class TestExceptioncl {

	int a,b,c;
	
	@Before
	public void setUp()
	{
		a=5;
		b=0;
	}
	//@Test(expected =java.lang.ArrayStoreException.class)
	@Test(expected =java.lang.ArithmeticException.class)
	public void test()
	{
		c=a/b;
		System.out.println("Div="+c);
	}
}
