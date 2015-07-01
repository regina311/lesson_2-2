package com.example.tests;

import org.testng.annotations.Test;
import com.example.tests.TestBase;

public class ContactRemovalTests extends TestBase{

	
	//private TestBase testBase;

	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		//app.getNavigationHelper().goToContactPage();
		
		app.getContactHelper().deleteContact(1);
		
		app.getContactHelper().returnToContactListPage();

		
		
		
		
		
	}
}


