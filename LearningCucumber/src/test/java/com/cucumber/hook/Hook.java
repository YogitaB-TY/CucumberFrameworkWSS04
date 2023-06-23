package com.cucumber.hook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.genericLibrary.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base{
	
	Base base;
	
	public Hook(Base base) {
		this.base=base;
	}
	
	@Before
	public void setUp() throws IOException {
		WebDriverManager.chromedriver().setup();
		base.driver=new ChromeDriver();
		base.driver.manage().window().maximize();
		base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		base.driver.get(base.propertyFileReader.readPropertyFile("url"));
	}
	
	@After
	public void tearDown() {
		base.driver.close();
	}

}
