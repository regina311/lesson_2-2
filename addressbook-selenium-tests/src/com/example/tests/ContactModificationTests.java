package com.example.tests;


import org.testng.annotations.Test;
import com.example.tests.ContactObject;
import com.example.tests.TestBase;



public class ContactModificationTests extends TestBase {
	
	
	

	private static final ContactObject ContactObject = null;

	@Test
	public void modifySomeContact(){
		app.getNavigationHelper().openMainPage();
		

	   
	ContactObject contactObject=  ContactObject;
	   contactObject.mobile="new mobile";
	   app.getContactHelper().modificateContact( contactObject, 1);
		app.getContactHelper().initContactModification(1);
		
		
	
		//GroupObject groupObject=new GroupObject();
		
        
		app.getContactHelper().returnToContactListPage();
	}

	
	

}
