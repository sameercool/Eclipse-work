package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage1 {
WebDriver driver;
By Signin=By.linkText("Sign In");
public WelcomePage1(WebDriver driver) {
	this.driver=driver;
}
public void clickOnSignIn() {
	driver.findElement(Signin).click();
}
}
