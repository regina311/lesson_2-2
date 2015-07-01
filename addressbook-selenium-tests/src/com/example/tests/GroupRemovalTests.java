package com.example.tests;

import org.testng.annotations.Test;
import com.example.tests.TestBase;

public class GroupRemovalTests extends TestBase{

	
	//private TestBase testBase;

	@Test
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().goToGroupListPage();
		
		app.getGroupHelper().deleteGroup(1);
		
		app.getGroupHelper().returnToGroupListPage();

		
		
		
		
		
	}












}
