package seleniumPracticeDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGooglePAge {

	public static void main(String[] args) {
//		String Path1="F:\\Acclaration\\Workspace\\SeleniumTesting\\executables\\chromedriver.exe";
//		String Path2=".\\executables\\chromedriver.exe";
		String Path3=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path3);
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.Google.com");
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(cdriver.getCurrentUrl());
		
		System.out.println(cdriver.getPageSource().length());
		System.out.println(cdriver.getTitle());
		
		cdriver.close();

	}

}
