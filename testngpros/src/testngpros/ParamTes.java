package testngpros;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamTes {
  @Test
  
  @Parameters({"a","b"})
  public void add(int c,int d) {
	  int sum=c+d;
	  System.out.println("sum="+sum);
  }
}
