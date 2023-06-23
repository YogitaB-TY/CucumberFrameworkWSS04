package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[4]/a")
	private WebElement firstProductInWishlist;

	public WebElement getFirstProductInWishlist() {
		return firstProductInWishlist;
	}

}
