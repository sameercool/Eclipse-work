package com.wbl.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wbl.pages.LoginPage1;
import com.wbl.pages.Main12;
import com.wbl.pages.WelcomePage1;

public class MagentoTests {
public static void mainn(String args[]) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.magento.com");
    WelcomePage1 w=new WelcomePage1(driver);
    w.clickOnSignIn();
    LoginPage1 l=new LoginPage1(driver);
    l.typeEmail("sameersameer638@gmail.com");
    l.typePass("Innova@12345");
    l.clickOnLogin();
    Main12 m=new Main12(driver);
    m.clickOnLogOut();
}
}
