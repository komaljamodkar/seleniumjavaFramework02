package junitproject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Todayafterrun {
	
	String msg="alpha";
	Todaysafter1 td=new Todaysafter1(msg);
	
	@Test
	public void testPrintmsg()
	{
		System.out.println("check");
		assertEquals(msg,td.printMsg());
	}

}
