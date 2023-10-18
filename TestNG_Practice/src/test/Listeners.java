package test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;


public class Listeners implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("YYYYYYEEEESSSSSSS");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("NNNNNNNOOOOOOOO"+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
}
