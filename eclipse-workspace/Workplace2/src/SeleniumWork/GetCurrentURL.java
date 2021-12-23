package SeleniumWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//get to the facebook page
		driver.get("http://www.facebook.com");
		//to get the current url 
		String curl=driver.getCurrentUrl();
		
		System.out.println(curl);
		Thread.sleep(3000);
		driver.quit();
	}

}
