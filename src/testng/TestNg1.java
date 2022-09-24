package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 {
	@BeforeTest
	public void openBroweser() {
		System.out.println("Chrome Broweser Open");
	}
  @Test(priority=1)
  public void Login() {
	  System.out.println("Login Success");
  }
  @AfterTest
  public void CloseBroweser() {
	  System.out.println("Broweser is closed");
  }
  @Test(priority=2)
  public void Task() {
	  System.out.println("Task Complited");
  }
  
  
  
}
/**
@BeforeTest/@AfterTest--> behalf of all the @Test method executed only once either in the staring
or at the end
*/
