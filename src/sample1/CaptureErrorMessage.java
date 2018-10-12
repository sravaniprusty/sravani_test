package sample1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CaptureErrorMessage {

	@Test
	public void runner() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String Actual=driver.findElement(By.xpath("//div[text()='Enter an email or phone number']")).getText();
		String Expected="Enter an email or phone number";
		Assert.assertEquals(Actual, Expected);
		
		

	}

}
