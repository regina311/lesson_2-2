package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactObject;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public void fillContactForm(ApplicationManager applicationManager, TestBase testBase, ContactObject contactObject) {
		testBase.app.type("firstname", contactObject.firstname);
	    testBase.app.type("lastname", contactObject.lastname);
	    testBase.app.type("address", contactObject.address);
	    testBase.app.type("home", contactObject.home);
	    testBase.app.type("mobile", contactObject.mobile);
	    testBase.app.type("work", contactObject.work);
	    testBase.app.type("email", contactObject.email);
	    testBase.app.type("email2", contactObject.email2);
	    testBase.app.select("bday", contactObject.bday);
	    testBase.app.select("bmonth", contactObject.bmonth);
	    testBase.app.type("byear", contactObject.byear);
	    testBase.app.select("new_group", contactObject.group);
	    testBase.app.type("address2", contactObject.address2);
	    testBase.app.type("phone2", contactObject.phone2);
	}

	public void returnToContactListPage() {
		click(By.linkText("home page"));
	    
	}

	public void submitContactCreation() {
           click(By.name("submit"));
	   
	}
	public void deleteContact(int index) {
		selectContactByIndex(index);
		click(By.xpath("(//input[@name='update'])[2]"));
		
		// TODO Auto-generated method stub
		
	}
	
	
	private void selectContactByIndex(int index) {
		click(By.xpath("(//img[@alt='Edit'])[12]"));
	}


	public void createContact(ApplicationManager applicationManager, TestBase testBase, ContactObject contactObject) {
		applicationManager.getNavigationHelper().openMainPage();
	    applicationManager.getNavigationHelper().goToContactPage();
	    
		fillContactForm(applicationManager, testBase, contactObject);
	    submitContactCreation();
	    returnToContactListPage();
	}

	public void modificateContact( ContactObject contactObject, int index) {
		// TODO Auto-generated method stub
		selectContactByIndex(index);
		manager.type("mobile123",contactObject.mobile);
		click(By.xpath("(//input[@name='update'])[1]"));
		
	}

	public void initContactModification(int i) {
		click(By.name("home page"));
		// TODO Auto-generated method stub
		
	}

	
	
}
