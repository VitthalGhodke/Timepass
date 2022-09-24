package seleniumPracticeDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager11 {

	public static void main(String[] args) {
		//use setup method of WebDriverManager
				WebDriverManager.chromedriver().setup();
				//step2: create an instance of Chrome Browser
				WebDriver driver = new ChromeDriver();
				//maximize browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("http://demo.automationtesting.in/Register.html");
				
				//use setup method of WebDriverManager
				WebDriverManager.firefoxdriver().setup();
				//step2: create an instance of Chrome Browser
				WebDriver driver1 = new FirefoxDriver();
				//maximize browser
				driver1.manage().window().maximize();
				//implicit wait
				driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver1.get("http://demo.automationtesting.in/Register.html");
				
				driver1.close();
	}

}
