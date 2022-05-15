package AutomationSessions.TestNgDemo;

import org.testng.annotations.Test;

public class DependsOnMethod {
  
	@Test(dependsOnMethods= {"signIn"})

	public void logOut() {
		System.out.println("Logout the site");
	}
	@Test
	public void openBrowser() {
		System.out.println("open the browser");
	}

	@Test(dependsOnMethods= {"openBrowser"})

	public void signIn() {
		System.out.println("Login to the site");
	}


	
	
}
