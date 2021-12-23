package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//get to the facebook page
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement  e2=driver.findElement(By.linkText("Forgotten password?"));
		e2.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
