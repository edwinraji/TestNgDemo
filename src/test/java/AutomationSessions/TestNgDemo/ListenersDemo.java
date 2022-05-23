package AutomationSessions.TestNgDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
System.out.println("Test_Started");		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		System.out.println("Test_Passed");				
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		System.out.println("Test_Failed");				
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		System.out.println("Test_Result");				
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName());
		System.out.println("onTestFailedButWithinSuccessPercentage");		
		
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName());
		System.out.println("ITestContext");			
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName());
		// TODO Auto-generated method stub
		
	}

	
}
