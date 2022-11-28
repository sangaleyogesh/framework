package com.orangeHRM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.qa.base.orangeHRMbase;

public class orangeHRMhomepage extends orangeHRMbase   {

	
	@FindBy(xpath="//a[contains(text(),'Reports')]") WebElement report;

	@FindBy(xpath="//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]")
	
	WebElement reportname;

	@FindBy(xpath="//button[@type=\"submit\"]")WebElement search;
	
	public orangeHRMhomepage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String homepagevalidate(String Name) throws InterruptedException {
		
		
		report.click();
		Thread.sleep(3000);
		
		reportname.sendKeys(Name);
		Thread.sleep(3000);
		
		search.click();
		
		return reportname.getText();
		}

	
	
}
