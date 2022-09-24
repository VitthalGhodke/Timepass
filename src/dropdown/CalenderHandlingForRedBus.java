package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandlingForRedBus {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("label[for='src']")).click();
		driver.findElement(By.cssSelector("label[for='src']")).sendKeys("Pune");
		
		driver.findElement(By.cssSelector("label[for='dest']")).click();

	}

}
