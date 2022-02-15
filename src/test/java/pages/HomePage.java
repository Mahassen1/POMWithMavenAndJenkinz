package pages;

import wrapper.ProjectSpecificWrapper;

public class HomePage extends ProjectSpecificWrapper{
	
	public LoginPage clickLogOut() {
		click(locSelector("class", "decorativeSubmit"));
		return new LoginPage();
	}
	public MyhomePage clickCrmSfa() {
		click(locSelector("link", "CRM/SFA"));
		return new MyhomePage();
	}
	
		

}
