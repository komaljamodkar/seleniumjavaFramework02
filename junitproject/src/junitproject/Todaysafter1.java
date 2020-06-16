package junitproject;

public class Todaysafter1 {
	
	public String msg;
	
	//constructor
	public Todaysafter1(String msg)
	{
		this.msg=msg;
	}
	
	
	public String printMsg()
	{
		System.out.println(msg);
		return msg;
	}
	
	public String salutationMsg()
	{
		msg="hello"+msg;
		System.out.println(msg);
		return msg;
	}
	
	
	
	
	
	
}
