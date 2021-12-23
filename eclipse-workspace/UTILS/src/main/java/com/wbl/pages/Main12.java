package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main12 {
	WebDriver driver;
	By logout=By.linkText("Log Out");
	public Main12(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnLogOut() {
		driver.findElement(logout).click();
	}
}
