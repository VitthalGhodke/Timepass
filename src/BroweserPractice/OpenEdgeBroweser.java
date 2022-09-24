package BroweserPractice;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBroweser {

	public static void main(String[] args) {
		String DriverPath=".\\executables\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",DriverPath );
		//String Path=System.getProperty( "DriverPath");
		EdgeDriver Drive=new EdgeDriver();
		
		Drive.get("https:www.google.com");
		
		String Obj=Drive.getCurrentUrl();
		System.out.println(Obj);

	}

}
