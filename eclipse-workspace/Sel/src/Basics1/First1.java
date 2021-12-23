package Basics1;

import org.openqa.selenium.chrome.ChromeDriver;

public class First1 {
	public static void main(String[] args0) {
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
	System.out.println(driver.getCurrentUrl());
	}
	
}
