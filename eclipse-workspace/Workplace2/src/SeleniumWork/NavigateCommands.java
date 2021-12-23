package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//get to the facebook page
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?"));
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

}