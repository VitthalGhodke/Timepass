package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get( "https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
//		//close login popup
		driver.findElement(By.cssSelector(".langCard.fixedCard.bounceAni>span")).click();
//		//identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
//		//select any date from next month
//		
	driver.findElement(By.cssSelector("div.DayPicker-Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth-child(2)>div>p")).click();
        Thread.sleep(5000);
//		driver.findElement(By.cssSelector("a[class='close']")).click();
	}

}
