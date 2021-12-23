package SeleniumWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
driver.manage().window().maximize();
//path for the dropdown elements
WebElement dropdown=driver.findElement(By.id("cars"));
//creating select class for selecting a particular dropdown
Select s1=new Select(dropdown);
//select by index
s1.selectByIndex(2);
//select by value
s1.selectByValue("audi");
//select visible text
s1.selectByVisibleText("Volvo");

	}

}
