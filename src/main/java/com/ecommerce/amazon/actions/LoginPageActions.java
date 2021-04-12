package com.ecommerce.amazon.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.amazon.base.BaseTest;

public class LoginPageActions extends BaseTest{
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement emailOrMobileTextbox;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passwordTextbox;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	public LoginPageActions() {
		PageFactory.initElements(driver, this);
	}

	
	public void loginToAccount(String emailOrMobile,String password) {
		emailOrMobileTextbox.sendKeys(emailOrMobile);
		continueButton.click();
		passwordTextbox.sendKeys(password);
		signInButton.click();
	}
}
