package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class ProductPage extends TestBase{
	
	public ProductPage() {
		
		PageFactory.initElements(driver, this);
	}
//==================object repository================================
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username_txtbox;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement product_link;
	
//===================Actions Method====================================
	
	public void enterUserName(String username)
	{
		username_txtbox.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();	
	}
	
	public void clickOnProductLink()
	{
		product_link.click();
	}
}
