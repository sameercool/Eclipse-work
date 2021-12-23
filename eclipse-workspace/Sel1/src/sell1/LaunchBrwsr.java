package sell1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrwsr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium components\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	}
}
