package SeleniumWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagandClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//this is for setting path for the chrome browser
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//it should get to the facebook.com page
		
		driver.get("http://www.facebook.com");
		WebElement e1=driver.findElementByCssSelector("input.inputtext");
		e1.sendKeys("user@gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}

}
