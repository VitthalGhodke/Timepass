package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
	//	String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
//		//step1: set driver executable path by using System.setProperty(String key,String value)
//		System.setProperty("webdriver.chrome.driver", driverPath);
		
		
		//or Use WebDriverManager to manager chrome browser executable based on system requirement
				//use setup method of WebDriverManager
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.close();
		
		
	}

}
