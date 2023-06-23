package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthBookPage {
	
	public HealthBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-wishlist-button-22")
	private WebElement addToWishlistButton;

	public void clickAddToWishlist() {
		addToWishlistButton.click();
	}
	
	@FindBy(xpath = "//a[text()='wishlist']")
	private WebElement wishlistLinkAfterAdding;
	
	public void clickonShoppingCartAfterAddtoCart() {
		wishlistLinkAfterAdding.click();
	}
}
