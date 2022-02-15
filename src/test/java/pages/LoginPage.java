package pages;

import wrapper.ProjectSpecificWrapper;

public class LoginPage extends ProjectSpecificWrapper{
	
	
	public LoginPage enterUserName(String data) {
		clearAndType(locSelector("xpath", "//input[@id='username']"), data);
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		clearAndType(locSelector("id", "password"), data);
		return this;
	}
	
	public HomePage clickLogin() {
		click(locSelector("class", "decorativeSubmit"));
		return new HomePage();
	}

}
