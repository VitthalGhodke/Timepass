package multipleelementhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazePhone {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicitly wait
		
		driver.get("https://www.demoblaze.com/");

	List<WebElement> Phone=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	
	System.out.println("Number of Phones present on Home page: "+Phone.size());
	for(WebElement element:Phone) {
		System.out.println(element.getText());
	}
  
  
	}

}
