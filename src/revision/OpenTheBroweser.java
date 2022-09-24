package revision;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTheBroweser {

	public static void main(String[] args) {
		
		String path="F:\\Acclaration\\Workspace\\SeleniumPractices\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.close();
	
	String path2=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", path2);
	FirefoxDriver driver2=new FirefoxDriver();
	driver2.get("https://facebook.com");
	driver2.close();
	
	String path3=System.getProperty("user.dir")+"\\executables\\msedgedriver.exe";
	System.setProperty("webdriver.edge.driver", path3);
	EdgeDriver driver3=new EdgeDriver();
	driver3.get("https://www.flipkart.com");
	driver3.close();
	}

}
