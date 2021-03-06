package com.events.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.events.utilities.ConfigurationReader;
import com.events.utilities.Driver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@href='/web?db=BriteErpDemo']")
	private WebElement homepage;

	@FindBy(id = "login")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//a[@data-menu='124']")
	private WebElement EventsModule;
	
	
	public void loginAsUser() {
		homepage.click();
		email.sendKeys(ConfigurationReader.getProperty("eventsUserName"));
		pwd.sendKeys(ConfigurationReader.getProperty("eventsUserPwd"));
		loginBtn.click();
		EventsModule.click();
	}

	public void loginAsManager() {
		homepage.click();
		email.sendKeys(ConfigurationReader.getProperty("eventsManagerName"));
		pwd.sendKeys(ConfigurationReader.getProperty("eventsManagerPwd"));
		loginBtn.click();
		EventsModule.click();
	}

}
