package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;

public class LoginTest2 {

	public static void main(String[] args) {
		
		WebDriver wd=new ChromeDriver();
		//HomePage homePage=new HomePage(wd);//This is the real code for this class
		//HomePage homePage=new HomePage("chrome");//This is the fix for above code line
		HomePage homePage=new HomePage(CHROME,true);//This is the fix for above code line
		homePage.goToLoginPage();
		LoginPage loginPage=new LoginPage(wd);
		loginPage.doLoginWith("linelo7606@avulos.com","Password");
				
		
		
	}

}
