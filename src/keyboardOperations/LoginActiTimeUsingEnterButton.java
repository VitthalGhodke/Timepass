package keyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTimeUsingEnterButton {

	public static void main(String[] args) throws InterruptedException {
		String drive=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", drive);
		WebDriver Driver=new ChromeDriver();
        Driver.get("https://demo.actitime.com/");
        Driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
        Thread.sleep(3000);
        Driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
        Thread.sleep(4000);
	}

}
