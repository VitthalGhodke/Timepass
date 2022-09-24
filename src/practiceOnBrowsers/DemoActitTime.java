package practiceOnBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitTime {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://Demo.actitime.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
		
		String ActUrl="https://demo.actitime.com/login.do";
		String ExpectUrl=driver.getCurrentUrl();
		if(ActUrl.equals(ExpectUrl)) {
			System.out.println("Login page open successfully");
		}else {
			System.out.println("Something Wrong");
		}
		driver.close();
			
	}

}
