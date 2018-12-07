package com.fdmgroup.bankpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferFundsPage {

	public static WebElement element;
	
	public static WebElement getTransferFundsAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='transfer_funds_tab']/a"));
		return element;
	}
	
	public static WebElement getFromAccount(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='tf_fromAccountId']"));
		return element;
	}
	
	public static WebElement getToAccount(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='tf_toAccountId']"));
		return element;
	}
	
	public static WebElement getAmountAccesst(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='tf_amount']"));
		return element;
	}
	
	public static WebElement getDescriptionAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='tf_description']"));
		return element;
	}
	
	public static WebElement getContinueAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='btn_submit']"));
		return element;
	}
	
	public static WebElement getSubmitAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//div[@id='transfer_funds_content']/form/div/div/div[2]/button"));
		return element;
	}
	
	public static WebElement getAccountSummaryAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='account_summary_tab']/a"));
		return element;
	}
	
	public static WebElement getConfirmMessageAfterSubmitAccess(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='transfer_funds_content']/div/div/div[1]"));
		return element;
	}
}
