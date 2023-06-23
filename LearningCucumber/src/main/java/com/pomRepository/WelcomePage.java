package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	public void clickRegister() {
		registerLink.click();
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	public void clickLogin() {
		loginLink.click();
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	public void clickShoppingCart() {
		shoppingCartLink.click();
	}
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;
	
	public void clickWishlist() {
		wishlistLink.click();
	}
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksHeaderLink;
	
	public void clickBooksHeaderLink() {
		booksHeaderLink.click();
	}
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement electronicsHeaderLink;
	
	public void clickElectronicsHeaderLink() {
		electronicsHeaderLink.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Cell phones')]")
	private WebElement cellPhoneHeaderLink;
	
	public void clickCellPhoneHeader() {
		cellPhoneHeaderLink.click();
	}

	public WebElement getElectronicsHeaderLink() {
		return electronicsHeaderLink;
	}

	public WebElement getCellPhoneHeaderLink() {
		return cellPhoneHeaderLink;
	}

}
