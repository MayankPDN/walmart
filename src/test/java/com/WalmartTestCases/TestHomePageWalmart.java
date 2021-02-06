package com.WalmartTestCases;

import org.openqa.selenium.By;
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
	}
	@Test
	public void GoToSkinCarePage_Test4() {
		skinCarePage= homePageWalmart.GoToSkinCarePage();
	}
	@Test
	public void GoToSuperHeroPage_Test5() {
		superHeroPage= homePageWalmart.GoToToysPage();
		}
	@Test
	public void verifyHeader_Test6() {
		
		
	}
	
}
