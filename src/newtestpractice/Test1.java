package newtestpractice;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class Test1 {
  
	
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://formy-project.herokuapp.com/form");
	  
	 
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   driver.findElement(By.cssSelector("#first-name")).sendKeys("Vitthal");
	   driver.findElement(By.cssSelector("#last-name")).sendKeys("Ghodke");
	   driver.findElement(By.cssSelector("#job-title")).sendKeys("Quality");
	   System.out.println(driver.findElement(By.cssSelector("#radio-button-3")).isSelected());//f
	   driver.findElement(By.cssSelector("#radio-button-3")).click();
	   System.out.println(driver.findElement(By.cssSelector("#radio-button-3")).isSelected());//t
	   driver.findElement(By.cssSelector("#checkbox-1")).click();
	 Select sl=new Select(driver.findElement(By.cssSelector("#select-menu")));
	 sl.selectByValue("3");
	 
	 
     driver.findElement(By.cssSelector("#datepicker")).click();
     Thread.sleep(3000);
	 driver.findElement(By.className("today active day")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.className("btn btn-lg btn-primary")).click();
	   
		

	}

}
