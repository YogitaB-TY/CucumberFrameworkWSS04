package com.cucumber.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.genericLibrary.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Books {
	
	Base base;
	
	public Books(Base base) {
		this.base=base;
	}
	
	@Given("Browser is open to Welcome Page")
	public void browser_is_open_to_welcome_page() {
		System.out.println("Welcome Page is displayed");
	}

	@When("user logs in using valid credentials")
	public void user_logs_in_using_valid_credentials(DataTable dataTable) throws InterruptedException {
		Thread.sleep(2000);
       
	   base.driver.findElement(By.partialLinkText("Log")).click();
	   List<List<String>> data = dataTable.asLists();
	   base.driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));
	   base.driver.findElement(By.id("Password")).sendKeys(data.get(0).get(1));
	   Thread.sleep(2000);
	   base.driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("Home Page should be displayed")
	public void home_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
	    Assert.assertTrue(base.driver.findElement(By.partialLinkText("Log out")).isDisplayed());
	}

	@And("User Should navigate to Books page")
	public void user_should_navigate_to_books_page() throws InterruptedException {
		Thread.sleep(2000);
	   base.driver.findElement(By.partialLinkText("BOOKS")).click();
	}

	@When("user chooses Name A-Z in drop down")
	public void user_chooses_name_a_z_in_drop_down() throws InterruptedException {
		Thread.sleep(2000);
	   Select select=new Select(base.driver.findElement(By.id("products-orderby")));
	   select.selectByVisibleText("Name: A to Z");
	   Thread.sleep(2000);
	}

	@Then("The products should be dislpayed in A to Z order")
	public void the_products_should_be_dislpayed_in_a_to_z_order() {
	   Reporter.log("Page is displayed in alphabetical order");
	  
	}

	@When("user clicks on add to cart button for Computing and network book")
	public void user_clicks_on_add_to_cart_button_for_computing_and_network_book() throws InterruptedException {
		Thread.sleep(2000);
	  base.driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input")).click();
	}

	@Then("Book should be added to cart")
	public void book_should_be_added_to_cart() throws InterruptedException {
		Thread.sleep(2000);
	   base.driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
	   Thread.sleep(2000);
	  WebElement product = base.driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[3]/a[@class='product-name']"));
	   Assert.assertEquals(product.getText(), "Computing and Internet");
	   
	}

	@When("user clicks on Health book")
	public void user_clicks_on_health_book() throws InterruptedException {
		Thread.sleep(2000);
	    base.driver.findElement(By.xpath("//a[text()='Health Book']")).click();
	}

	@And("clicks on add to wishlist button")
	public void clicks_on_add_to_wishlist_button() throws InterruptedException {
		Thread.sleep(2000);
	  base.driver.findElement(By.id("add-to-wishlist-button-22")).click();
	 
	}

	@Then("product should be added to wishlist")
	public void product_should_be_added_to_wishlist() throws InterruptedException {
		Thread.sleep(2000);
	   base.driver.findElement(By.xpath("//a[text()='wishlist']")).click();
	   Thread.sleep(2000);
	   WebElement product=base.driver.findElement(By.xpath("//table[@class='cart']/tbody/tr[1]/td[4]/a"));
	   Assert.assertEquals(product.getText(), "Health Book");
	   
	   
	}

}
