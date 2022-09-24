package BroweserPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://Demo.actitime.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String ActTitle="actiTIME - Login";
		if(ActTitle.equals(driver.getTitle())) {
			System.out.println("Browser open sucessfuly");
		}else {
			System.out.println("Something wrong");
		}
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		driver.findElement(By.cssSelector("[class='content tasks']")).click();
		List<WebElement> customer=driver.findElements(By.cssSelector("[class='sortableTableHeader active asc']"));
		System.out.println(customer.size());
		System.out.println(customer);

		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement logoutbtn=driver.findElement(By.cssSelector("[id='logoutLink']"));
		wait.until(ExpectedConditions.elementToBeClickable(logoutbtn)).click();
 	    driver.close();
	}

}
