package com.ecommerce.amazon.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.amazon.base.BaseTest;

public class HomePageActions extends BaseTest{
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement accountAndListMenu;
	
	@FindBy(xpath="//span[@cel_widget_id='MAIN-SEARCH_RESULTS-1']/div/div/div[2]/div[2]/div/div[1]")
	private WebElement searchedProdut;
	
	public HomePageActions() {
		PageFactory.initElements(driver, this);
	}

	
	public void searchProduct(String productName) {
		searchBox.sendKeys(productName);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public LoginPageActions clickOnAccountAndListMenu() {
		accountAndListMenu.click();
		return new LoginPageActions();
	}
	
	public String getProductName() {
		
		return searchedProdut.getText();
	}
}

