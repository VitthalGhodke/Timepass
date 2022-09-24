package revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardTabEnter {

	public static void main(String[] args) throws InterruptedException {
		String Drive="F:\\Acclaration\\Workspace\\SeleniumTesting11\\executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",  Drive);
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
        

	}

}
