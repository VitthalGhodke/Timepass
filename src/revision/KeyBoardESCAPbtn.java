package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardESCAPbtn {

	public static void main(String[] args) {
		String Drive="F:\\Acclaration\\Workspace\\SeleniumTesting11\\executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",  Drive);
        
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
        

	}

}
