package com.example.tests;


import org.testng.annotations.Test;
import com.example.tests.GroupObject;
import com.example.tests.TestBase;



public class GroupModificationTests extends TestBase {
	
	
	

	@Test
	public void modifySomeGroup(GroupObject groupObject){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().goToGroupListPage();

	app.getGroupHelper().deleteGroup(1);
		app.getNavigationHelper().initGroupModification(1);
		
		groupObject.name="new name";
	
		//GroupObject groupObject=new GroupObject();
		
app.getGroupHelper().fillGroupForm(groupObject);


		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().returnToGroupListPage();
	}

	
	

}
