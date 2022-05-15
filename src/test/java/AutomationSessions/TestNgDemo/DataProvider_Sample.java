package AutomationSessions.TestNgDemo;

import org.testng.annotations.Test;

public class DataProvider_Sample {
  @Test (dataProvider = "data-provider-name", dataProviderClass = DataProvide_getdata.class)
  public void firstTestcase(String name, String Pwd) {
	  System.out.println(name);
	  System.out.println(Pwd);
  }
}
