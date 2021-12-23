package Basics1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
WebElement w1=driver.findElement(By.id("email"));
w1.sendKeys("whitebox@gmail.com");


}
	

}
