package com.wbl.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoPage1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//we are creating fileinputstream to access the location of our property file
FileInputStream fis=new FileInputStream("C:\\Users\\SAMEER\\eclipse-workspace\\DDrivenw12\\src\\com\\wbl\\utilities\\DataDriven12.properties");
//we are creating a properties class so that we could load the properties inside the filestream
Properties p=new Properties();
//I will load the file inside my property class
p.load(fis);
String myacctlocator=p.getProperty("myacct1");
String emaillocator=p.getProperty("email1");
String passlocator=p.getProperty("pass1");
String loginlocator=p.getProperty("login1");
String logoutlocator=p.getProperty("logout1");
System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.magento.com");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath(myacctlocator)).click();
driver.findElement(By.xpath(emaillocator)).sendKeys("sameersameer638@gmail.com");
driver.findElement(By.xpath(passlocator)).sendKeys("Innova@12345");
driver.findElement(By.xpath(loginlocator)).click();
driver.findElement(By.xpath(logoutlocator)).click();




	}

}
