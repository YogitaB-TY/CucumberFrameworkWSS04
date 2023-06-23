package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	public void clickLoginButton(){
		loginButton.click();
	}
	
}
