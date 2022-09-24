package dropDownlist;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        driver.switchTo().frame("iframeResult");
        WebElement Dropdownlist=driver.findElement(By.name("cars"));
        Select s1=new Select(Dropdownlist);
        System.out.println(s1.isMultiple());
        List<WebElement> option=s1.getOptions();
        System.out.println("option count:"+option.size());
        for(int i=0;i<option.size();i++) {
        	System.out.println(option.get(i).getText());
        }
        s1.deselectByIndex(2);
	}

}
