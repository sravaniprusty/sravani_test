package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='txtReturnJourneyDate']")).click();
		
		//it will returns all the rows value
		int x=driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		System.out.println("Number of rows in table"+x);
		
		
		List<WebElement> dates=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for(WebElement ele:dates)
		{
			if (ele.getText().equals("14"))
				ele.click();
			    System.out.println("clicked 14th of this month");
			    break;
		}
		
		
		

	}

}
