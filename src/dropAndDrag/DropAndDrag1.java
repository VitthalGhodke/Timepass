package dropAndDrag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class DropAndDrag1 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded")); 
		driver.switchTo().frame(frame);
		Actions act=new Actions(driver);
		List<WebElement> Source=driver.findElements(By.cssSelector("ul#gallery>li"));
		
		WebElement target=driver.findElement(By.cssSelector("div[id='trash']"));
		act.dragAndDrop(Source.get(0), target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(Source.get(1), target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(Source.get(2), target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(Source.get(3), target).build().perform();
		driver.close();
	}

}
