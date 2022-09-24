package seleniumPracticeDay1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOrange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().setSize(new Dimension (600,800));
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		System.out.println("Current page Title:"+driver.getTitle());
		System.out.println("Current page url:"+driver.getCurrentUrl());
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.facebook.com");
       driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
       driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");      
	   driver.findElement(By.cssSelector("input#btnLogin")).click();
	   List<WebElement>Content=driver.findElements(By.cssSelector("ul#mainMenuFirstLevelUnorderedList"));
	   System.out.println(Content.size());
	}

}
