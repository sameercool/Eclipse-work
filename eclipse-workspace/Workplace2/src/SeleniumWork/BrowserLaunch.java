package SeleniumWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args)
{
	//this is for setting path for the chrome browser
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	//we are creating driver object using chrome Driver
	//this is 1st step starting chromedriver
	ChromeDriver driver=new ChromeDriver();
	//it should get to the facebook.com page
	
	//driver.get("http://www.facebook.com");
	driver.get("http://demo.guru99.com/v4/index.php");
	driver.findElementByXPath("//input[@type='text']");

}
}
