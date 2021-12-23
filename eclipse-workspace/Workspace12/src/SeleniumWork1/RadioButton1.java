package SeleniumWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//go to the website having buttons 
		driver.get("https://materializecss.com/radio-buttons.html");
		//used to maximize the window
		driver.manage().window().maximize();
		//create a webelement to store this button
		WebElement button=driver.findElement(By.xpath("//*[@id=\"radio\"]/form/p[3]/label/span"));
		//clicking on the particular button(green)
		button.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
