package SeleniumWork1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		// we are typecasting driver to javascriptexecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("alert('welcome to whiteboxQA')");
		js.executeAsyncScript("window.setTimeout(function(){alert('2nd message to be displayed');},4000);alert('first text message to display');");
	
        
		
	}

}
