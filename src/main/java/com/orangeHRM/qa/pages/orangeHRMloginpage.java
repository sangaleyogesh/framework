package com.orangeHRM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.orangeHRMbase;

public class orangeHRMloginpage extends orangeHRMbase{

	
	
	@FindBy(xpath="//input[@name=\"username\"]")WebElement username;
	
	@FindBy(xpath="//input[@type=\"password\"]")WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement loginbutton;
	
	@FindBy(xpath="//p[contains(text(),'Paul Collings')]") WebElement user;
	
	
	public orangeHRMloginpage () throws IOException  {
		
		PageFactory.initElements(driver, this);
		
	}
	public boolean logindata(String userid,String pass) throws InterruptedException {
		
		username.sendKeys(userid);
		Thread.sleep(3000);
		
		password.sendKeys(pass);
		
		Thread.sleep(3000);

		loginbutton.click();
		
		Thread.sleep(3000);

		return user.isDisplayed();
	}
	public String validatepagetitle(String un, String pwd) throws InterruptedException {
		
		username.sendKeys(un);
		Thread.sleep(3000);
		
		password.sendKeys(pwd);
		Thread.sleep(3000);
		
		loginbutton.click();
		
		return driver.getTitle();
		
	}
	
}
