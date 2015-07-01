package com.example.tests;

import org.testng.annotations.Test;

//import org.testng.annotations.TestInstance;




public class GroupCreationTests extends TestBase {
 
	@Test 
  public void testValidGr() throws Exception {
	  GroupObject emptyDataGroup = new GroupObject("gyfg", "gdbvg", "vvdv");
	  app.getGroupHelper().createGroup(emptyDataGroup);
	  emptyDataGroup.name="new name";
    //validate
  }
  
  @Test
  public void testGroupWithEmptyDataCanBeCreated() throws Exception {
	  GroupObject validGroup = new GroupObject("", "", "");
	  app.getGroupHelper().createGroup(validGroup);
	  //validate
    
  }
}
