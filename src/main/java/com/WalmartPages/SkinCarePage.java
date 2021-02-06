package com.WalmartPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClassWalmart;

public class SkinCarePage extends BaseClassWalmart {

	@FindBy(xpath=" //article[@title='Skin care tools']")
	WebElement SkinCareToolBar;
	@FindBy(css="#thumb-0X9FWUTN4Y50 .image")
	WebElement Item;
	@FindBy(xpath="//button[contains(.,'Add to cart')]")
	WebElement AddToCart;
	@FindBy(xpath="//button[contains(.,'Checkout')]")
	WebElement checkOutBotton;
	@FindBy(css=".css-nk32ej > a:nth-child(1) > span")
	WebElement NumberOfItem;
	
	//Initializing page Objects:
	
		public SkinCarePage() {
			PageFactory.initElements(driver, this);
		}
	
	public String AddSkincareItemToCart() {
		SkinCareToolBar.click();
		Item.click();
		AddToCart.click();
		checkOutBotton.click();
		return driver.getTitle();
		
	}
}
