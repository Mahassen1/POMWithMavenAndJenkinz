package pages;

import wrapper.ProjectSpecificWrapper;

public class MyleadPage extends ProjectSpecificWrapper{
	
	public CreateleadPage clickCreateLead() {
		click(locSelector("link", "Create Lead"));
		return new CreateleadPage();
	}
	
	
	//public void clickFindLead() {
	//	click(locSelector("linkText", "Create Lead"));
	//	return 
	//}

	//public void clickLead() {
	//	click(locSelector("linkText", "Create Lead"));
	//	return 
	//}
}
