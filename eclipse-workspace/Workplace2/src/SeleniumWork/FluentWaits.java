 package SeleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaits {
	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//it should get to the facebook.com page
		
		driver.get("http://www.facebook.com");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(20, TimeUnit.SECONDS) 			
				.pollingEvery(500, TimeUnit.MILLISECONDS); 	
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Create New Account")));
   driver.findElement(By.linkText("Create New Account")).click();
  
}
}
