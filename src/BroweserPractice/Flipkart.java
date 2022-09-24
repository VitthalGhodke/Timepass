package BroweserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		String path1=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class='_2IX_2- VJZDxU']")).sendKeys("9604559219");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("9604559219");
		driver.findElement(By.cssSelector("[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        driver.findElement(By.cssSelector("[alt='Mobiles']")).click();
	}

}
