package com.bobit.qa.pages;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.bobit.qa.base.TestBase;


public class FormPage extends TestBase {
	
	@FindBy(xpath ="//i[@class='fa fa-kiwi-bird']")
	WebElement beforestart;
	
	@FindBy(xpath ="//a[contains(text(),'Simple Form Demo')]")
	WebElement getstart;
	
	@FindBy(id = "user-message")
	WebElement puttext;
	
	@FindBy(xpath = "//button[contains(text(),'Show Message')]")
	WebElement showmessage;
	
	@FindBy(id = "display")
	WebElement getmessage;
	
	@FindBy(id = "sum1" )
	WebElement sum1;
	
	@FindBy(id = "sum2" )
	WebElement sum2;
	
	@FindBy(xpath = "//button[contains(text(),'Get Total')]")
	WebElement gettotal;
	
	@FindBy(id = "displayvalue")
	WebElement gettotalmessage;
	

	
	
	public FormPage() throws IOException {
		super();
		PageFactory.initElements(driver, this );
		
		
	}
	
	
			
	public String getMessage (String msg) {
		
		beforestart.click();
		getstart.click();
		puttext.sendKeys(msg);
		showmessage.click();
		return getmessage.getText();
	} 
	
	public String getTotal(String numb1, String numb2) {
		
		beforestart.click();
		getstart.click();
		
		sum1.sendKeys(numb1);
		sum2.sendKeys(numb2);
		gettotal.click();
		return gettotalmessage.getText();
	}
	
	
	
	
	
	
	

}
