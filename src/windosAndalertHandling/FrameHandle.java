package windosAndalertHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Checkboxradio']")).click();
		//taking control inside the frame from main page
		//driver.switchTo().frame(0);
		//Identify the frame 
		WebElement e1=driver.findElement(By.cssSelector(".demo-frame"));
		//switch control to the frame
		driver.switchTo().frame(e1);
		driver.findElement(By.xpath("//label[@for='radio-1']")).click();
		//coming back to main page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
	 //util.cleanUp();

	}

}
