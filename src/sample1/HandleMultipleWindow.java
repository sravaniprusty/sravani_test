package sample1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//it will return the address of the current page
		String parent=driver.getWindowHandle();
		
		//it will return set of all the address of the pages which are on the current page
		Set<String> child=driver.getWindowHandles();	
		
		int s=driver.getWindowHandles().size();
		System.out.println("Number of windows on the current page"+s);
		
		for(String str:child)
		{
			if(!str.equals(parent))
			{
				driver.switchTo().window(str);
				driver.close();
			}
		
		}
		
		driver.switchTo().window(parent);		
		
		
		
		
	}

}
