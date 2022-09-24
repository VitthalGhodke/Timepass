package dropDownlist;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOmayo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement Dropdown=driver.findElement(By.cssSelector("#multiselect1"));
		Select Drop=new Select(Dropdown);
		System.out.println(Drop.isMultiple());
//		WebElement Selectoption=Drop.getFirstSelectedOption();
//		String optname=Selectoption.getText();
//		System.out.println(optname);
		List<WebElement> option=Drop.getOptions();
		System.out.println(option.size());
	    for(int i=0;i<option.size();i++) {
	    	System.out.println("option "+i+":"+option.get(i).getText());
	    }
	    Drop.selectByIndex(2);
		

	}

}
