package com.wbl.webelements;


import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wbl.MagentoTests.Login;
import com.wbl.MagentoTests.Main;
import com.wbl.MagentoTests.Welcome;


public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(50L, TimeUnit.SECONDS);
	driver.get("https://www.magento.com");
	Welcome w=new Welcome(driver);
	w.clickOnSignIn();
	Login l=new Login(driver);
	l.typeEmail("sameersameer638@gmail.com");
	l.typePass("Innova@12345");
	l.clickOnLogin();
	Main m=new Main(driver);
	m.clickOnLogOut();
	

	
}
}
