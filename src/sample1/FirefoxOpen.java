package sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpen {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");

	}

}
