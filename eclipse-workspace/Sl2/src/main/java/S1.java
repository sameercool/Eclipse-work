import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement s1=driver.findElement(By.linkText("Gmail"));
	Actions action=new Actions(driver);
//context click helps to right click on the webelement
	//action.contextClick(s1).build().perform();
//to double click on a webelement
    //action.doubleClick(s1).build().perform();
//it is used to hover over the webelement
    //action.moveToElement(s1).build().perform();
//hovers on the webelement with offset x and y range
	// int xOffset = s1.getRect().getX();
  //int yOffset = s1.getRect().getY();
      //action.moveByOffset(xOffset, yOffset).build().perform();
	
	

}
}
