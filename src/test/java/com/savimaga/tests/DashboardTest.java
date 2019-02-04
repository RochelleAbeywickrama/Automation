package com.savimaga.tests;

import org.testng.annotations.Test;

import com.savimaga.base.BaseTest;
import com.savimaga.pageObjects.Login;
import com.savimaga.pageObjects.Customer;
import com.savimaga.pageObjects.Dashboard;

public class DashboardTest extends BaseTest{

	public String environment;
	public Login loginPage = null;
	public Dashboard dashboardPage = null;
	public Customer customerPage = null;
	
	
	@Test
	public void tc_LoginToWebPortal(){
		try {
			Login loginPage = new Login(getDriver());
			dashboardPage = loginPage.LoginToWeb("Admin", "123");
			Thread.sleep(5000);
			dashboardPage.clickOnDashboard();
			Thread.sleep(2000);
			customerPage = dashboardPage.clickOnNewCustomer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
}
