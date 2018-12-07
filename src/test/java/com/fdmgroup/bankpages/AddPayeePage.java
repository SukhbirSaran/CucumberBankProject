package com.fdmgroup.bankpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPayeePage {

	public static WebElement element;
	
	public static WebElement getPayBillsAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='pay_bills_tab']/a"));
		return element;
	}
	
	public static WebElement getPayBillsPageWecomeTextAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='ui-tabs-1']/h2"));
		return element;
	}
	
	public static WebElement getAddNewPayeeAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='tabs']/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement getaddNewPayeePageTextAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@id='ui-tabs-2']/h2"));
		return element;
	}
	
	public static WebElement getaddNewPayeeNameAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='np_new_payee_name']"));
		return element;
	}
	
	public static WebElement getaddNewPayeeAddressAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='np_new_payee_address']"));
		return element;
	}
	 
	public static WebElement getaddNewPayeeAccountAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='np_new_payee_account']"));
		return element;
	}
	
	public static WebElement getaddNewPayeeDetailsAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='np_new_payee_details']"));
		return element;
	}
	
	public static WebElement getaddNewPayeeADDButtonAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='add_new_payee']"));
		return element;
	}
	
	public static WebElement getaddNewPayeeWelcomeMessageTextAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='alert_content']"));
		return element;
	}
	
	public static WebElement getFindSavedPayeeFromDropListAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='sp_payee']"));
		return element;
	}
}
