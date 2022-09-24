package seleniumPracticeDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		String Path= System.getProperty("user.dir")+".\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", Path);
		WebDriver fdriver=new FirefoxDriver();
		fdriver.get("https://demosite.executeautomation.com/Login.html");
		System.out.println(fdriver.getTitle());
		System.out.println(fdriver.getTitle().length());
		System.out.println(fdriver.getCurrentUrl().length());
		String ActURL="https://demosite.executeautomation.com/Login.html";
		String ExptURL=fdriver.getCurrentUrl();
		if(ActURL.equals(ExptURL)) {
			System.out.println("PAssed");
		}else {
			System.out.println("Fails");
		}
		fdriver.findElement(By.cssSelector("[name='UserName']")).sendKeys("execution");
		fdriver.findElement(By.cssSelector("[name='Password']")).sendKeys("admin");
		fdriver.findElement(By.cssSelector("INPUT[name='Login']")).click();
		System.out.println(fdriver.getCurrentUrl());
		System.out.println(fdriver.getTitle());
		fdriver.findElement(By.xpath("//span[text()='Logout']")).click();
		fdriver.close();
	}

}
