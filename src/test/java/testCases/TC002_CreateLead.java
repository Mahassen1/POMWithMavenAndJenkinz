package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyhomePage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testCaseDec = "Create a new Lead in Opentaps";
		author = "Mahassend";
		category = "Sanity";
		device = "Window";
		dataSheet = "TC002";
	}
	
	@Test (dataProvider = "fetchData")
	public void createLead(String uname, String pwd) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)	
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName("test")
		.enterLastName("test2")
		.enterCampanyName("test3")
		.clickCreateLead();
		
		
		
	}

}
