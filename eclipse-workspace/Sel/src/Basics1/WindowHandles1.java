package Basics1;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/popup.php");
	driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	//to get main window
	String mainwindow=driver.getWindowHandle();
	Set<String> s1=driver.getWindowHandles();
	System.out.println("the number of windows are"+s1.size());
	for(String i:s1) {
		System.out.println("the child window is");
		System.out.println(driver.switchTo().window(i).getTitle());
	}
	driver.quit();
	}

}
