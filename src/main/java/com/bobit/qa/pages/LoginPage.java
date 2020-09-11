package com.bobit.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bobit.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	

	//ilk olarak bu classla ilgili yani gidecegimiz web sayfasiyla ilgili "Page Factory" elementlerini olusturuyoruz.
	// bu ise "object repository" OR de deniyor 
	@FindBy(xpath ="//i[@class='fa fa-kiwi-bird']")
	WebElement beforestart;
	
	@FindBy(xpath ="//a[contains(text(),'Simple Login Demo')]")
	WebElement getstart;
	
	@FindBy(name="username")// username in locationindan elementin name attribute ine gore aliyoruz
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='btn btn-success w-100']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//div[@class='toast-message']" )
	WebElement getLoginMessage;
	
	// initializing the page object
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this );
	}
	
	public String login (String uname, String pword) {
		
		beforestart.click();
		getstart.click();
		username.sendKeys(uname);
		password.sendKeys(pword);
		loginBtn.click();
		return getLoginMessage.getText();
	}  

}
