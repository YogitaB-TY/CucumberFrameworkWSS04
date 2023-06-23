package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {
	
	public CellPhonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Smartphone')]/../..//input")
	private WebElement smartPhoneAddToCart;
	
	public void clicksmartPhoneAddToCart() {
		smartPhoneAddToCart.click();
	}
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement shoppingCartLinkAfterAdding;
	
	public void clickonShoppingCartAfterAddtoCart() {
		shoppingCartLinkAfterAdding.click();
	}
	

}
