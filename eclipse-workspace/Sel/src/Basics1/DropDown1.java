package Basics1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
//for select by index and select byy visible text the path is as follows
WebElement dropDown=driver.findElement(By.id("cars"));


	Select s1=new Select(dropDown);
	//i)select by index
	s1.selectByIndex(1);
	//iii)select by value
		s1.selectByValue("o pel");
	//ii)select by visible text
	s1.selectByVisibleText("Audi");
	
	List<WebElement> list1=s1.getOptions();
	for(WebElement i1:list1) {
		System.out.println(i1.getText());
	}
	driver.quit();
	}

}
