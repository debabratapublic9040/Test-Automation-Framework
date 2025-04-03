package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		BrowserUtility browserUtility=new BrowserUtility(driver);
		browserUtility.goToWebsite("https://www.automationpractice.pl/index.php");
		
		browserUtility.maximizeWindow();
		
		By signInLocator=By.xpath("//a[contains(text(),'Sign in')]");
		browserUtility.clickOn(signInLocator);
		
		By emailTextBoxLocator=By.id("email");
		browserUtility.enterText(emailTextBoxLocator,"linelo7606@avulos.com");
		
		By passwordTextBoxLocator=By.id("passwd");
		browserUtility.enterText(passwordTextBoxLocator,"Password");
	
		By sunmitLoginButtonLocator=By.id("SubmitLogin");
		browserUtility.clickOn(sunmitLoginButtonLocator);
		
		System.out.println("Done");
	}

}
