package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {
	public static void main(String args[]) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\IE\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
