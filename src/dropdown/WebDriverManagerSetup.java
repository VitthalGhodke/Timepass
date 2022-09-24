package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSetup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/");
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		WebElement dropdownList=driver.findElement(By.id("TitleId"));
		/*2. Create an instance of Select class(predined class in Selenium) and pass dropdown list 
		   WebElement as a parameter in its constructor  */ 
			Select s1 =  new Select(dropdownList);
			System.out.println("Is it multiselect dropdownlist:"+s1.isMultiple());
			//Op1: count the options present in dropdown
			List<WebElement> options=s1.getOptions();
			System.out.println("Option  count: "+options.size());
		
			//op2: print all the option name
			for(int i=0;i<options.size();i++) {
				System.out.println(options.get(i).getText());
				
				//op3: get already selected option
				String selectedValue=s1.getFirstSelectedOption().getText();
				System.out.println(selectedValue);
				//op4: select required value from dropdown
				s1.selectByVisibleText("Mr."); //or
				//s1.selectByValue("t2");//or
				//s1.selectByIndex(1);
				System.out.println(s1.getFirstSelectedOption().getText());
			}
	}

}
