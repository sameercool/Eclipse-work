import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	//using index
	driver.switchTo().frame(0);
   //using id or name
	driver.switchTo().frame("moneyiframe");
	String nse=driver.findElement(By.id("nseindex")).getText();
	System.out.println(nse);
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("sports")).click();
	
}
}
