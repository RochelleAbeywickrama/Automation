package com.savimaga.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.savimaga.base.BasePageObjects;

public class Loan extends BasePageObjects{

	public Loan(WebDriver driver) {
		super(driver);
	}

	/* Objects initialization */
	public static WebElement txtApplyAmount(WebDriver driver){
		return driver.findElement(By.id("amount"));
	 }	
	
	public static WebElement txtInterest(WebDriver driver){
		return driver.findElement(By.id("rate"));
	}
	
	public static WebElement txtPeriod(WebDriver driver){
		return driver.findElement(By.id("days"));
	}
	
	public static WebElement btnSubmit(WebDriver driver){
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	/* methods */
	public void fillLoanApplyForm(String name, String loanType, String area, String amount, String interest, String period){
		Select ddExtApplicant = new Select(driver.findElement(By.name("extApplicant")));
		ddExtApplicant.selectByVisibleText(name);
		
		Select ddLoanType = new Select(driver.findElement(By.name("loan_type")));
		ddLoanType.selectByVisibleText(loanType);
		
		Select ddArea = new Select(driver.findElement(By.name("area")));
		ddArea.selectByVisibleText(area);
		
		txtApplyAmount(driver).sendKeys(amount);
		txtInterest(driver).sendKeys(interest);
		txtPeriod(driver).sendKeys(period);
		
	}
	
	public Dashboard navigateToDashboard(){
		return new Dashboard(driver);
	}
}
