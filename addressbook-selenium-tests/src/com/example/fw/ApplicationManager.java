package com.example.fw;




import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ApplicationManager {
	public NavigationHelper navigationHelper;
	public WebDriver driver;
	public String baseUrl;

	public  StringBuffer verificationErrors = new StringBuffer();
	private GroupHelper groupHelper;
	private ContactHelper contactHelper;
	


	public ApplicationManager(){
         driver = new FirefoxDriver();
		  //  baseUrl = "http://localhost/";
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
        
         contactHelper= new ContactHelper(this);
         
		
	}
	
	public void stop() {
		 driver.quit();
		    
		  }
	public  NavigationHelper getNavigationHelper(){
		if (navigationHelper==null) {
			navigationHelper=new NavigationHelper(this);
		}
		return navigationHelper;
	}
		

	public ContactHelper getContactHelper(){
		if (contactHelper==null) {
			contactHelper=new ContactHelper(this);
		}
		return contactHelper;
	}
	public GroupHelper getGroupHelper(){
		if (groupHelper==null) {
			groupHelper=new GroupHelper(this);
		}
		return groupHelper;
	}
		

		

	
	
	
	
	
	

	public void type(String locator, String name) {
	driver.findElement(By.name(locator)).clear();
	  driver.findElement(By.name(locator)).sendKeys(name);
	}


	public void select(String locator, String bday) {
		new Select(driver.findElement(By.name(locator))).selectByVisibleText(bday);
	}


	

	}
	