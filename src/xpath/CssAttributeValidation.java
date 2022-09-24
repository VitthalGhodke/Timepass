package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssAttributeValidation {
	

	public static void main(String[] args) {
		String DriverPAth=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver",DriverPAth );
    	WebDriver driver=new ChromeDriver();
    	 driver.get( "https://demo.vtiger.com/vtigercrm/index.php");
    	 
    	 
    	 WebElement signInButton=driver.findElement(By.cssSelector("button[type='submit']"));
 		String fontSize=signInButton.getCssValue("font-size");
 		String fontColor=signInButton.getCssValue("color");
 		String fontBackgroundColor=signInButton.getCssValue("background-image");//RGBA format color code
 		System.out.println(fontSize);
 		System.out.println(fontColor);
 		System.out.println(fontBackgroundColor);
 		
 		String forgotPasswordLinkColor=driver.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");
		System.out.println("forgotPasswordLink color: "+forgotPasswordLinkColor);//RGBA format color code
	}

}
