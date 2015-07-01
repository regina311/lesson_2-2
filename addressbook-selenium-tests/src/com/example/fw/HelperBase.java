package com.example.fw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.example.tests.TestBase;

public abstract class HelperBase {
	public  boolean acceptNextAlert = true;
	protected ApplicationManager manager;
	protected WebDriver driver;
	        
		public HelperBase(ApplicationManager manager){
			this.manager = manager;
			this.driver=manager.driver;
	
	}
		public String closeAlertAndGetItsText(TestBase testBase) {
		    try {
		      Alert alert =driver.switchTo().alert();
		   
		     if (acceptNextAlert) {
		    	 alert.accept();
		     }
		     else {
		        alert.dismiss();
		      }
		      return alert.getText();
		    } finally {
		    	acceptNextAlert = true;
		    }
		  }
		public boolean isElementPresent(By by) {
		    try {
		    	driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }


		public boolean isAlertPresent() {
		    try {
		    	driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }
		protected void click(By locator) {
			driver.findElement(locator).click();
		}

}
