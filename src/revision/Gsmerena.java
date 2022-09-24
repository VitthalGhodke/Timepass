package revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gsmerena {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		driver.manage().window().maximize();
		 List<WebElement> phonelist=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		 System.out.println(phonelist.size());
		 for(WebElement list:phonelist) {
			 System.out.println(list.getText());
		 }
		

	}

}
