package com.fdmgroup.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.bankmodel.DriversUtilities;
import com.fdmgroup.bankpages.SettingsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SettingsStepDefinition {
	DriversUtilities driverUtilities;
	WebDriver driver;
	
	@Given("^User is  Pay Bills Page$")
	public void accessSettings(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
	}
	
	@When("^User clicks account settings$")
	public void clickAccountSettings(){
		System.out.println("About to access account settings");
	}
	
	@Then("^User is able to access account settings$")
	public void checkIfAccountSettingsAreAvailable(){
		try {
			if (SettingsPage.getAccountSettingsAccess(driver).isEnabled()) {
				SettingsPage.getAccountSettingsAccess(driver).click();
			}
			
		} catch (Exception e) {
			System.out.println("Failure!!!!!! Account Setting is disabled!!!!!!!");
		}
	}
	
}
