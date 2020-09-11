package com.bobit.qa.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.bobit.qa.base.TestBase;




public class InputFormPage1 extends TestBase {
	
	
	@FindBy(xpath = "//i[@class='fa fa-horse']")
	WebElement beforestart;
	
	@FindBy(xpath ="//a[contains(text(),'Input Form with Validations')]")
	WebElement getstart;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstNameElement;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastNamElement;
	
	@FindBy(xpath ="//input[@placeholder='E-Mail Address']" )
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@placeholder='(845)555-1212']" )
	WebElement phonElement;
	
	@FindBy(xpath = "//input[@placeholder='Address']" )
	WebElement adresElement;
	
	@FindBy(xpath = "//input[@placeholder='city']" )
	WebElement cityElement;
	
	//@FindBy(xpath = "//select[@name='state']" )
	//Select stateElement;
	
	//Select stateElement = new Select(driver.findElement(By.xpath("//select[@name='state']")));
	
	@FindBy(xpath = "//input[@placeholder='Zip Code']")
	WebElement zipCodeElement;
	
	@FindBy(xpath = "//input[@placeholder='Website or domain name']")
	WebElement websiteElement;
	
	@FindBy (xpath = "//div[@class='card-body']//div[2]//label[1]//input[1]" )
	WebElement hasHostingRadioElement;
	
	@FindBy(xpath = "//textarea[@placeholder='Project Description']")
	WebElement descriptionElement;
	
	@FindBy(xpath = "//button[@class='btn btn-default w-100']")
	WebElement sendElement;
	
	@FindBy(xpath = "//div[@id='success_message']")
	WebElement getMessage;

	
	
	
	
	
	
	public InputFormPage1() throws IOException {
		super();
		PageFactory.initElements(driver, this );}
		
	
	
	public String submitNewForm(String ftName, String ltName,  String email, String phone, String adres, String city, String zipcode, String website, String description){
		
		beforestart.click();
		getstart.click();
		
		firstNameElement.clear();
		firstNameElement.sendKeys(ftName);
		
		lastNamElement.clear();
		lastNamElement.sendKeys(ltName);
		
		emailElement.clear();
		emailElement.sendKeys(email);
		
		phonElement.clear();
		phonElement.sendKeys(phone);
		
		adresElement.clear();
		adresElement.sendKeys(adres);
		
		cityElement.clear();
		cityElement.sendKeys(city);
		
		Select stateElement = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		stateElement.selectByVisibleText("Florida");;
		
		zipCodeElement.clear();
		zipCodeElement.sendKeys(zipcode);
		
		websiteElement.clear();
		websiteElement.sendKeys(website);
		
		hasHostingRadioElement.click();
		
		descriptionElement.clear();
		descriptionElement.sendKeys(description);
		
		sendElement.click();
		
		return getMessage.getText();
		
		
	}
	
	
	
	

}
