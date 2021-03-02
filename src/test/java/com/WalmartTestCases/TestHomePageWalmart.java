package com.WalmartTestCases;

import java.util.List;

import org.openqa.selenium.By;
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

public class TestHomePageWalmart extends BaseClassWalmart {
	
	HomePageWalmart homePageWalmart;
	SignInPageWalmart signInPageWalmart;
	RegistrationPage registrationPage;
	SkinCarePage skinCarePage;
	SuperHeroPage superHeroPage;
	
	
	public TestHomePageWalmart() {
		super(); // calling prop from baseclass
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePageWalmart = new HomePageWalmart();
	}
	@Test
	public void VerifyWalmartLogo_Test1() {
	boolean WalmartLogo = homePageWalmart.verifyLogo();
	Assert.assertTrue(WalmartLogo);
	}
	@Test
	public void verifysignIn_Test2() {
		homePageWalmart = homePageWalmart.SigninWithValidData();
	}
	@Test
	public void GotoregistrationPage_Test3() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		Assert.assertTrue(true);
	}
	@Test
	public void GoToSkinCarePage_Test4() {
		skinCarePage= homePageWalmart.GoToSkinCarePage();
		Assert.assertTrue(true);
	}
	@Test
	public void GoToSuperHeroPage_Test5() {
		superHeroPage= homePageWalmart.GoToToysPage();
		Assert.assertTrue(true);
	}
	
}
