package Basics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(5, TimeUnit.SECONDS)
			.pollingEvery(200, TimeUnit.MICROSECONDS);
	driver.findElement(By.linkText("Create New Account")).click();
	
	
	}

}
