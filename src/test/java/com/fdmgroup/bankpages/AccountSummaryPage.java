package com.fdmgroup.bankpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSummaryPage {
	private static WebElement element;
	
	public static WebElement getAccountSummaryAccess(WebDriver driver){
		element=driver.findElement(By.xpath("//li[@id='account_summary_tab']/a"));
		return element;
	}
	
	public static WebElement getDetailsofFromAccount(WebDriver driver){
		element=driver.findElement(By.xpath("//td[3]"));
		return element;
	}
	
	public static WebElement getDetailsofToAccount(WebDriver driver){
		element=driver.findElement(By.xpath("//tr[2]/td[3]"));
		return element;
	}
	
	
}
