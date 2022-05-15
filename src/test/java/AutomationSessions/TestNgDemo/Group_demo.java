package AutomationSessions.TestNgDemo;

import org.testng.annotations.Test;

public class Group_demo {
 
	@Test(groups= {"logout"})

	public void logOut() {
		System.out.println("Logout the site");
	}
	@Test
	public void openBrowser() {
		System.out.println("open the browser");
	}

	@Test(groups= {"sign"})

	public void signIn() {
		System.out.println("Login to the site");
    }

	
}
