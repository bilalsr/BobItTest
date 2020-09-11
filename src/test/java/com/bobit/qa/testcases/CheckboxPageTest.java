package com.bobit.qa.testcases;



import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger; 

import org.jsoup.Connection.Base;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bobit.qa.base.TestBase;
import com.bobit.qa.pages.CheckboxPage;



public class CheckboxPageTest extends TestBase {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());

	CheckboxPage checkboxPage;
	
	public CheckboxPageTest()throws IOException {
		super();
		
	} 
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		checkboxPage = new CheckboxPage();
		log.info("Driver is initalizaed");
		
	}
		
	
	  @Test(priority = 1) 
	  public void validateCheckbox() {
	  
	  String gotMessage = checkboxPage.isCheckboxSelected();
	  Assert.assertEquals(gotMessage, "Success - Check box is checked");
	  log.info("hello");
	  log.info("hi");
	  log.warn(" cok onemli");
	  log.info("checkbox validated");
	  
	  }
	 
	  @Test(priority = 2)
	  public void validateMultiCheckBox() {
		  
		 Assert.assertEquals(checkboxPage.isMultipleCheckboxSelected(), "Uncheck All");
		  
		  
	  }
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

	
	
	
}
