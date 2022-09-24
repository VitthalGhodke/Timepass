package revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Vitthal");
        List<WebElement> list=driver.findElements(By.cssSelector(".OBMEnb>ul>li"));
        System.out.println(list.size());
        for(WebElement listcount:list) {
        	System.out.println(listcount.getText());
        }
	}

}
