package revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crickinfo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		 List<WebElement> options=driver.findElements(By.cssSelector(".ds-popper-wrapper>a"));
		 System.out.println(options.size());
		 for(WebElement list:options) {
			 System.out.println(list.getText());
	}
	

}
}
