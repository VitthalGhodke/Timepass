package dropDownlist;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dlist=driver.findElement(By.cssSelector("#Skills"));
		Select ss1=new Select(dlist);
		System.out.println(ss1.isMultiple());
		List<WebElement> list=ss1.getOptions();
        for(int i=0;i<list.size();i++) {
        	System.out.println(i+":"+list.get(i).getText());
        }
        System.out.println("Size of Dropdown List: "+list.size());
        
        ss1.selectByIndex(12);
        driver.close();
	}

}
