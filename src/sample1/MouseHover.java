package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.naukri.com/");
   
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[text()=\"More\"]"))).perform();
        //if one operation is there then only perform() otherwise build().perform()
        

	}

}
