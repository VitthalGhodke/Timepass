package BroweserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
	String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", path);
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("https://www.Facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    System.out.println("Title:"+driver.getTitle());
    System.out.println("CurrentUrl:"+driver.getCurrentUrl());
    String ExpTitle="Facebook – log in or sign up";
    if(driver.getTitle().equals(ExpTitle)) {
    	System.out.println("Title validation is passed");
    }else {
    	System.out.println("Somthing Wrong");
    }
    driver.close();
	}

}
