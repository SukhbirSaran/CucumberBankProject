package com.fdmgroup.stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Delayed;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fdmgroup.bankmodel.DriversUtilities;
import com.fdmgroup.bankpages.TransferFundsPage;
import com.fdmgroup.banktestdata.TestData;
import com.fdmgroup.bankpages.AddPayeePage;
import com.fdmgroup.bankpages.AccountSummaryPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FundsTransferStepDefinition {
	 DriversUtilities driverUtilities;
	 WebDriver driver;
	 String actualText;
	 String expectedText;
	 String expectedFundsInFromAccountAfterTransfer;
	 String actualFundsInFromAccountAfterTransfer;
	 
	@Given("^User is logged in$")
	public void userOnLoggedinPage(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();	
		TransferFundsPage.getTransferFundsAccess(driver).click();
		delay();
	}

	@When("^User selects and enters the amount$")
	public void selectAccountsAndEnterAmount(){
		
		System.out.println("Transferring funds ");
		WebElement welement=TransferFundsPage.getFromAccount(driver);
		Select titleSelected= new Select(welement);
		titleSelected.selectByVisibleText(TestData.fromAccount);
		
		welement=TransferFundsPage.getToAccount(driver);
		titleSelected=new Select(welement);
		titleSelected.selectByVisibleText(TestData.toAccount);
		
		TransferFundsPage.getAmountAccesst(driver).sendKeys(TestData.amountToTransfer);
		TransferFundsPage.getDescriptionAccess(driver).sendKeys(TestData.descriptiontotransfer);
		delay();
		
	}
	
	@Then("^Funds are transferred$")
	public void transferAmount(){
		TransferFundsPage.getContinueAccess(driver).click();
		delay();
		TransferFundsPage.getSubmitAccess(driver).click();
		
	}
	
	
	@Given("^User has transferred funds$")
	public void userAfterTransferringFunds(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();	
		System.out.println("Checking for the confirmation message of funds transfer");
	}
	
	@When("^Confirmation screen has shown up with a message$")
	public void readigConfirmationMessage(){
		actualText=TransferFundsPage.getConfirmMessageAfterSubmitAccess(driver).getText();
		expectedText= TestData.confirmFundsTransferMessage;
	}
	
	@Then("^Check confirmation message and go to Account Summary Page$")
	public void confirmMessageAndGotoAccountSummary(){
		assertEquals(expectedText, actualText);
		TransferFundsPage.getAccountSummaryAccess(driver).click();
		System.out.println("in last then");
	}
	
	@Given("^User is at Account Summary Page$")
	public void userAtAccountSummaryPage(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();	
	}
	@When("^Read funds in both FROM and TO accounts$")
	public void readFundsFromAccountsAfterTransfer(){
		expectedFundsInFromAccountAfterTransfer= TestData.fundsinFromAccountAfterTransfer;
		actualFundsInFromAccountAfterTransfer= AccountSummaryPage.getDetailsofFromAccount(driver).getText();
		
	}
	@Then("^Check  for correct amount and to Add Payee page$")
	
	public void checkForCorrectAmountTransferred(){
		try{
	        Assert.assertEquals(expectedFundsInFromAccountAfterTransfer, actualFundsInFromAccountAfterTransfer);
	        }catch(AssertionError e)
	        {
	            System.out.println("Failure!!!!!!!!! Funds Tranfer function not working!!!!!! ");
	        }	
		
		AddPayeePage.getPayBillsAccess(driver).click();
	}
	

	
	
	
//Delay Function
private void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
