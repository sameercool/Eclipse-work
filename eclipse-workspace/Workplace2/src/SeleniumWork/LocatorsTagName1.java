package SeleniumWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTagName1 {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
			//we are creating driver object using chrome Driver
			//this is 1st step starting chromedriver
			ChromeDriver driver=new ChromeDriver();
			//get to the facebook page
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com");
			
			
			List<WebElement> elements=driver.findElements(By.tagName("button"));
					for(WebElement i:elements) {
						System.out.println(i.getText());
					}
		
			driver.quit();
		


	}

}
