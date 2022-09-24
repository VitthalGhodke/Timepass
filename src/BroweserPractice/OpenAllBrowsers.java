package BroweserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAllBrowsers {

	public static void main(String[] args) {
		//Open the chrome
		String path1=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.close();
		//Open fireFox
		String path2=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path2);
		FirefoxDriver Fdriver=new FirefoxDriver();
		Fdriver.get("https://www.facebook.com");
		Fdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Fdriver.manage().window().maximize();
		Fdriver.close();
		//Open Edge
		String path3=System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path3);
		EdgeDriver Edriver=new EdgeDriver();
		Edriver.get("https://www.google.com");
		Edriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Edriver.manage().window().maximize();
		Edriver.close();
	}

}
