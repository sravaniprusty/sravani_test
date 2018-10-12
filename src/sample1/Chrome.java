package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
