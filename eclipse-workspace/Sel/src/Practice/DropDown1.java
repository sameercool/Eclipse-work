package Practice;

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
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select s1=new Select(dropdown);
		s1.selectByIndex(0);
		s1.selectByValue("audi");
		List<WebElement> list1=s1.getOptions();
		for(WebElement i:list1) {
			System.out.println(i.getText());
		}
	}

}
