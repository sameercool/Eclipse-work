package SeleniumWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageURL {
	public static void main(String[] args)
	{
		//this is for setting path for the chrome browser
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
		//we are creating driver object using chrome Driver
		//this is 1st step starting chromedriver
		ChromeDriver driver=new ChromeDriver();
		//get to the facebook page
		driver.get("http://www.facebook.com");
		//to get the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		}
}