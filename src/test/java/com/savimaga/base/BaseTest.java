package com.savimaga.base;

import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.ChromeDriverManager;


public class BaseTest{

	private WebDriver driver;
	protected GetPropertyValues getPropertyValues = null;
	public static TreeMap<String, String> modTestData = null;
	public ConfigFileReader configFileReader;
	
    @BeforeSuite
    public void beforeSuite() {
    	
    	configFileReader = new ConfigFileReader();
        System.setProperty("headless", configFileReader.getHeadlessStatus()); // You can set this property elsewhere
        String headless = System.getProperty("headless");

        ChromeDriverManager.chromedriver();
        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
       
        String URL = configFileReader.getApplicationUrl();
        driver.get(URL);
		driver.manage().window().maximize();
    }

    @BeforeMethod
	public void setProperty() {
    	getPropertyValues = new GetPropertyValues();
    	String property_path = "/applicationData.properties";
		try {
			modTestData = getPropertyValues.getResourceData(property_path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    
    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
	  
}
