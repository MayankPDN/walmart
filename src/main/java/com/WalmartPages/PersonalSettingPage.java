package com.WalmartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClassWalmart;

public class PersonalSettingPage extends BaseClassWalmart{
	
	@FindBy(xpath="//span[@id=\"set-edit-info\"]")
	WebElement PinfoEdit;
	@FindBy(xpath="//input[@id='phone']")
	WebElement PhoneNumber;
	@FindBy(xpath="//input[@name='firstName']")
	WebElement FirstName;
	@FindBy(xpath="//input[@name='lastName']")
	WebElement LastName;
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement PostalCode;
	@FindBy(xpath="//button[@id='update-details-btn']")
	WebElement PinfoSave;
	@FindBy(xpath="//span[@id=\"set-edit-email\"]']")
	WebElement PEmailEdit;
	@FindBy(xpath="//input[@name='email']")
	WebElement Pemail;
	@FindBy(xpath="//input[@id='email-password']")
	WebElement PPassword;
	@FindBy(xpath="//button[@id='update-email-btn']")
	WebElement PEmailSave;
	
	//Initializing page Objects:
	
		public PersonalSettingPage() {
			PageFactory.initElements(driver, this);
		}
		
		public PersonalSettingPage EditPersonalInfo() {
			PinfoEdit.click();
//			PhoneNumber.clear();
//			PhoneNumber.sendKeys("1234567890");
			FirstName.clear();
			FirstName.sendKeys("ranrry");
			LastName.clear();
			LastName.sendKeys("Lilmontson");
			PostalCode.clear();
			PostalCode.sendKeys("M4V4V3");
			PinfoSave.click();
			return new PersonalSettingPage();
		}
	
	
	
}
