package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWait {

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
		WebDriverWait WaitingForEnterField =new WebDriverWait(driver,30);
		WebElement userNameInputField=driver.findElement(By.cssSelector("[class='gb_1 gb_2 gb_8d gb_8c']"));
		WaitingForEnterField.until(ExpectedConditions.elementToBeClickable(userNameInputField)).click();
		//driver.findElement(By.cssSelector("[class='gb_1 gb_2 gb_8d gb_8c']")).click();
		
		
	}

}
