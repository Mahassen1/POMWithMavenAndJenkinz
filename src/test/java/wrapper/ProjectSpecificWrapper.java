package wrapper;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;

public class ProjectSpecificWrapper extends GenericWrapper{
	
	public String dataSheet;
	
	@BeforeMethod
	public void login() {
		invokeBrowser("chrome", "http://iarchtaps.com:8080/opentaps/control/main");
	}
	
	@AfterMethod
	public void closeApp() {
		close();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		DataInputProvider dp = new DataInputProvider();
		String[][] data = dp.readExcel(dataSheet);
		return data;
	}
	
	
}
