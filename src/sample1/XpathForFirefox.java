package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathForFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\gecko\\geckodriver.exe");
	//	System.setProperty("webdriver.firefox.bin", "C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\gecko\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/login/");
		
		driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("sravani");
		driver.findElement(By.xpath("//input[@class='button button-primary button-large']")).click();
		driver.findElement(By.xpath("//input[@class='input'][@id='user_pass']")).sendKeys("demo");
		driver.quit();
		//span[contains(@class,'display')][1]
	}
	

}
