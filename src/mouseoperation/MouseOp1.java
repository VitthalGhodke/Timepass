package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseOp1 {

	public static void main(String[] args) {
		String K= System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", K);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement Firstname=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		Firstname.sendKeys("admin");
		//create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		//with the help of Actions class reference perform appropriate action
		act.moveToElement(Firstname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	   //paste it in last name field
		WebElement lastname1=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		act.moveToElement(lastname1).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
