package Basics1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.gmail.com");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        System.out.println(driver.getTitle());
	        driver.quit();
	}

}
