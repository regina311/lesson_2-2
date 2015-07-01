package com.example.tests;






public class ContactCreationTests extends TestBase  {
 
	@org.testng.annotations.Test
  public void testValidGroupCanBeCreated() throws Exception {
	  ContactObject validContact = new ContactObject("fdd", "4468", "454564564", "4546", "454646", "45456561", "fhgfd", "fdgfdfvdvfd", "1", "January", "4545", "gyfg", "hfuhdihdf", "fghdgfdgfd");
	  app.getContactHelper().createContact(app, this, validContact);
  }
  @org.testng.annotations.Test
  public void testContactWithEmptyDataCanBeCreated() throws Exception {
	  ContactObject emptyContact = new ContactObject("", "", "", "", "", "", "", "", "-", "-", "", "", "", "");
	  app.getContactHelper().createContact(app, this, emptyContact);
  }
}
