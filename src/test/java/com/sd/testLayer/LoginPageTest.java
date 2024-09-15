package com.sd.testLayer;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sd.pageLayer.LoginPage;
import com.sd.testBase.TestBase;
import com.sd.utilities.CommonComp;

public class LoginPageTest extends TestBase{
	
	@Test(priority = 1)
	public void verifyLoginPageWithValidCredentials() throws InterruptedException
	{
		String expected_result = "Products";
//		String expected_result = "https://www.saucedemo.com/inventory.html";
		LoginPage l = new LoginPage();
		l.enterUserName("standard_user");
		CommonComp c = new CommonComp();
		Thread.sleep(2000);
		l.enterPassword("secret_sauce");
		Thread.sleep(2000);
		l.ClickOnLoginBtn();
		Thread.sleep(2000);
		
		String actual_result = c.getTextMessageOnHomePage();
//		String actual_result = driver.getCurrentUrl();
		Assert.assertEquals(actual_result, expected_result);
		
	}
	
	@Test(priority = 2)
	public void verifyLoginPageWithInvalidCredentials()
	{
		String actual_result = "Epic sadface: Username and password do not match any user in this service";
		LoginPage l = new LoginPage();
		CommonComp c = new CommonComp();
		l.enterUserName("wrong_user");
		l.enterPassword("wrong_password");
		l.ClickOnLoginBtn();
		String expected_result = c.getErrorMessageOnInvalidCredentials();
		Assert.assertEquals(actual_result, expected_result);
	}
	
	@Test(priority = 3)
	public void verifyLoginPageWithEmptyFields() throws InterruptedException
	{
		String expected_result = "Epic sadface: Username is required";
		
		LoginPage l = new LoginPage();
		CommonComp c = new CommonComp();
		l.enterUserName("");
		Thread.sleep(2000);
		l.enterPassword("");
		Thread.sleep(2000);
		l.ClickOnLoginBtn();
		Thread.sleep(2000);
		String actual_result = c.getErrorMessage();
		Assert.assertEquals(actual_result, expected_result);	
	}

}
