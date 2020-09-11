package com.bobit.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bobit.qa.base.TestBase;

public class RadioButtonPage extends TestBase {
	
	
	@FindBy(xpath ="//i[@class='fa fa-kiwi-bird']")
	WebElement beforestart;
	
	@FindBy(xpath ="//a[contains(text(),'Radio Buttons Demo')]")
	WebElement getstart;
	
	@FindBy(xpath = "//body/div/div/div/div/div/div/div/div/label[contains(text(),'Female')]/input[1]")
	WebElement radioButtonElement;
	
	@FindBy(xpath = "//button[@id='buttoncheck']")
	WebElement submit;
	
	@FindBy(xpath = "//p[@class='radiobutton']")
	WebElement getMessageRadioElement;
	
	
	@FindBy(xpath = "//html//body//div//div//div//div//div//div//div//div//div//label[contains(text(),'Female')]//input")
	WebElement secondRadioButtonElement;
	
	@FindBy(xpath = "//label[contains(text(),'5 to 15')]")
	WebElement secondRadioButtonGroupElement;
	
	@FindBy(xpath = "//button[contains(text(),'Get values')]")
	WebElement submitSecondElement;
	
	@FindBy(xpath = "//p[@class='groupradiobutton']")
	WebElement getMessageSecondElement;
	
	//Sex : Female
	//Age group: 5 - 15
	
	

	public RadioButtonPage() throws IOException {
		super();
		PageFactory.initElements(driver, this );
	}
	
	public String isRadioButtonWorked () {
		
		beforestart.click();
		getstart.click();
		radioButtonElement.click();
		submit.click();
		
		
		return getMessageRadioElement.getText();
	} 
	
	public String isSecondRadioButtonWorked () {
		
		beforestart.click();
		getstart.click();
		secondRadioButtonElement.click();
		secondRadioButtonGroupElement.click();
		submitSecondElement.click();
		
		
		
		return getMessageSecondElement.getText();
	} 

}
