package com.cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.genericLibrary.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartPhoneCart {

	Base base;
	
    public SmartPhoneCart(Base base) {
	this.base=base;
	}
	
	@Given("Browser is open and {string} is entered")
	public void browser_is_open_and_is_entered(String URL) {
		
		System.out.println("Browser is open");
		 
	}

	@And("user logs in using {string} and {string}")
	public void user_logs_in_using_and(String UserName, String Password) throws InterruptedException {
		Thread.sleep(2000);
		base.driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(2000);
		base.driver.findElement(By.id("Email")).sendKeys(UserName);
		base.driver.findElement(By.id("Password")).sendKeys(Password);
		Thread.sleep(2000);
		base.driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@When("user navigates to cell phones page")
	public void user_navigates_to_cell_phones_page() throws InterruptedException {
	  Actions act=new Actions(base.driver);
	  act.moveToElement(base.driver.findElement(By.partialLinkText("ELECTRONICS"))).build().perform();
	  Thread.sleep(2000);
	  act.moveToElement(base.driver.findElement(By.xpath("//a[contains(text(),'Cell phones')]"))).click().build().perform();
	  Thread.sleep(2000);
	}

	@And("clicks on add to cart of SmartPhone product")
	public void clicks_on_add_to_cart_of_smart_phone_product() throws InterruptedException {
	   base.driver.findElement(By.xpath("//a[contains(text(),'Smartphone')]/../..//input")).click();
	   Thread.sleep(2000);
	}

	@Then("product should be added to cart")
	public void product_should_be_added_to_cart() throws InterruptedException {
	   base.driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]")).click();
	   Thread.sleep(2000);
	  if( base.driver.findElement(By.xpath("(//a[contains(text(),'Smartphone')])[2]")).isDisplayed()) {
		  System.out.println("Product is added to cart");
	  }
	}

}
