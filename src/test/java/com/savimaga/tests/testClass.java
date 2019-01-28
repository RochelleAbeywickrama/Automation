package com.savimaga.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.savimaga.base.BaseTest;
import com.savimaga.pageObjects.Login;

public class testClass extends BaseTest{

	
	public String environment;
	
	@Test
	public void test(){
		
		
		
		Login loginPage = new Login(getDriver());
		
	}
}
