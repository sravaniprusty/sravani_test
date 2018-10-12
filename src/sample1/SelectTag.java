package sample1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MR. PRUSTY\\eclipse-workspace\\selenium1\\lib\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement inspected_month=driver.findElement(By.xpath("//select[@id='month']"));
        Select obj=new Select(inspected_month);
        WebElement ele=obj.getFirstSelectedOption();
        System.out.println("value first selected as"+ele.getText());
        
       // obj.selectByIndex(3);
      //obj.selectByValue("3");//selectbyvalue will accept only string argument
        obj.selectByVisibleText("Mar");
        WebElement ele1=obj.getFirstSelectedOption();   //it will return the first selected option
        System.out.println("value second selected as"+ele1.getText());
        
        
        //find number of elements in the list
        List<WebElement> li=obj.getOptions();
        int a=li.size();
        System.out.println("number of elements in the list are:" +a);
        
        //now we have to compere the actual result with expected result
        
        
        
        
	}

}
