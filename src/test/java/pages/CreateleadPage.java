package pages;

import wrapper.ProjectSpecificWrapper;

public class CreateleadPage extends ProjectSpecificWrapper{
	
	public CreateleadPage enterFirstName(String data)  {
		clearAndType(locSelector("xpath", "//input[@id='createLeadForm_firstName']"), data);
		return this;
	
	}
	public CreateleadPage enterLastName(String data)  {
		clearAndType(locSelector("xpath", "//input[@id='createLeadForm_lastName']"), data);
		return this;
	
	}
	public CreateleadPage enterCampanyName(String data)  {
		clearAndType(locSelector("xpath", "//input[@id='createLeadForm_companyName']"), data);
		return this;
	
	}
	public ViewleadPage clickCreateLead()  {
		click(locSelector("xpath", "//input[@name='submitButton']"));
		return new ViewleadPage();
	
	}
}
