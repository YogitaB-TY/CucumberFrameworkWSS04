package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[3]/a[@class='product-name']")
	private WebElement firstProductInCart;

	public WebElement getFirstProductInCart() {
		return firstProductInCart;
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Smartphone')])[2]")
	private WebElement smartPhoneCart;

	public WebElement getSmartPhoneCart() {
		return smartPhoneCart;
	}

}
