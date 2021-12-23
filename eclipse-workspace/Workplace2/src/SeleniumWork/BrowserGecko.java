package SeleniumWork;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserGecko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\selenium components\\geckodriver.exe");
		FirefoxDriver d1=new FirefoxDriver();
	}

}
