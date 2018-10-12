package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
        driver.findElement(By.id("menu1")).click();
        driver.findElement(By.xpath("//a[text()='CSS']")).click();
        
		

	}

}
