package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}

	// Find the elements in Web pages

	@FindBy(xpath = "//input[@name='uid']")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@name='btnLogin']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//a[normalize-space()='Log out']")
	@CacheLookup
	WebElement lnkLogout;

	// Create action methods for web elements

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void clickSubmit() {
		btnLogin.click();
	}

	public void clickLogout() {
		lnkLogout.click();
	}

}
