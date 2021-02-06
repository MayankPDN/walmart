package com.WalmartTestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WalmartPages.HomePageWalmart;
import com.WalmartPages.PersonalSettingPage;
import com.WalmartPages.SignInPageWalmart;

import baseclass.BaseClassWalmart;

public class TestPersonalSettingWalmart extends BaseClassWalmart {
	
		HomePageWalmart homePageWalmart;
		SignInPageWalmart signInPageWalmart;
		PersonalSettingPage personalSettingPage;
	
	
	public TestPersonalSettingWalmart() {
		super(); // calling prop from baseclass
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homePageWalmart = new HomePageWalmart();
		signInPageWalmart= new SignInPageWalmart();
		personalSettingPage= new PersonalSettingPage();
	}
	@Test
	public void verifysignIn_Test1() {
		homePageWalmart = homePageWalmart.SigninWithValidData();
		homePageWalmart.GoToPersonalSettingPage();
		personalSettingPage.EditPersonalInfo();
	}

}
