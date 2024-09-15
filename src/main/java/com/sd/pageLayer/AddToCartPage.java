package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class AddToCartPage extends TestBase {
	
	public AddToCartPage()
	{
		PageFactory.initElements(driver, this);
	}
//===========================object repository==========================
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement addToCartBtn;
	
	
//	==================actions method===================================
	public void clickOnAddToCartBtn()
	{
		addToCartBtn.click();
	}
	
}
