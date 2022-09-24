package newtestpractice;



import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;


public class Test2 {

	public static void main(String[] args) {
		SeleniumUtility utility = new SeleniumUtility();
		WebDriver driver = utility.setUp("chrome", "https://demo.actitime.com/login.do");
driver.close();
	}

}
