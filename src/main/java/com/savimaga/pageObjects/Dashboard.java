package com.savimaga.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.savimaga.base.BasePageObjects;

public class Dashboard extends BasePageObjects{

	public Dashboard(WebDriver driver) {
		super(driver);
	}

	private static WebElement element = null;
	
	/* Objects initialization */
	public static WebElement elelblDashboard(WebDriver driver){
	    element = driver.findElement(By.xpath("//a[text()='Dashboard ']"));
	    return element;
	 }
	
	public static WebElement elelblCustomer(WebDriver driver){
	    element = driver.findElement(By.xpath("//a//span[text()='Customer']"));
	    return element;
	 }

	public static WebElement elelblNewCustomer(WebDriver driver){
		element = driver.findElement(By.xpath("//a//span[text()='Customer']//following::a[text()='New Customer']"));
		return element;
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
	
	
}
