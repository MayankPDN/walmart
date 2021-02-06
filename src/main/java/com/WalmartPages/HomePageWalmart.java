package com.WalmartPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.BaseClassWalmart;

public class HomePageWalmart extends BaseClassWalmart {
	
	@FindBy(xpath=" //*[@id='walmartblue_Layer_1']")
	WebElement walmartLogo;
	@FindBy(xpath="//a[@id='departments-button']")
	WebElement Department;
	@FindBy(css=".e1xoeh2i1")
	WebElement SearchBox;
	@FindBy(xpath="//button[@class='css-1pgwcoa e1xoeh2i2']")
	WebElement SearchBotton;
	@FindBy(xpath="//a[@class='css-1xh2uh0 evkjyb00']")
	WebElement SingInLink;
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement RegisteredUserName;
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement RegisteredPassword;
	@FindBy(xpath="//button[@class='css-vfxkzw edzik9p0']")
	WebElement SignInButton;
	@FindBy(xpath="//span[contains(text(),'Hi')]")
	WebElement SignInHi;
	
	@FindBy(xpath="//a[@class='css-1syn49 elkyjhv0'and @href='create-account']")
	WebElement CreateAccountLink;
	@FindBy(css=".active > a:nth-child(1)")
	WebElement MyAccountPageLink;
	@FindBy(xpath="//ul//a[contains(text(),'My Recommendations')]")
	WebElement MyRecommendationsLink;
	@FindBy(xpath="//ul//a[contains(text(),'Order History ')]")
	WebElement MyOrderHistoryLink;
	@FindBy(xpath="//ul//a[contains(text(),'My Subscriptions')]")
	WebElement MySubscriptionsLink;
//	@FindBy(css="li.css-18iivt9:nth-child(5) > div:nth-child(2) > a:nth-child(1)")
//	WebElement MyLIstLink;
//	@FindBy(css="li.css-18iivt9:nth-child(6) > div:nth-child(2) > a:nth-child(1)")
//	WebElement MyRegistriesLink;//removed form website
	@FindBy(xpath="//a[contains(text(),'Personal Settings')]")
	WebElement MyPersonalSettingLink;
//	@FindBy(xpath="//a[contains(text(),'Personal Settings')]")
//	WebElement AddressesLink;
	@FindBy(xpath="//ul//a[contains(text(),'Sign Out')]")
	WebElement SignOutLink;
	@FindBy(css=".css-nk32ej > a:nth-child(1) > svg:nth-child(1)")
	WebElement Cart;
	@FindBy(xpath="//a[contains(text(),'Health, Beauty & Pharmacy')]")
	WebElement healthBeautyParmacyLink;
	@FindBy(xpath="//a[contains(text(),'Skin Care')]")
	WebElement SkincareLink;
	@FindBy(xpath="//a[contains(text(),'Toys')]")
	WebElement ToysLink;
	@FindBy(xpath="//a[contains(text(),'Superheroes & villains')]")
	WebElement SuperheroLink;
	
	//Initializing page Objects:
	
	public HomePageWalmart() {
		PageFactory.initElements(driver, this);
	}
	public String verifyTitle() {
		return driver.getTitle();
	}
		
	public boolean verifyLogo() {
		return walmartLogo.isDisplayed();
	}
	public HomePageWalmart SigninWithValidData() {
		SingInLink.click();
		RegisteredUserName.sendKeys("tt2955107@gmail.com");
		RegisteredPassword.sendKeys("Jwilson#1");
		SignInButton.click();
		return new HomePageWalmart();
	}
	public SkinCarePage GoToSkinCarePage() {
		Actions action= new Actions(driver);// passing Action object to driver
		action.moveToElement(Department).build().perform();
		action.moveToElement(healthBeautyParmacyLink).build().perform();
		action.moveToElement(SkincareLink).build().perform();
		SkincareLink.click();
		return new SkinCarePage();
	}
	public SuperHeroPage GoToToysPage() {
		Actions action= new Actions(driver);// passing Action object to driver
		action.moveToElement(Department).build().perform();
		action.moveToElement(ToysLink).build().perform();
		action.moveToElement(SuperheroLink).build().perform();
		SuperheroLink.click();
		return new SuperHeroPage();
	}
	public RegistrationPage GoToRegistrationPage() {
		SingInLink.click();
		CreateAccountLink.click();
		return new RegistrationPage();
	}
//	public MyRegistriesPage GoToMyRegistriesPage() {
//		SingInLink.click();
//		MyRegistriesLink.click();
//		return new MyRegistriesPage();
//	}
	public OrderHistoryPage GoToOrderHistoryPage() {
		SingInLink.click();
		MyOrderHistoryLink.click();
		return new OrderHistoryPage();
	}
	public PersonalSettingPage GoToPersonalSettingPage() {
		SingInLink.click();
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Hi')]")));
		MyPersonalSettingLink.click();
		return new PersonalSettingPage();
	}
	
}
