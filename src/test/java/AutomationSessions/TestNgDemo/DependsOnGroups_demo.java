package AutomationSessions.TestNgDemo;

import org.testng.annotations.Test;

public class DependsOnGroups_demo {

	@Test(groups = { "logout" }, dependsOnGroups = "sign")

	public void logOut() {
		System.out.println("Logout the site");
	}

	@Test
	public void openBrowser() {
		System.out.println("open the browser");
	}

	@Test(groups = { "sign" })

	public void Signin() {
		System.out.println("Login to the site");

	}
	@Test
	public void AA() {
		System.out.println("AA method");

	}
	@Test
	public void AB() {
		System.out.println("AB Method");

	}
	@Test
	public void AC() {
		System.out.println("AC Method");

	}

}
