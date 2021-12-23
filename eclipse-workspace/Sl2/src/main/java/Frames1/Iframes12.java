package Frames1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.rediff.com/");
//iframe using name or id
//driver.switchTo().frame("moneyiframe");
//switching to ifame using index
driver.switchTo().frame(0);
String n=driver.findElement(By.id("nseindex")).getText();
System.out.println(n);
//getting outside the iframe
driver.switchTo().parentFrame();
driver.findElement(By.linkText("SPORTS")).click();


	}

}
