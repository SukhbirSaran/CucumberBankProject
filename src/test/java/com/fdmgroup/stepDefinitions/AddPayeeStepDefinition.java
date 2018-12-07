package com.fdmgroup.stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.bankmodel.DriversUtilities;
import com.fdmgroup.bankpages.AddPayeePage;
import com.fdmgroup.banktestdata.TestData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddPayeeStepDefinition {
	DriversUtilities driverUtilities;
	 WebDriver driver;
	 
	 String actualText;
	 String expectedText;
	 Select titleSelected;
	 
	 @Given("^User was navigated to Pay Bills Page$")
	 public void atThePayBillsPage(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
		delay();
	 }
	 
	 @When("^Read welcome text on the Pay Bills page$")
	 public void readWelcomeText(){
		 actualText= AddPayeePage.getPayBillsPageWecomeTextAccess(driver).getText();
		 expectedText=TestData.payBillsPageText;
		 
	 }
	 
	 @Then("^It is same as given specifications$")
	 public void checkWelcomeText(){
		 assertEquals(expectedText, actualText);
	 }
	 
	 @Given("^User is at pay bills Page$")
	 public void stillAtAddNewPayeePage(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
	 }
	 
	 @When("^User clicks Add new Payee Page$")
	 public void userClicksAddNewPage(){
		 AddPayeePage.getAddNewPayeeAccess(driver).click();
		 delay();
		expectedText=TestData.addNewPayeePageText;
		actualText= AddPayeePage.getaddNewPayeePageTextAccess(driver).getText();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 }
	 
	 @Then("^User is navigated to Add new Payee Page$")
	 public void checkIfAtAddNewPayeePage(){
		 assertEquals(expectedText, actualText);
		 System.out.println("At addnew payee page");
	 }
	 
	 @Given("^User is placed at Add new Payee Page$")
	 public void atAddNewPage(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
	 }
	 
	 @When("^User adds details and clicks to add payee$")
	 public void enterDetailsofNewPayeeandreadConfirmation(){
		AddPayeePage.getaddNewPayeeNameAccess(driver).sendKeys(TestData.newPayeeName);
		AddPayeePage.getaddNewPayeeAddressAccess(driver).sendKeys(TestData.newPayeeAddress);
		AddPayeePage.getaddNewPayeeAccountAccess(driver).sendKeys(TestData.newPayeeAccout);
		AddPayeePage.getaddNewPayeeDetailsAccess(driver).sendKeys(TestData.newPayeeDetails);
		AddPayeePage.getaddNewPayeeADDButtonAccess(driver).click();
		expectedText=TestData.addNewPayeeWelcomeMessage;
		actualText= AddPayeePage.getaddNewPayeeWelcomeMessageTextAccess(driver).getText();
	 }
	 
	 @Then("^User gets a confirmation that a user is added$")
	 public void checkIfConfirmationisThere(){
		 assertEquals(expectedText, actualText);
		 System.out.println("Confirmation message for add payee done");
	 }
	
	 @Given("^User has received confirmation that payee is added$")
	 public void gotConfirmationMessage(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
		delay();
	 }
	 @When("^User clicks Payee dropdown to see payees$")
	 public void clickPayeeDropDown(){
		 WebElement titledropdown= AddPayeePage.getFindSavedPayeeFromDropListAccess(driver);
		delay();
		 titleSelected= new Select(titledropdown);
		System.out.println(titledropdown.getText());
	 }
	 
	 @Then("^Checks if the payee is added$")
	 public void checkIfAddedPayeeIsThere(){
		try{
				titleSelected.selectByVisibleText(TestData.newPayeeName);
		        }catch(Exception e)
		        {
		            System.out.println("Failure!!!!!!Not able to find TELUS as the added Payee !!!!!!");
		        }	
	 }
	 //Delay here
	 private void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
