package seleniumPracticeDay1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateKey {

	public static void main(String[] args) throws InterruptedException {
//		String path="F:\\Acclaration\\Workspace\\SeleniumTesting11\\executables\\chromedriver.exe";
//		String path1=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//setUp("chrome","https://www.Google.com");
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(500, 800));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		

	}

}
