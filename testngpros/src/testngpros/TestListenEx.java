package testngpros;

import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class TestListenEx {
  @Test
  public void Login() {
	  System.out.println("login by email");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test
  public void Loginfacebook() {
	  System.out.println("login by facebook");
	  Assert.assertEquals("abc", "abdc");
  }
}
