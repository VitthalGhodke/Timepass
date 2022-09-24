package mouseoperation;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class Mouse2 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.google.com");
		driver.manage().window().maximize();

	}

}
