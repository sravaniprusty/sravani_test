package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://seleniumpractise.blogspot.com/search?q=alert");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
	    
	    //it will navigate to alert window
	    driver.switchTo().alert().accept();

	}

}
