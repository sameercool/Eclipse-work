package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rdio1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://materializecss.com/radio-buttons.html");
WebElement radio1=driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[3]/label/span"));
radio1.click();
Thread.sleep(2000);
driver.quit();
}
}
