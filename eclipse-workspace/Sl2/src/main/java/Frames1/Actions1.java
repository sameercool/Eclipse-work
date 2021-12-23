package Frames1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement s1=driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver);
		//this method right clicks on a particular webelement
		//action.contextClick(s1).build().perform();
		//action for double click
		//action.doubleClick(s1).build().perform();
		//to hover over a particular webelement
		//action.moveToElement(s1).build().perform();
		//hover over the webelement using offset x and y
	int offsetx=s1.getRect().getX();
	int offsety=s1.getRect().getY();
	action.moveByOffset(offsetx, offsety).build().perform();
	driver.close();
	
	}

}
