package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=bootstrap+login");
		driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();
		
		//now boot strap will pop up
		//bootstrap means after clicking on login button a pop up button will come to give id and pw
		//if that pop up window is in side a frame then we have to move frame then inspect the element
		

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sravani");
		System.out.println("hi");

	}

}
