package com.sd.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sd.pageLayer.AddToCartPage;
import com.sd.pageLayer.LoginPage;
import com.sd.pageLayer.ProductPage;
import com.sd.testBase.TestBase;
import com.sd.utilities.CommonComp;

public class VerifyProductPage extends TestBase{
	
	@Test(priority = 1)
	public void verifyProductPage() throws InterruptedException
	{
		String expected_result = "Sauce Labs Backpack";
	    
		LoginPage l = new LoginPage();
		CommonComp c = new CommonComp();
		l.enterUserName("standard_user");
		Thread.sleep(2000);
		l.enterPassword("secret_sauce");
		Thread.sleep(2000);
		l.ClickOnLoginBtn();
		String actual_result = c.verifyProduct1();
		Assert.assertEquals(expected_result, actual_result);			
	}
	
	@Test(priority = 2)
	public void verifyProduct2()
	{
		String expected_result = "Sauce Labs Bike Light";
//		ProductPage p = new ProductPage();
		LoginPage l = new LoginPage();
		CommonComp c = new CommonComp();
		l.enterUserName("standard_user");
		l.enterPassword("secret_sauce");
		l.ClickOnLoginBtn();
		String actual_result = c.verifyProduct2();
		Assert.assertEquals(expected_result, actual_result);
	}
	
	@Test(priority = 3)
	public void verifyProcutDetails() throws InterruptedException
	{
		String expected_result = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		LoginPage l = new LoginPage();
		ProductPage p = new ProductPage();
		CommonComp c = new CommonComp();
        l.enterUserName("standard_user");
        l.enterPassword("secret_sauce");
        l.ClickOnLoginBtn();
		Thread.sleep(2000);
		p.clickOnProductLink();
		String actual_result = c.verifyProductDetails();
		Assert.assertEquals(expected_result, actual_result);
	}
    @Test
     public void verifyProductIsAddingToCart() throws InterruptedException
   {
	LoginPage l = new LoginPage();
	CommonComp c = new CommonComp();
	ProductPage p = new ProductPage();
	AddToCartPage a = new AddToCartPage();
	l.enterUserName("standard_user");
	Thread.sleep(2000);
	l.enterPassword("secret_sauce");
	Thread.sleep(2000);
	l.ClickOnLoginBtn();
	p.clickOnProductLink();
	a.clickOnAddToCartBtn();
	
   }
   }
