package BroweserPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxgenericway {

	public static void main(String[] args) {
		String DrivePath=".\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", DrivePath);
		 WebDriver Fdrive=new FirefoxDriver();
		 Fdrive.close();

	}

}
