package windosAndalertHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class WindowHandling2 {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");

		// get current window unique id
		String homePageWinId = driver.getWindowHandle();//T1
		System.out.println("Home page window ID: " + homePageWinId);

		driver.findElement(By.cssSelector("a[href='https://www.facebook.com/trippozo']")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All Window ID:"+allWinIds);
		Iterator<String> itr = allWinIds.iterator();
		String childWinId = itr.next();
		driver.switchTo().window(childWinId);
	
		driver.findElement(By.cssSelector("input[placeholder='Email or phone']")).sendKeys("9604559219");
		
	}

}
