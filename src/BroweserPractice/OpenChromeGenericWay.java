package BroweserPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeGenericWay {

	public static void main(String[] args) {
		String DriverPath=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",DriverPath );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();

	}

}
