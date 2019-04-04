package com.savimaga.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.savimaga.base.BasePageObjects;

public class Customer extends BasePageObjects{

	public Customer(WebDriver driver) {
		super(driver);
	}
	
	static String nic = "nic";
	static String fname = "fname";
	static String lname = "lname";
	static String email = "email";
	static String address1 = "address1";
	static String address2 = "address2";
	static String phno1 = "phno1";
	static String phno2 = "phno2";
	
	/* Objects initialization */
	public static WebElement txtNIC(WebDriver driver){
	    return driver.findElement(By.id(nic));
	 }
	
	public static WebElement txtFirstname(WebDriver driver){
		return driver.findElement(By.id(fname));
	 }
	
	public static WebElement txtLastname(WebDriver driver){
		return driver.findElement(By.id(lname));
	 }
	
	public static WebElement txtEmail(WebDriver driver){
	    return driver.findElement(By.id(email));
	 }
	
	public static WebElement txtAddress1(WebDriver driver){
	    return driver.findElement(By.id(address1));
	 }
	
	public static WebElement txtAddress2(WebDriver driver){
		return driver.findElement(By.id(address2));
	 }
	
	public static WebElement txtPhone1(WebDriver driver){
	    return driver.findElement(By.id(phno1));
	 }
	
	public static WebElement txtPhone2(WebDriver driver){
	    return driver.findElement(By.id(phno2));
	 }

	public static WebElement btnSubmit(WebDriver driver){
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	/* methods */
	public void fillDataForm(String nic, String fname, String lname, String email, String address1, String address2, String phone1, String phone2){
		txtNIC(driver).sendKeys(nic);
		txtFirstname(driver).sendKeys(fname);
		txtLastname(driver).sendKeys(lname);
		txtEmail(driver).sendKeys(email);
		txtAddress1(driver).sendKeys(address1);
		txtAddress2(driver).sendKeys(address2);
		txtPhone1(driver).sendKeys(phone1);
		txtPhone2(driver).sendKeys(phone2);
	}
	
	public void clickSubmit(){
		btnSubmit(driver).click();
	}
	 
	
	public Dashboard navigateToDashboard(){
		return new Dashboard(driver);
	}
}
