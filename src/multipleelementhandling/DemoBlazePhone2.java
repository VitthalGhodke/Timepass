package multipleelementhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazePhone2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize the window
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicitly wait

		driver.get("https://www.demoblaze.com/");

		WebElement laptop=driver.findElement(By.xpath("//a[text()='Laptops']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(laptop));
		laptop.click();
		List<WebElement> laptoplist=driver.findElements(By.cssSelector("div#tbodyid>div>div>div:nth-child(2)>h4>a"));
		System.out.println("List of LAptop:"+laptoplist.size());
		System.out.println("Number of Laptop present on Home page: "+laptoplist.size());
		for(WebElement element:laptoplist) {
			System.out.println(element.getText());
		}
	}
	}


