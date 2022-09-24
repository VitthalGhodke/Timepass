package seleniumPracticeDay1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GSMArena {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
   driver.get("https://www.gsmarena.com/");
   String Exptitle=driver.getTitle();
   System.out.println(Exptitle);
   String ActTitle="GSMArena.com - mobile phone reviews, news, specifications and more...";
   System.out.println(ActTitle);
   if(Exptitle.equals(ActTitle)) {
	   System.out.println("Passed");
   }else {
	   System.out.println("fail");
   }
 List<WebElement> list=driver.findElements(By.cssSelector("html>body>div#wrapper>div#outer>div#body>aside>div[class='brandmenu-v2 light l-box clearfix']>ul"));
 System.out.println(list.size());
 for(WebElement phones:list) {
	 System.out.println(phones.getText());
 }
driver.findElement(By.cssSelector("[type='button']")).click();
 List<WebElement> list2=driver.findElements(By.cssSelector("#menu"));
 System.out.println(list2);
 for(WebElement Home:list2) {
	 System.out.println(Home.getText());
 }
}
}
