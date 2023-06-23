package com.cucumber.stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericLibrary.Base;
import com.pomRepository.HomePage;
import com.pomRepository.LoginPage;
import com.pomRepository.WelcomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	Base base;
	WelcomePage welcomePage;
    LoginPage loginPage;
	HomePage homePage;
	
	public Login(Base base) {
		this.base=base;
	}

	@Given("I will launch browser and Enter the url")
	public void i_will_launch_browser_and_enter_the_url() {
		System.out.println("Browser is launched");
	}

	@And("I will click on Login in")
	public void i_will_click_on_login_in() {
		welcomePage=new WelcomePage(base.driver);
		welcomePage.clickLogin();
	}

	@When("enter email and password")
	public void enter_email_and_password(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		loginPage=new LoginPage(base.driver);
		loginPage.enterEmail(data.get(0).get(0));
		loginPage.enterPassword(data.get(0).get(1));
		/*
		 * base.driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
		 * base.driver.findElement(By.id("Password")).sendKeys(data.get(0).get(1));
		 */
	}


	/*
	 * @When("enter email and password") public void enter_email_and_password() {
	 * driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
	 * driver.findElement(By.id("Password")).sendKeys("Password@123"); }
	 */

	@When("click on sign in")
	public void click_on_sign_in() {
		loginPage.clickLoginButton();
		/* base.driver.findElement(By.xpath("//input[@value='Log in']")).click(); */
	}

	@Then("User name should be displayed or not")
	public void user_name_should_be_displayed_or_not() {
		homePage=new HomePage(base.driver);
		if(homePage.getLoginName().getText().equals("yogbelavanaki@gmail.com")) {
			System.out.println("PASSED: User is successfully logged in"); 
		}else {
			System.out.println("FAILED: User is not logged in"); 
		} 
		base.utilityMethods.mouseHover(base.driver,welcomePage.getElectronicsHeaderLink());
		
	}

}
