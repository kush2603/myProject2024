package com.sd.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class CommonComp extends TestBase{
	
	public CommonComp()
	{
		PageFactory.initElements(driver, this);
	}
//	=============object repository============================
	
	@FindBy(xpath = "//span[text()='Products']")
	private WebElement swagLabs_text;
	
	@FindBy(xpath="//div[@class='error-message-container error']")
	private WebElement error_message_output;
	
	@FindBy(xpath = "//div[@class='error-message-container error']")
	private WebElement error_message;
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement verifyProduct1;
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	private WebElement verifyProduct2;
	
	@FindBy(xpath = "//div[text()='carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.']")
	private WebElement product;
	
//	===========actions method===================================
	public String getTextMessageOnHomePage()
	{
		String message = swagLabs_text.getText();
		return message;
	}
	
	public String getErrorMessageOnInvalidCredentials()
	{
		String error_cred = error_message_output.getText();
		return error_cred;
	}
	
	public String getErrorMessage()
	{
		String error = error_message.getText();
		return error;
	}
	public String verifyProduct1()
	{
		String sauceLabs = verifyProduct1.getText();
		return sauceLabs;
	}
	public String verifyProduct2()
	{
		String backPack = verifyProduct2.getText();
		return backPack;
	}
	public String verifyProductDetails()
	{
		String details = product.getText();
		return details;
	}

}
