package SeleniumWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//get to the facebook page
		driver.get("http://www.facebook.com");
		String ps=driver.getPageSource();
		System.out.println(ps);
		Thread.sleep(3000);
		driver.quit();
	}

}
