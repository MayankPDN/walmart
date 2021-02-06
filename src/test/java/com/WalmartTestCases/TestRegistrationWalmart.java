package com.WalmartTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.WalmartPages.HomePageWalmart;
import com.WalmartPages.RegistrationPage;

import baseclass.BaseClassWalmart;


public class TestRegistrationWalmart extends BaseClassWalmart{
	
	RegistrationPage registrationPage;
	HomePageWalmart homePageWalmart;
	
	
	public TestRegistrationWalmart() {
		super(); //calling prop from baseclass
	}
	@BeforeMethod
	public void satup() {
		initialization();
		homePageWalmart = new HomePageWalmart();
		registrationPage = new RegistrationPage();
	}
	@Test
	public void registration_Test1() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		registrationPage.NewRegistration();
		Assert.assertEquals(registrationPage.MyAccountURL(), "https://www.walmart.ca/my-account");
		}
	@Test
	public void registrationFirstName_Test2() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("M");
		driver.findElement(By.id("lastName")).click();
		String error= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
		Assert.assertEquals(error, "Please enter a valid first name.");
	}
	@Test
	public void registrationFirstName_Test3() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("M2");
		driver.findElement(By.id("lastName")).click();
		String error= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
		Assert.assertEquals(error, "Please enter a valid first name.");
	}
	@Test
	public void registrationFirstName_Test4() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("M#");
		driver.findElement(By.id("lastName")).click();
		String error= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
		Assert.assertEquals(error, "Please enter a valid first name.");
	}
	@Test
	public void registrationFirstName_Test5() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("2$");
		driver.findElement(By.id("lastName")).click();
		String error= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
		Assert.assertEquals(error, "Please enter a valid first name.");
	}
	@Test
	public void registrationFirstName_Test6() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("M2$");
		driver.findElement(By.id("lastName")).click();
		String error= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
		Assert.assertEquals(error, "Please enter a valid first name.");
	}
//	@Test
//	public void registrationFirstName_Test7() {
//		registrationPage = homePageWalmart.GoToRegistrationPage();
//		driver.findElement(By.id("firstName")).sendKeys("walmartusernamecheckwalmartusernamecheckwalmartuse");
//		driver.findElement(By.id("lastName")).click();
//		String error= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
//		Assert.assertEquals(error, "Please enter a valid first name.");
//	}
	@Test
	public void registrationLastName_Test8() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("M");
		driver.findElement(By.id("phoneNumber")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid last name.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid last name.");
	}
	@Test
	public void registrationLastName_Test9() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("M2");
		driver.findElement(By.id("phoneNumber")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid last name.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid last name.");
	}
	@Test
	public void registrationLastName_Test10() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("$2");
		driver.findElement(By.id("phoneNumber")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid last name.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid last name.");
	}
	@Test
	public void registrationLastName_Test11() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("M$2");
		driver.findElement(By.id("phoneNumber")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid last name.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid last name.");
	}
	@Test
	public void registrationPhoneNumber_Test12() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("MM");
		driver.findElement(By.id("phoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("email")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid phone number.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid phone number.");
	}
	@Test
	public void registrationPhoneNumber_Test13() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("MM");
		driver.findElement(By.id("phoneNumber")).sendKeys("01234567891");
		driver.findElement(By.id("email")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid phone number.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid phone number.");
	}
	@Test
	public void registrationPhoneNumber_Test14() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("MM");
		driver.findElement(By.id("phoneNumber")).sendKeys("123ABC7891");
		driver.findElement(By.id("email")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid phone number.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid phone number.");
	}
	@Test
	public void registrationPhoneNumber_Test15() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MM");
		driver.findElement(By.id("lastName")).sendKeys("MM");
		driver.findElement(By.id("phoneNumber")).sendKeys("1##ABC7891");
		driver.findElement(By.id("email")).click();
		String error= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid phone number.')]")).getText();
		Assert.assertEquals(error, "Please enter a valid phone number.");
	}
	@Test
	public void registrationNullFirstLastName_Test16() {
		registrationPage = homePageWalmart.GoToRegistrationPage();	
		driver.findElement(By.id("email")).sendKeys("dany.dany@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Jwilson#1");
		driver.findElement(By.xpath("//button[contains(.,'Create account')]")).click();
		String FirstNameError= driver.findElement(By.xpath("//span[contains(text(),'Please enter your first name.')]")).getText();
		Assert.assertEquals(FirstNameError, "Please enter your first name.");
		String LastNameError= driver.findElement(By.xpath("//span[contains(text(),'Please enter your last name.')]")).getText();
		Assert.assertEquals(LastNameError, "Please enter your Last name.");
	}
	@Test
	public void registrationTermsOfUseCheckBox_Test17() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("M@#");
		driver.findElement(By.id("lastName")).sendKeys("M@#");
		driver.findElement(By.id("email")).sendKeys("dany.dany@gmail");
		driver.findElement(By.id("password")).sendKeys("Jwilson#1");
		driver.findElement(By.xpath("//button[contains(.,'Create account')]")).sendKeys(Keys.ENTER);
//		registrationPage.ClickEmailMeAbout();
//		registrationPage.ClickTermsCheckBox();
//		registrationPage.ClickCreatAccountButton();
		String FirstNameError= driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(2) > .css-1lliris")).getText();
		Assert.assertEquals(FirstNameError, "Please enter a valid first name.");
		String LastNameError= driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid last name.')]")).getText();
		Assert.assertEquals(LastNameError, "Please enter a valid last name.");
		String TermsCheckBoxError= driver.findElement(By.xpath("//div[contains(text(),'You must read and accept Walmart’s Terms of Use to subscribe.')]")).getText();
		Assert.assertEquals(TermsCheckBoxError, "You must read and accept Walmart’s Terms of Use to subscribe.");
	}
	@Test
	public void registrationTermsOfUseCheckBox_Test18() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MMM");
		driver.findElement(By.id("lastName")).sendKeys("MMM");
		driver.findElement(By.id("email")).sendKeys("dany.dany@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Jwilson#1");
		driver.findElement(By.xpath("//button[contains(.,'Create account')]")).sendKeys(Keys.ENTER);
		String TermsCheckBoxError= driver.findElement(By.xpath("//div[contains(text(),'You must read and accept Walmart’s Terms of Use to subscribe.')]")).getText();
		Assert.assertEquals(TermsCheckBoxError, "You must read and accept Walmart’s Terms of Use to subscribe.");
	}	
	@Test
	public void registrationPasswordStrangth_Test19() {
		registrationPage = homePageWalmart.GoToRegistrationPage();
		driver.findElement(By.id("firstName")).sendKeys("MMM");
		driver.findElement(By.id("lastName")).sendKeys("MMM");
		driver.findElement(By.id("email")).sendKeys("dany.dany@gmail.com");
		driver.findElement(By.id("password")).sendKeys("JJJJJJ");
		String WeakPassword= driver.findElement(By.xpath("//div[@class='password-strength-label']")).getText();
		Assert.assertEquals(WeakPassword, "Password Strength: weak");
		driver.findElement(By.id("password")).sendKeys("JJJJJJ#");
		String ModeratePassword= driver.findElement(By.xpath("//div[@class='password-strength-label']")).getText();
		Assert.assertEquals(ModeratePassword, "Password Strength: moderate");
		driver.findElement(By.id("password")).sendKeys("JJJJJJ#7");
		String StrongPassword= driver.findElement(By.xpath("//div[@class='password-strength-label']")).getText();
		Assert.assertEquals(StrongPassword, "Password Strength: strong");
	}	
		
}
