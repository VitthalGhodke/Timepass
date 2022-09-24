package testNGAnnotation;

import org.testng.annotations.Test;

public class AnnotatioPriority {
	
	@Test(priority=2)
	public void sendMail() {
		System.out.println("Mail Send ");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Log out Success");
	}
	@Test (priority=1)
	public void login() {
		System.out.println("Login Successfuly");
	}
}
 /* if you dont give priority then execute the method in alphabetic order
  * 
  * by providing priority, methods executes base on priority
  */
