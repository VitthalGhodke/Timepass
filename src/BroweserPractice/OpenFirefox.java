package BroweserPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		String DrivePath=".\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", DrivePath);
		FirefoxDriver Fdrive=new FirefoxDriver();
Fdrive.close();
	}

}
