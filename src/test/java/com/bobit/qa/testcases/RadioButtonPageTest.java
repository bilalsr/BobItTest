package com.bobit.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bobit.qa.base.TestBase;

import com.bobit.qa.pages.RadioButtonPage;

public class RadioButtonPageTest extends TestBase {
	
	RadioButtonPage radioButtonPage;

	public RadioButtonPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		radioButtonPage = new RadioButtonPage();
	}
	
	@Test(priority = 1) 
	  public void validateRadioButtonFirst() {
		
		String gotMessageString= radioButtonPage.isRadioButtonWorked();
		Assert.assertEquals(gotMessageString, "Radio button 'Female' is checked");
		
		
	}
	
	
	
	@Test(priority = 2)
	public void validateSecondRadioButton () {
		
		String gotMessageSecondString= radioButtonPage.isSecondRadioButtonWorked();
		Assert.assertEquals(gotMessageSecondString, "Sex : Female\nAge group: 5 - 15");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
