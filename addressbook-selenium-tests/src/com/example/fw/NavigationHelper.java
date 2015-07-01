package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public  void openMainPage() {
		
	  manager.driver.get("http://localhost/addressbookv4.1.4/");
	}

	public void goToGroupListPage() {
		click(By.linkText("groups"));
	    
	}

	public void goToContactPage() {
     click(By.linkText("add new"));
	   
	}
	public void initGroupCreation() {
	click(By.name("new"));
		// TODO Auto-generated method stub
		
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		// TODO Auto-generated method stub
		
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]']["+ index+"]"));
	}

	
	

}
