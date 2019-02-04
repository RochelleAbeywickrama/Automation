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

}
