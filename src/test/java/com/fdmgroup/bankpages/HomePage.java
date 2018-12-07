package com.fdmgroup.bankpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element;
	
	public static WebElement getSignupLink(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='signin_button']"));
		return element;
	}
	
	public static WebElement getHomeLink(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='homeMenu']/div/strong"));
		return element;
	}
	
	public static WebElement getOnlineBankingLink(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='onlineBankingMenu']/div/strong"));
		return element;
	}
	
	public static WebElement getFeedBackLink(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='feedback']/div/strong"));
		return element;
	}
	
	public static WebElement getOnlineBankingTextElement(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='online_banking_features']/div[1]/p"));
		return element;
	}
	
	public static WebElement getMoreServicesLink(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='online-banking']"));
		return element;
	}
	
	public static WebElement getCheckingAccountActivityElement(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='online_banking_features']/div[2]/div/p"));
		return element;
	}
	
	public static WebElement getTransferFundsElement(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='online_banking_features']/div[4]/div/p"));
		return element;
	}
}
