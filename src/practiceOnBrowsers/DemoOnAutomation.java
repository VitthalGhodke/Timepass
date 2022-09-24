package practiceOnBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOnAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        System.out.println("Before Login Url:"+driver.getCurrentUrl());
        System.out.println("Before Login Title:"+driver.getTitle());
        String Url="https://demosite.executeautomation.com/Login.html";
        String Acturl=driver.getCurrentUrl();
        if(Url.equals(Acturl)) {
        	System.out.println("Page open");
        }else {
        	System.out.println("Something Wrong");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    WebElement InputUsername=driver.findElement(By.name("UserName"));
    //Thread.sleep(30000);
//    InputUsername.sendKeys("executionXYZ");
//    InputUsername.clear();
     InputUsername.sendKeys("execution");
     WebElement InputPass=driver.findElement(By.name("Password"));
     InputPass.sendKeys("admin123");
     InputPass.clear();
     InputPass.sendKeys("admin");
//     driver.findElement(By.cssSelector("input[type='submit']")).click();
//     System.out.println("After Login Url:"+driver.getCurrentUrl());
//     System.out.println("After Login Title:"+driver.getTitle());
//     driver.findElement(By.cssSelector("a[href='Login.html']")).click();
    // driver.close();
	}

}
