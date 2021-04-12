package com.ecommerce.amazon.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecommerce.amazon.actions.HomePageActions;
import com.ecommerce.amazon.base.BaseTest;

public class test_HomePage extends BaseTest {
	
	@Test(priority = 1)
	public void verifySearchProduct() {

		HomePageActions _homePageActions = new HomePageActions();
		_homePageActions.searchProduct("Samsung Mobile");
		String expectedProductName="Samsung";
		String actualProdutName=_homePageActions.getProductName();
		Assert.assertTrue(actualProdutName.contains(expectedProductName), "Expected product name contains the product name");
		
	}

	@Test(priority = 2)
	public void verifyLoginToAccount() {

		HomePageActions _homePageActions = new HomePageActions();
		_homePageActions.clickOnAccountAndListMenu().loginToAccount("9760918558", "manvswild@123");;
	}
}
