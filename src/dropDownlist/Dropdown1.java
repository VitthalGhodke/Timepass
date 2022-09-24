package dropDownlist;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
       driver.findElement(By.cssSelector("input[name='UserName']")).sendKeys("execution");
       driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("admin");
       driver.findElement(By.cssSelector("input[name='Login']")).click();
       
       WebElement Dlist=driver.findElement(By.cssSelector("#TitleId"));
       Select s1=new Select(Dlist);
       System.out.println("is multiselected:" +s1.isMultiple());
       List<WebElement> option=s1.getOptions();
       for(int i=0;i<option.size();i++) {
    	   System.out.println(option.get(i).getText());
        }
       String selectedValue=s1.getFirstSelectedOption().getText();
       System.out.println(selectedValue);
       s1.getFirstSelectedOption();
//       s1.selectByVisibleText("Ms.");
//     s1.selectByValue("t2");
     s1.selectByIndex(1);

	}

}
