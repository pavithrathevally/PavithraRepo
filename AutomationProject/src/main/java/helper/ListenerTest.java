package helper;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener
{
	@Override
	public void onFinish(ITestContext Result) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext Result)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("The name of the test case failed is : " + Result.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult Result)
	{
		System.out.println("The name of the testcase skipped is : " +Result.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult Result) 
	{
		System.out.println(Result.getName()+ " test case started ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) 
	{
		System.out.println("The name of the testcase passed is : " +Result.getName());
		// TODO Auto-generated method stub
		
	}
	}
