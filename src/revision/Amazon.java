package revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		String Drive="F:\\Acclaration\\Workspace\\SeleniumTesting11\\executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",  Drive);
        
        WebDriver driver=new ChromeDriver();
        driver.get("http://amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
        driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
	}

}
