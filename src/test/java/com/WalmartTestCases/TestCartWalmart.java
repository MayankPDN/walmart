package com.WalmartTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WalmartPages.HomePageWalmart;
import com.WalmartPages.RegistrationPage;
import com.WalmartPages.SignInPageWalmart;
import com.WalmartPages.SkinCarePage;
import com.WalmartPages.SuperHeroPage;

import baseclass.BaseClassWalmart;

public class TestCartWalmart extends BaseClassWalmart{
	
	HomePageWalmart homePageWalmart;
	SignInPageWalmart signInPageWalmart;
	RegistrationPage registrationPage;
	SkinCarePage skinCarePage;
	SuperHeroPage superHeroPage;
	
	
	public TestCartWalmart() {
		super(); // calling prop from baseclass
	}
	@BeforeMethod
	public void satup() {
		initialization();
		homePageWalmart = new HomePageWalmart();
		skinCarePage= new SkinCarePage();
		superHeroPage= new SuperHeroPage();
	}
	@Test
	public void ShoppingCart_Test1() {
		homePageWalmart.GoToSkinCarePage();
		skinCarePage.AddSkincareItemToCart();
//		driver.findElement(By.xpath("//article[@title='Skin care tools']")).click();
//		driver.findElement(By.cssSelector("#thumb-0X9FWUTN4Y50 .image")).click();
//		driver.findElement(By.xpath("//button[contains(.,'Add to cart')]")).click();
//		driver.findElement(By.xpath("//button[contains(.,'Checkout')]")).click();
		String Units=driver.findElement(By.cssSelector(".css-nk32ej > a:nth-child(1) > span")).getText();
		Assert.assertEquals(Units, "1");
		}
}
