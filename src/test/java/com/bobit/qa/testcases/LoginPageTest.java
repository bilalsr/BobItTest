package com.bobit.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bobit.qa.base.TestBase;
import com.bobit.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	public LoginPageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void validatelogin() {
		
		String gotMessage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(gotMessage, "You have been login");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
