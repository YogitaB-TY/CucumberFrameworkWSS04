package com.genericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
	
	
	public void clickAction(WebElement element) {
		element.click();
	}
	
	public void enterValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public void selectUsingVisibletText(WebElement dropDown, String visibleText) {
		Select select=new Select(dropDown);
		select.selectByVisibleText(visibleText);
	}
	
	public void selectUsingIndex(WebElement dropDown, int index) {
		Select select=new Select(dropDown);
		select.selectByIndex(index);
	}
	
	public void selectUsingValue(WebElement dropDown, String value) {
		Select select=new Select(dropDown);
		select.selectByValue(value);
	}
	
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	public void mouseHoverClick(WebDriver driver, WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public String screenShot(WebDriver driver) {
		String imgPath="./Screenshots/Screenshot.png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(imgPath);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imgPath;
	}

}
