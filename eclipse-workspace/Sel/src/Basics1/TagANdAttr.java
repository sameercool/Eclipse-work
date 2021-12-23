package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagANdAttr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	         ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	        //tagattribute and value
	        //driver.findElement(By.cssSelector("input[id=email]")).sendKeys("sam");
	        //tagclass attribute value
	        //driver.findElement(By.cssSelector("input.inputtext[id='email']")).sendKeys("sam");
	        //starts with^
	        //driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("sam");
	        //ends with $
	        //driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("sam");
	        //contains *
	        driver.findElement(By.cssSelector("input[id*='ma']")).sendKeys("sam");
	        
	}

}
