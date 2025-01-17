package seleniumpractices;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImpl implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started");
		Reporter.log("Test case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success");
		Reporter.log("Test case success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
		Reporter.log("Test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
