package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
	WebDriver driver;
	By email=By.id("email");
	By pass=By.id("pass");
	By login=By.id("send2");
	public LoginPage1(WebDriver driver) {
		this.driver=driver;
	}
		public void typeEmail(String em) {
			driver.findElement(email).sendKeys(em);
		}
		public void typePass(String pw) {
			driver.findElement(pass).sendKeys(pw);
		}
		public void clickOnLogin() {
			driver.findElement(login).click();
		}
	
	
}
