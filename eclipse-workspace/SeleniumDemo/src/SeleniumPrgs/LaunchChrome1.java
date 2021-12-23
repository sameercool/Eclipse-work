package SeleniumPrgs;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {

		public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium components\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
		}
	}
