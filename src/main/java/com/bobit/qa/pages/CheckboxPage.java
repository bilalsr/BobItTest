package com.bobit.qa.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bobit.qa.base.TestBase;

public class CheckboxPage extends TestBase{
	
	@FindBy(xpath ="//i[@class='fa fa-kiwi-bird']")
	@CacheLookup // ==================================================================good for performance
	WebElement beforestart;
	
	@FindBy(xpath ="//a[contains(text(),'Check Box Demo')]")
	WebElement getstart;
	
	@FindBy(xpath = "//input[@id='isAgeSelected']")
	WebElement singlecheckboxtik;
	
	@FindBy(xpath = "//div[@id='txtAge']")
	WebElement checkboxmesage;
	
	
	@FindBy (id = "check1")
	WebElement checkButton;

	
	
	
	public CheckboxPage() throws IOException {
		super();
		PageFactory.initElements(driver, this );
		
	}
	
	public String isCheckboxSelected () {
		
		beforestart.click();
		getstart.click();
		singlecheckboxtik.click();
		return checkboxmesage.getText();
	} 
	
	public String isMultipleCheckboxSelected() {
		
		//driver.findElement(By.XPath("//input[@name='submit']")).getAttribute("value");
		beforestart.click();
		getstart.click();
		checkButton.click();
		return checkButton.getAttribute("value");
		
		
	}
	
	

}
