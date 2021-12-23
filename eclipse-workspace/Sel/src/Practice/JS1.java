package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
       driver.get("https://google.com");
       
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("alert('welcome to whitebox QA')");
Alert alert=driver.switchTo().alert();
Thread.sleep(2000);
System.out.println(alert.getText());
alert.dismiss();
	}

}
