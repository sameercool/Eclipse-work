package SeleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {
	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//it should get to the facebook.com page
		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e2=driver.findElement(By.id("email"));
		e2.sendKeys("user@gmail.com");
}
}
