package BroweserPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		//Absolute path
				//String driverPath1="F:\\JavaWorkspace\\SeleniumPractice\\executables\\chromedriver.exe";
				//or Relative path --> '.' indicate current working dir
				//String driverPath2=".\\executables\\chromedriver.exe";
				//or using System class
				String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver", driverPath3);
				//create an instance of required browser class
				ChromeDriver cdriver=new ChromeDriver();
				
				//need to enter application URL in the opened browser
				cdriver.get("https://www.google.com");
				
				//get the entered URL from the opened browser
				String appCurrentUrl=cdriver.getCurrentUrl();
				String expectedUrl="https://www.google.com";
				System.out.println("Actaul URL:"+appCurrentUrl);
				System.out.println("Expected URL: "+expectedUrl);
				if(appCurrentUrl.contains(expectedUrl)) {
					System.out.println("Current URL validation is passed");
				}else {
					System.out.println("Current URL validation is Failed");
				}
				
				//verify that Google search page is opened or not using title
				String actualTitle=cdriver.getTitle();
				String expectedTitle="Google";
				System.out.println("ActualTitle:"+actualTitle);
				System.out.println("ExpectedTitle: "+expectedTitle);
				if(actualTitle.equals(expectedTitle)) {
					System.out.println("Title validation is passed");
				}else {
					System.out.println("Title validation is Failed");
				}
				//close current browser
				cdriver.close();		
						
						
						
						
						

	}

}
