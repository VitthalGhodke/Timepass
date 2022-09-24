package dropDownlist;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropDown {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement dropdown=driver.findElement(By.id("bsd1-button"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		dropdown.click();
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println("option count:"+ options.size());
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(9).click();
	    driver.close();
	}

}
