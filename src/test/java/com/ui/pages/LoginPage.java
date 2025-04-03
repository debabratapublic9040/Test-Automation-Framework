package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;
import com.utility.LoggerUtility;

public final class LoginPage extends BrowserUtility{
	Logger logger=LoggerUtility.getLogger(this.getClass());
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	private static final By EMAIl_TEXT_BOX_LOCATOR=By.id("email");
	private static final By PASSWORD_TEXT_BOX_LOCATOR=By.id("passwd");
	private static final By SUBMIT_BUTTON_LOCATOR=By.id("SubmitLogin");
	
	public MyAccountPage doLoginWith(String emailAddress,String password)
	{
		logger.info("Fing the locator and enter the email");
		enterText(EMAIl_TEXT_BOX_LOCATOR, emailAddress);
		logger.info("Fing the locator and enter the password");
		enterText(PASSWORD_TEXT_BOX_LOCATOR, password);
		logger.info("Peforming click action with by taking locator");
		clickOn(SUBMIT_BUTTON_LOCATOR);
		MyAccountPage myAccountPage=new MyAccountPage(getDriver());
		return myAccountPage;
	}

}
