package com.savimaga.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.savimaga.base.BasePageObjects;

public class Login extends BasePageObjects {	

	public Login(WebDriver driver) {
        super(driver);
    }
	
	
	/* Objects initialization */
	public static WebElement txtUserName(WebDriver driver){
		return driver.findElement(By.name("username"));
	 }
	
	public static WebElement txtPassword(WebDriver driver){
	    return driver.findElement(By.name("password"));
	 }
	 
	public static WebElement btnSubmit(WebDriver driver){
	    return driver.findElement(By.name("login"));
	 }
	 
	/* methods */
	public Dashboard LoginToWeb(String username, String password){
		txtUserName(driver).sendKeys(username);
		txtPassword(driver).sendKeys(password);
		btnSubmit(driver).click();
		return new Dashboard(driver);
	}
}
