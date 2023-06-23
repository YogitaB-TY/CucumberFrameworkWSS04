package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {
	
	public BooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;
	
	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}
	
	public void sortByDropDownSelectByVisibleText(String visibleText) {
		Select select=new Select(sortByDropDown);
		select.selectByVisibleText(visibleText);
	}

	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input")
	private WebElement computingAndInternetAddToCartButton;
	
	public void clickComputingAndInternetBook() {
		computingAndInternetAddToCartButton.click();
	}
	
	@FindBy(xpath = "//a[text()='shopping cart']")
	private WebElement shoppingCartLinkAfterAdding;
	
	public void clickonShoppingCartAfterAddtoCart() {
		shoppingCartLinkAfterAdding.click();
	}
	
	@FindBy(xpath = "//a[text()='Health Book']")
	private WebElement healthBook;
	
	public void clickHealthBook() {
		healthBook.click();
	}
	

}
