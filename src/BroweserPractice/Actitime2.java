package BroweserPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime2 {

	public static void main(String[] args) {
		String DriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", DriverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String ActualTitle="Google";
		String AcceptedTitel=driver.getTitle();
		
		if(ActualTitle.equals(AcceptedTitel)) {
			System.out.println("login success");
		}else {
			System.out.println("Somthing Wrong");
		}
		WebDriverWait WaitingForEnterField =new WebDriverWait(driver,15);
		WebElement userNameInputField=driver.findElement(By.cssSelector("[class='gb_1 gb_2 gb_8d gb_8c']"));
		WaitingForEnterField.until(ExpectedConditions.elementToBeClickable(userNameInputField)).click();
		//WebDriverWait WaitingForUsername =new WebDriverWait(driver,30);
		WebElement WaitingForUsername1=driver.findElement(By.id("identifierId"));
		WaitingForUsername1.sendKeys("ghodkevitthal7795@gmail.com");
		
		//WebDriverWait WaitingForEnterField2 =new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		//WaitingForEnterField2.until(ExpectedConditions.elementToBeClickable(nexbutton)).click();
		
	}

}
