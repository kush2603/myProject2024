package com.sd.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sd.testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//----obj repository----------
	@FindBy(xpath = "//input[contains(@id,'user-name')]")
	private WebElement enterUserName;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement enterPassword;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement clickOnLoginBtn;
	
	//=================actions method======================
	public void enterUserName(String username)
	{
		enterUserName.sendKeys(username);
	}

	public void enterPassword(String password)
	{
		enterPassword.sendKeys(password);
	}
	
	public void ClickOnLoginBtn()
	{
		clickOnLoginBtn.click();
    }
	
	
}
