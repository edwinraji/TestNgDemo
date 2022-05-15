package AutomationSessions.TestNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority_demo {
 
	
	@BeforeSuite()

	public void beforeSuite() {
		System.out.println("Before annotation will be run only once before all tests in suite have run ");
	}


	@BeforeTest()
	public void beforeTest() {
		System.out.println("BeforeTest annoation will be executed before first @Test annotateed method");
	}

	@BeforeClass()
	public void beforeClass() {

		System.out.println("BeforeClass annotation will be executed before first @test  method execution and it runs only once per class");
	}

	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@Test(priority=3)

	public void test1() {

		System.out.println("Testing first time M3");

	}

	@Test(priority=2)
	public void test2() {
		System.out.println("Testing second time M1");
	}
   
	@Test(priority=2)
	public void Atest3() {
		System.out.println("Testing third time M2");
	}

	@AfterMethod()
	public void afterMethod() {
		System.out.println("After method");
	}

	@AfterClass()

	public void afterClass() {

		System.out.println("AfterClass annotation will be executed after all the test methods in the current class have been run");

	}

	@AfterTest()
	public void afterTest() {
		System.out.println("AfterTest annoation will be executed when all @test annoated methods complete the execution of those classes which are inside <test> tag in testng.xml file.");
	}

	@AfterSuite()

	public void afterSuite() {

		System.out.println("Aftersuite annotation will run once after execution of all tests in the suite have run");
	}

	
}
