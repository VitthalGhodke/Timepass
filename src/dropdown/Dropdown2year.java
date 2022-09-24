package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Dropdown2year {

	public static void main(String[] args) {
		String Drive="F:\\Acclaration\\Workspace\\SeleniumTesting11\\executables\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver",  Drive);
         
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.automationtesting.in/Register.html");
         driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         
         WebElement Year=driver.findElement(By.xpath("//select[@ng-model='yearbox']")) ;
        
         Select s2=new Select(Year);
         System.out.println(s2.isMultiple());
         List<WebElement> Option=s2.getOptions();
         
 		System.out.println("Option count:"+Option.size());
 		for(int i=0;i<Option.size();i++) {
			System.out.println(Option.get(i).getText()); 
 		}
 		s2.selectByVisibleText("2010"); 
 		//s2.selectByValue("1988");
 		WebElement month=driver.findElement(By.cssSelector("[placeholder='Month']"));
 		Select s3=new Select(month);
 		s3.selectByVisibleText("June");
 		
       
         
	}

}
