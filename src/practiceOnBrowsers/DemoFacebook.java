package practiceOnBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFacebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		String title="Facebook – log in or sign up";
		String ActTitle=driver.getTitle();
       if(title.equals(ActTitle)) {
    	   System.out.println("Browser is open");
       }else {
    	   System.out.println("Something Wrong");
   }
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.findElement(By.cssSelector("#email")).sendKeys("Vtthal");
   driver.findElement(By.cssSelector("#pass")).sendKeys("Ghodke");    
    driver.findElement(By.cssSelector("[value='1']")).click();
    
driver.close();
	}


	}

