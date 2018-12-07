package com.fdmgroup.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.bankmodel.DriversUtilities;
import com.fdmgroup.banktestdata.TestData;
import com.fdmgroup.bankpages.SignUpPage;
import com.fdmgroup.bankpages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionFile {
	 DriversUtilities driverUtilities;
	 WebDriver driver;
	 String actualText;
	 String actualText1;
	 String actualText2;
	 String expectedText= TestData.OnlineBankingText;
	 String expectedText1=TestData.CheckingAccountActivityText;
	 String expectedText2=TestData.TransferFundsText;
	 
	 
	 
	 
	 /*@Given("^Open the browser, launch the application and check basic links and text on home page$")
	 
	 public void openBrowserLaunchApplicationAndCheckBasicLinks(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
		
		driver.get(TestData.homePage);
		delay();
		
		System.out.println("Checking text data inside OnlineBanking title");
		String expectedText= TestData.OnlineBankingText;
		String actualText = HomePage.getOnlineBankingTextElement(driver).getText();
		assertEquals(expectedText,actualText);
		delay();
		
		
		
		System.out.println("Check text under Checking account activity");
		expectedText=TestData.CheckingAccountActivityText;
		actualText=HomePage.getCheckingAccountActivityElement(driver).getText();
		assertEquals(expectedText, actualText);
		
		
		System.out.println("Checking text under TransferFundsText");
		expectedText= TestData.TransferFundsText;
		actualText= HomePage.getTransferFundsElement(driver).getText();
		assertEquals(expectedText, actualText);
		
		
		HomePage.getMoreServicesLink(driver).click();
		delay();
		driver.navigate().back();
		delay();
		HomePage.getOnlineBankingLink(driver).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		delay();
		driver.navigate().back();
		HomePage.getFeedBackLink(driver).click();
		delay();		
	 }

	@When("^Enter the username and password$")
	public void enterUserdetailsForLogin(){
		
		HomePage.getSignupLink(driver).click();
		delay();
		SignUpPage.getUserNameField(driver).sendKeys(TestData.userName);
		
		SignUpPage.getPasswordField(driver).sendKeys(TestData.password);
		delay();
	}
	 
	 
	 @Then("^User can login$")
	 public void doLogin(){
		 SignUpPage.getSignInLink(driver).click();
	 }
	 */
	 
	 @Given("^Open the browser, launch the application$")
	  public void openHomePage(){
		 driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
			
		driver.get(TestData.homePage);
		delay();
	 }
	 
	 @When("^Read text under various headings$")
	 public void readTextUnderVariousHeadings(){
		actualText = HomePage.getOnlineBankingTextElement(driver).getText();
		actualText1=HomePage.getCheckingAccountActivityElement(driver).getText();
		actualText2= HomePage.getTransferFundsElement(driver).getText();
	 }
	 
	 @Then("^It is same as specifications$")
	 public void testTheReadTextUnderVariousHeadings(){
		 delay();
		System.out.println("Checking text data inside OnlineBanking title");
		assertEquals(expectedText,actualText);
		
		System.out.println("Check text under Checking account activity");
		assertEquals(expectedText1, actualText1);
		
		System.out.println("Checking text under TransferFundsText");
		assertEquals(expectedText2, actualText2);
		System.out.println("At the end of firstFunction");
	 }
	 
	 @Given("^Application launched, text correct under headings$")
	  public void openHomePage2(){
		driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
			
		driver.get(TestData.homePage);
		delay();
	 }
	 
	 
	 @When("^I open links on home page$")
	 public void openLinksOnHomePage(){
		HomePage.getMoreServicesLink(driver).click();
		delay();
		driver.navigate().back();
		delay();
		HomePage.getOnlineBankingLink(driver).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		delay();
		driver.navigate().back();
		HomePage.getFeedBackLink(driver).click();
		delay();	
	 }
	 @Then("^Links work, user moves to login page$")
	 public void openSignInLink(){
		HomePage.getSignupLink(driver).click();
		delay();
	 }
	 
	 @Given("^User is on the login page$")
	  public void openHomePage3(){
		 driverUtilities=DriversUtilities.getInstance();
		driver=driverUtilities.getDriver();
			
		//driver.get(TestData.homePage);
		//delay();
	 }
	 
	 
	 @When("^User enters username and password$")
	 public void enterUserDetails(){
		SignUpPage.getUserNameField(driver).sendKeys(TestData.userName);
		SignUpPage.getPasswordField(driver).sendKeys(TestData.password);
		delay();
	 }
	 
	 @Then("^User can login into account$")
	 public void doLogin(){
		 SignUpPage.getSignInLink(driver).click();
	 }
	 // Delay function
	 private void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
