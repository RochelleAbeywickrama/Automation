package com.savimaga.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.savimaga.base.BasePageObjects;

public class Dashboard extends BasePageObjects{

	public Dashboard(WebDriver driver) {
		super(driver);
	}

	
	/* Objects initialization */
	public static WebElement elelblDashboard(WebDriver driver){
	    return driver.findElement(By.xpath("//span[text()='Dashboard']"));
	 }
	
	public static WebElement elelblCustomer(WebDriver driver){
	   	return driver.findElement(By.xpath("//a//span[text()='Customer']"));
	 }
	
	public static WebElement elelblLoan(WebDriver driver){
		return driver.findElement(By.xpath("//a//span[text()='Loan']"));
	 }

	public static WebElement elelblNewCustomer(WebDriver driver){
		return driver.findElement(By.xpath("//a//span[text()='Customer']//following::a[text()='New Customer']"));
	}
	
	public static WebElement elelblApplyLoan(WebDriver driver){
		return driver.findElement(By.xpath("//a//span[text()='Loan']//following::a[text()='Apply Loan']"));
	}
	
	/* methods */
	public void clickOnDashboard(){
		elelblDashboard(driver).click();
	}
	
	public Customer clickOnNewCustomer(){
		elelblCustomer(driver).click();
		elelblNewCustomer(driver).click();
		return new Customer(driver);
	}
	
	public Loan clickOnApplyLoan(){
		elelblLoan(driver).click();
		elelblApplyLoan(driver).click();
		return new Loan(driver);
	}
	
}
