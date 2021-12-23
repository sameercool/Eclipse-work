package Basics1;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits1 {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe" );

ChromeDriver driver=new ChromeDriver();
driver.get("http://www.facebook.com");
WebDriverWait wait1=new WebDriverWait(driver,50);
WebElement e1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New Account")));
e1.click();
}
}