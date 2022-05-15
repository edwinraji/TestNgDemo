package AutomationSessions.TestNgDemo;

import org.testng.annotations.DataProvider;

public class DataProvide_getdata {
 
	@DataProvider (name = "data-provider-name")
	public Object[][] dpMethod() {
	    return new Object [][] { {"Edwin","edwinraj@mail.com"}};
	}
}
