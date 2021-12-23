package SeleniumWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagID {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//get to the facebook page
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		//this is a tag ID
		WebElement e1=driver.findElementByCssSelector("input#email");
		e1.sendKeys("user@gmail.com");
	}
}
