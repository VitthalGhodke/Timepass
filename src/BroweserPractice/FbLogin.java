package BroweserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FbLogin {

	public static void main(String[] args) {
		String DriverPath=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",DriverPath);
		WebDriver Drive=new ChromeDriver();
		
		Drive.get("https://www.facebook.com/");
		Drive.manage().window().maximize();
		System.out.println(Drive.getCurrentUrl());
		System.out.println(Drive.getTitle());
		Drive.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String expectedTitle="Facebook – log in or sign up";
		String actualTitle=Drive.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		WebElement InputUserName=Drive.findElement(By.cssSelector("#email"));
		InputUserName.sendKeys("9604559219");
		
		WebElement InputPassword=Drive.findElement(By.cssSelector("#pass"));
		InputPassword.sendKeys("Vitthal@123");
		//WebDriverWait WaitingForEnterField =new WebDriverWait(Drive,30);
		
		Drive.findElement(By.cssSelector("button[value='1']")).click();
	
	}

}
