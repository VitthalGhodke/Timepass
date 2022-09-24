package testng;

import org.testng.annotations.Test;

public class TestNgParam1 {
  @Test(invocationCount=5)
  public void Param1() {
	  System.out.println("Hello, I am param1");
  }
}
