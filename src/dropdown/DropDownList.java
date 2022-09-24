package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		String Drive="F:\\Acclaration\\Workspace\\SeleniumTesting\\executables\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver",Drive);
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//1. Identify the dropdown list and store it into WebElement
		WebElement Month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
		//WebElement Year=driver.findElement(By.xpath("//select[@ng-model='yearbox']")) ;
		
		/*2. Create an instance of Select class(predined class in Selenium) and pass dropdown list 
		   WebElement as a parameter in its constructor  */ 
		Select s1 =  new Select(Month);
		System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
		//Op1: count the options present in dropdown
		List<WebElement> Option=s1.getOptions();
		System.out.println("Option count:"+Option.size());
		for(int i=0;i<Option.size();i++) {
			System.out.println(Option.get(i).getText());
		}
		s1.selectByIndex(7);
		
		
	}

}
