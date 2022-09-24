package BroweserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin2 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        String ActTitle=driver.getTitle();
        String ExptTitle="actiTIME - Login";
        if(ActTitle.equals(ExptTitle)) {
        	System.out.println("Page open Successfuly");
        }else {
        	System.out.println("somthing Wrong");
        }
       WebElement USfield=driver.findElement(By.id("username")); 
       USfield.sendKeys("admin");
       WebElement PSfield=driver.findElement(By.name("pwd")); 
       PSfield.sendKeys("manager");
       driver.findElement(By.id("loginButton")).click();
       driver.close();
	}

}
