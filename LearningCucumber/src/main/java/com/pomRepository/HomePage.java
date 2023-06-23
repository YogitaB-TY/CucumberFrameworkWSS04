package com.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@class='account'])[1]" )
	private WebElement loginName;

	public WebElement getLoginName() {
		return loginName;
	}

	public void setLoginName(WebElement loginName) {
		this.loginName = loginName;
	}
	
   
}
