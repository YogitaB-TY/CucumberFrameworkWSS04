	package com.cucumber.stepDefinitions;

import com.genericLibrary.Base;
import com.pomRepository.HomePage;
import com.pomRepository.RegisterPage;
import com.pomRepository.WelcomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	

	Base base;
	
	WelcomePage welcomePage;
	RegisterPage registerPage;
	HomePage homePage;

	public Register(Base base) {
		this.base=base;
	}
	
	@Given("Browser is open and {string} is navigated")
	public void browser_is_open_and_url_is_navigated(String URL) {
		System.out.println("Browser is open");
		
	}

	@And("user clicks on Register Link")
	public void user_clicks_on_register_link() {
		welcomePage=new WelcomePage(base.driver);
		welcomePage.clickRegister();
		/* base.driver.findElement(By.partialLinkText("Register")).click(); */
	}
	
	@When("user enters {string} {string} {string} {string} {string} {string}")
	public void user_enters(String Gender, String FirstName, String LastName, 
			String Email, String Password, String ConfirmPassword) throws InterruptedException {
	  Thread.sleep(2000);
	  
	  registerPage=new RegisterPage(base.driver);
	  if(Gender.equals("M")) {
		  registerPage.clickMaleRadioButton();
	  }else if(Gender.equals("F")) {
		  registerPage.clickFemaleRadioButton();
	  }
	  
	  registerPage.enterFirstName(FirstName);
	  registerPage.enterLastName(LastName);
	  registerPage.enterEmail(Email);
	  registerPage.enterPassword(Password);
	  registerPage.enterConfirmPassword(ConfirmPassword);
	  
		/*
		 * base.driver.findElement(By.xpath("//input[@value='"+Gender+"']")).click();
		 * base.driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		 * base.driver.findElement(By.id("LastName")).sendKeys(LastName);
		 * base.driver.findElement(By.id("Email")).sendKeys(Email);
		 * base.driver.findElement(By.id("Password")).sendKeys(Password);
		 * base.driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		 */
		 Thread.sleep(3000);
	}

	/*
	 * @When("user enters valid credentials") public void
	 * user_enters_valid_credentials() {
	 * driver.findElement(By.id("gender-female")).click();
	 * driver.findElement(By.id("FirstName")).sendKeys("Lorelai");
	 * driver.findElement(By.id("LastName")).sendKeys("Leigh");
	 * driver.findElement(By.id("Email")).sendKeys(
	 * "rorylorelaileighgilmore@gmail.com");
	 * driver.findElement(By.id("Password")).sendKeys("Password@123");
	 * driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@123"); }
	 */

	@When("clicks on Register button")
	public void clicks_on_register_button() {
		registerPage.clickRegisterButton();
		/* base.driver.findElement(By.id("register-button")).click(); */
	}

	@Then("user should be successfully registered")
	public void user_should_be_successfully_registered() {
		homePage=new HomePage(base.driver);
		if( homePage.getLoginName().isDisplayed()) {
			System.out.println("PASS: User is successfully registered");
		}else {
			System.out.println("FAIL: User is not registered");
		}
	   // driver.close();
	}

}
