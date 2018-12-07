package com.fdmgroup.bankpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {
	private static WebElement element;
	
	public static WebElement getAccountSettingsAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='settingsBox']/ul/li[2]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement getPrivacySettingsAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='settingsBox']/ul/li[2]/ul/li[2]/a"));
		return element;
	}
}
