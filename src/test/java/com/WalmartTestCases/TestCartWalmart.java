package com.WalmartTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
//	@Test
//	public void GoToSkinCarePagenumberOfItems_Test6() {
//		skinCarePage= homePageWalmart.GoToSkinCarePage();
//		driver.findElement(By.xpath("//article[@title='Skin care tools']")).click();
//		List<WebElement> Items=driver.findElements(By.tagName("button"));
//		List<WebElement> ItemsLink=driver.findElements(By.tagName("a"));
//		System.out.println(Items.size());
//		System.out.println(ItemsLink.size());
//	 for(int i=0; i<ItemsLink.size(); i++) { //loop to get all number of link
//		 String itemslisted =ItemsLink.get(i).getText();//  this is to make it  String value
//		System.out.println(itemslisted);// this is to print all links form website.
//
//				 System.out.println(ItemsLink.size());
//	 	}
//	}
		
}
