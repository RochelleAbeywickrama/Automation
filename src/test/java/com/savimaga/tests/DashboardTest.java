package com.savimaga.tests;

import org.testng.annotations.Test;

import com.savimaga.base.BaseTest;
import com.savimaga.pageObjects.Login;
import com.savimaga.pageObjects.Customer;
import com.savimaga.pageObjects.Dashboard;
import com.savimaga.pageObjects.Loan;

public class DashboardTest extends BaseTest{

	public String environment;
	public Login loginPage = null;
	public Dashboard dashboardPage = null;
	public Customer customerPage = null;
	
	
	@Test(priority=1)
	public void tc_LoginToWebPortal(){
		try {
			Login loginPage = new Login(getDriver());
			dashboardPage = loginPage.LoginToWeb("rochelle", "savi@1234");
			Thread.sleep(5000);
			dashboardPage.clickOnDashboard();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2, enabled=true)
	public void tc_AddNewCustomer(){
		Customer customerPage = new Customer(getDriver());
		customerPage = dashboardPage.clickOnNewCustomer();
		customerPage.fillDataForm("919216354V", "Jayani", "Perera", "jayani.perera@yahoo.com", "Temple lane", "Athurugiriya", "0772182331", "0112382789");
		customerPage.clickSubmit();
		dashboardPage = customerPage.navigateToDashboard();
	}

	@Test(priority=3)
	public void tc_AddLoan(){
		Loan loanPage = new Loan(getDriver());
		loanPage = dashboardPage.clickOnApplyLoan();
		loanPage.fillLoanApplyForm("Jayani (919216354V)", "Daily", "Athurugiriya", "15000", "10.5", "30");
		dashboardPage = loanPage.navigateToDashboard();
	}

	
}
