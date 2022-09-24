package seleniumPracticeDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForActiTime {

	public static void main(String[] args) throws InterruptedException {
		String Path=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://demo.actitime.com/login.do");
		cdriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cdriver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		cdriver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		
		cdriver.findElement(By.cssSelector("[id='loginButton']")).click();
		cdriver.manage().window().maximize();
		Thread.sleep(5000);
		//explicitly wait
		WebElement log=cdriver.findElement(By.cssSelector("[id='logoutLink']"));
		WebDriverWait wait=new WebDriverWait(cdriver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(log));
		System.out.println(cdriver.getTitle());
		System.out.println(cdriver.getTitle().length());
		log.click();
	    cdriver.quit();
		

	}

}
