package com.bobit.qa.testcases;

import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bobit.qa.base.TestBase;


import com.bobit.qa.pages.InputFormPage1;
import com.bobit.qa.util.TestUtil;






public class InputFormPageTest1 extends TestBase {
	
	
	TestUtil testUtil; 
	InputFormPage1 inputFormPage1;
	String sheetName = "inputs";//dynamic
	
	
	
	
	
	public InputFormPageTest1() throws IOException {
		super();
		PageFactory.initElements(driver, this );
		
	}
	
	
	
	
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		
		initialization();
		inputFormPage1 = new InputFormPage1();
		testUtil = new TestUtil();
				
	}
			
	
	@DataProvider
	public Object[][] getCRMTestData() throws InvalidFormatException{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=4, dataProvider="getCRMTestData")
	public void validateCreateNewContact(String ftName,String ltName,String email,String phone,String adres,String city,String zipcode,String website,String description){
		
		String gotMessageString = inputFormPage1.submitNewForm(ftName, ltName, email, phone, adres, city, zipcode, website, description);
		Assert.assertEquals(gotMessageString, "Success Thanks for contacting us, we will get back to you shortly.");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	

}
