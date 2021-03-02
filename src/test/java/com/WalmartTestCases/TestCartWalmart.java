package com.WalmartTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@Test
	public void GoToSkinCarePagenumberOfItems_Test6() throws InterruptedException {
		skinCarePage= homePageWalmart.GoToSkinCarePage();
		driver.findElement(By.cssSelector("#h1xGOLjm > span:nth-child(2) > p:nth-child(1)")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		
		Thread.sleep(20000);
		List<WebElement> AddToCartItems=driver.findElements(By.xpath("//button[contains(.,'Add to cart')]"));
		List<WebElement> ViewDetailsItems=driver.findElements(By.xpath("//button[contains(.,'Choose options')]"));
//		List<WebElement> ItemsLink=driver.findElements(By.tagName("a"));
//		System.out.println(ItemsLink.size());
		
		
		
		System.out.println(AddToCartItems.size());
		System.out.println(ViewDetailsItems.size());
//	 for(int i=0; i<AddToCartItems.size(); i++) { //loop to get all number of link
//		 String itemslisted =Items.get(i).getText();//  this is to make it  String value
//		System.out.println(itemslisted);// this is to print all links form website.

				 System.out.println(AddToCartItems.size());
				 System.out.println(AddToCartItems.size()+ViewDetailsItems.size());
				 Assert.assertEquals(AddToCartItems.size()+ViewDetailsItems.size(), 60);
	 	}
//	}
		 
}
