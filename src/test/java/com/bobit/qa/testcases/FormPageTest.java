package com.bobit.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bobit.qa.base.TestBase;

import com.bobit.qa.pages.FormPage;


public class FormPageTest extends TestBase{
	
	FormPage formPage;

	public FormPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		formPage = new FormPage();
		
	}
	
	@Test
	public void validateFormMessage() {
		Assert.assertEquals(formPage.getMessage("Hello Fellas"), "Hello Fellas");
		
	}
	
	@Test
	public void validateGetTotal() {
		String aString="5";
		String bString="15";
		int a=Integer.parseInt(aString);
		int b=Integer.parseInt(bString);
		int total = a+b;
		String totalString=String.valueOf(total); 
		String actualString= formPage.getTotal(aString, bString);
		Assert.assertEquals(actualString, totalString);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	
	

}
