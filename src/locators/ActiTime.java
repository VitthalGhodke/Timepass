package locators;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
	String DriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",DriverPath);
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String expectedTitle="actiTIME - Login";
	String actualTitle=driver.getTitle();
	
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Login page opened sucessfully...");
	}else {
		System.out.println("Either login page not opened or page title got changed");
	}
	//identify the required element from the UI
			WebElement userNameInput=driver.findElement(By.id("username"));
			//perform appropriate action the identified element
			userNameInput.sendKeys("admin234567");
			
			//remove existing text from the input field
			userNameInput.clear();
			userNameInput.sendKeys("admin");
			
			//identify the required element from the UI
			WebElement passwordInput=driver.findElement(By.name("pwd"));
			//perform appropriate action the identified element
			passwordInput.sendKeys("manager");
			//identify the required element from the UI
			WebElement loginButton=driver.findElement(By.id("loginButton"));
			//perform appropriate action the identified element
			loginButton.click();
			driver.close();
	
	}

}
