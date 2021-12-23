package SeleniumWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagANDATTR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//this is for setting path for the chrome browser
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//it should get to the facebook.com page
		
		driver.get("http://www.facebook.com");
		WebElement e2=driver.findElementByCssSelector("input[id='email']");
		e2.sendKeys("user@gmail.com");
		Thread.sleep(3000);
		driver.quit();
	}

}
