package com.fdmgroup.bankpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	private static WebElement element;
	
	public static WebElement getUserNameField(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='user_login']"));
		return element;
	}
	
	public static WebElement getPasswordField(WebDriver driver){
		element= driver.findElement(By.xpath("//*[@id='user_password']"));
		return element;
	}
	
	public static WebElement getSignInLink(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@id='login_form']/div[2]/input"));
		return element;
	}
}
