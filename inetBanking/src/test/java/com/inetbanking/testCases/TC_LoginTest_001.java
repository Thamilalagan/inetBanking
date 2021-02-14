package com.inetbanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
		
		logger.info("URL is opened...");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is entered...");
		lp.setPassword(password);
		logger.info("Password is entered...");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager Home Page")) {
			AssertJUnit.assertTrue(true);
			logger.info("Login test passed ...");
			
		}
		else {
			
			captureScreen(driver, "loginTest");
			AssertJUnit.assertTrue(false);
			logger.info("Login test failed ...");
		}
		
		
	}	

}
