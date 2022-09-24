package xpath;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoOrdinateValidation {

	public static void main(String[] args) {
		String Drive=".\\executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",Drive);
	    ChromeDriver driver=new ChromeDriver();//Direct Way
	    //or
	   // WebDriver driver1=new ChromeDriver();//Generic Way
	    
	    driver.get("https://www.Facebook.com");
	   WebElement Signbutton= driver.findElementByCssSelector("button[type='submit']");
	   String Fontsize=Signbutton.getCssValue("font-size");
	   String FontColor=Signbutton.getCssValue("color"); 
	   String fontBackgroundC=Signbutton.getCssValue("background-color");
	    System.out.println(Fontsize);
	    System.out.println(FontColor);
	    System.out.println(fontBackgroundC);
	}

}
