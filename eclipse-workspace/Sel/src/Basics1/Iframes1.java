package Basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//with the help of id and name
		//driver.switchTo().frame("moneyiframe");
		//using index
		driver.switchTo().frame(0);
		
		String nse=driver.findElement(By.id("nseindex")).getText();
		System.out.println(nse);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SPORTS")).click();
	}

}
