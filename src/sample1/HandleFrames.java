package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/01/frames-in-selenium-webdriver.html");
		
		int s=driver.findElements(By.tagName("iframe")).size();
		System.out.println("number of frames in the pages are"+s);
		
		//if an element is inside an frame then we have to first move to the frame then inspect the element
		//we can switch to a frame with the help of index,id or name,webelement
		Thread.sleep(500);
		driver.switchTo().frame("comment-editor");
		driver.findElement(By.xpath("//input[@id='postCommentSubmit']")).click();
		
		System.out.println("happy");
	}

}
