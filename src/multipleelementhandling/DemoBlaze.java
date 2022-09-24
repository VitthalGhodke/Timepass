package multipleelementhandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		String DriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", DriverPath );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //Maximize the window
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		WebElement categories=driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		System.out.println(categories.isDisplayed());
		System.out.println(categories.isEnabled());
		System.out.println(categories.getText().equals("CATEGORIES"));

		
		WebElement phone=driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		System.out.println(phone.isDisplayed());
		System.out.println(phone.isEnabled());
		System.out.println(phone.getText().equals("Phones"));
	
		
		WebElement laptop=driver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		System.out.println(laptop.isDisplayed());
		System.out.println(laptop.isEnabled());
		System.out.println(laptop.getText().equals("Laptops"));
		
		WebElement monitors=driver.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
		System.out.println(monitors.isDisplayed());
		System.out.println(monitors.isEnabled());
		System.out.println(monitors.getText().equals("Monitors"));
	driver.close();
	}

}
