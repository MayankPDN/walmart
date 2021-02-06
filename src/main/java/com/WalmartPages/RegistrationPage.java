package com.WalmartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClassWalmart;

public class RegistrationPage extends BaseClassWalmart {
	
	@FindBy(id="firstName")
	WebElement NewFirstName;
	@FindBy(id="lastName")
	WebElement NewLastName;
	@FindBy(id="phoneNumber")
	WebElement NewphoneNumber;
	@FindBy(id="email")
	WebElement NewEmail;
	@FindBy(id="password")
	WebElement NewPassword;
	@FindBy(xpath="//input[@id='marketingPreference']")
	WebElement EmailMeAbout;
	@FindBy(xpath="//input[@id='TAndC']")
	WebElement TermAndConditionBox;
	@FindBy(xpath="//button[contains(.,'Create account')]")
	WebElement CreateAccountButton;
	
	
	//Initializing page Objects:
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyTitle() {
		return driver.getTitle();
	}
	public void NewRegistration() {
		NewFirstName.sendKeys("newfirstname");
		NewLastName.sendKeys("newLastname");
		NewphoneNumber.sendKeys("1111111111");
		NewEmail.sendKeys("ggyyss@gmail.com");
		NewPassword.sendKeys("Jwilson#1");
		EmailMeAbout.click();
		TermAndConditionBox.click();
		CreateAccountButton.click();
		}
	public String MyAccountURL() {
		return driver.getCurrentUrl();
	}
//	public void ClickCreatAccountButton() {
//		
//		Actions action= new Actions(driver);
//		action.moveToElement(CreateAccountButton).click().build().perform();
//	}
//	public void ClickTermsCheckBox() {
//		
//		Actions action= new Actions(driver);
//		action.moveToElement(TermAndConditionBox).click().build().perform();
//	}
//	public void ClickEmailMeAbout() {
//	
//	Actions action= new Actions(driver);
//	action.moveToElement(EmailMeAbout).click().build().perform();
//	}
}

