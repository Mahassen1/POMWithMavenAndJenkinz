package pages;

import wrapper.ProjectSpecificWrapper;

public class MyhomePage extends ProjectSpecificWrapper{
	
	public MyleadPage clickLeads() {
		click(locSelector("link", "Leads"));
		return new MyleadPage();
	}

}
