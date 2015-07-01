package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.GroupObject;



public class GroupHelper extends HelperBase{
	
	
	
	
	public GroupHelper(ApplicationManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public void initGroupCreation() {
		
		driver.findElement(By.name("new")).click(); 
	}

	public void fillGroupForm( GroupObject groupObject) {
		manager.type("group_name", groupObject.name);
		manager.type("group_header", groupObject.header);
		manager.type("group_footer", groupObject.footer);
	    
	}
	public void type(String locator, String name) {
		if (name!=null) {
			driver.findElement(By.name(locator)).clear();
			  driver.findElement(By.name(locator)).sendKeys(name);
		}
		
		}


	public void submitGroupCreation() {
		driver.findElement(By.name("submit")).click();
	   
	}

	public void returnToGroupListPage() {
		driver.findElement(By.linkText("group page")).click();
	   
	    
	}

	public void createGroup( GroupObject groupObject) {
		
		manager.getNavigationHelper().openMainPage();
		manager.getNavigationHelper().goToGroupListPage();
	manager.getNavigationHelper().initGroupCreation();
	fillGroupForm( groupObject);
		submitGroupCreation();
		returnToGroupListPage();
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		
		// TODO Auto-generated method stub
		
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]']["+ index+"]"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
		// TODO Auto-generated method stub
		
	}
}
