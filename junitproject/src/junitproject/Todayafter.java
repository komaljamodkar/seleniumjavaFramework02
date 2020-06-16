package junitproject;

import org.junit.Test;

import junit.framework.TestResult;

public class Todayafter extends TestResult{

	public synchronized void addError(Test test,Throwable t)
	{
		super.addError((junit.framework.Test)test,t);
	}
}
