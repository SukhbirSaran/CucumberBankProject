package com.fdmgroup.bankmodel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversUtilities {
	
	private static DriversUtilities driverUtilities;
	private WebDriver driver;
	
	
	private DriversUtilities(){
		super();
	}
	public static DriversUtilities getInstance(){
		
		if(driverUtilities==null){
			driverUtilities=new DriversUtilities();
		}
		return driverUtilities;
	}
	
	public WebDriver getDriver(){
		if(driver==null){
			createDriver();
		}
		return driver;
	}
	private void createDriver() {
		
		String driverName=getDriverName();
		switch(driverName){
		case "Google Chrome":
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			this.driver=new ChromeDriver();
			break;
		case "FireFox":
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			this.driver=new FirefoxDriver();
			break;
		default:
			System.out.println("Not an appropriate browser !!");
			break;
		}
	}
	private String getDriverName() {
		String driverName="";
		
		Properties config=new Properties();
		
		try {
			config.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		for (String key: config.stringPropertyNames()) {
			if(key.equals("browser")){
				driverName=config.getProperty(key);
				
			}
		}
		
		return driverName;
	}
}
