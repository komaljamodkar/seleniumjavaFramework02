
package junitproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestCase;

@RunWith(Suite.class)
@Suite.SuiteClasses({Primecheck.class,PrimecheckTest.class})

public class Todaysafterprimerun extends TestCase{
	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(PrimecheckTest.class);
		
		for(Failure failure :result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
   
} 




