package multipleelementhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggesion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("Vitthal");
		List<WebElement> list=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>div>div[class='wM6W7d']"));
		System.out.println("List Count:"+list.size());
		for(WebElement listcount:list) {
			System.out.println("Get List: "+listcount.getText());
			
			//driver.close();
		}
	}

}
