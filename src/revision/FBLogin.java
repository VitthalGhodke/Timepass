package revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FBLogin {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement inputfield=driver.findElement(By.cssSelector("[id='email']"));
		inputfield.sendKeys("Vitthal");
		inputfield.clear();
		inputfield.sendKeys("9604559219");
		WebElement password=driver.findElement(By.cssSelector("[id='pass']"));
		password.sendKeys("9604559219");
		password.clear();
		password.sendKeys("Vitthal@123");
		System.out.println("Input field "+inputfield.isDisplayed());
		System.out.println(inputfield.isEnabled());
		System.out.println(inputfield.isSelected());
		System.out.println("Password "+password.isDisplayed());
		System.out.println(password.isEnabled());
		System.out.println(password.isSelected());
		
		WebElement btn=driver.findElement(By.cssSelector("[name='login']"));
		System.out.println("Button "+btn.isDisplayed());
		System.out.println(btn.isEnabled());
		System.out.println(btn.isSelected());
		
		
		
	driver.close();

	}

}
