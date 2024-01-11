package testNG_Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String tcName = result.getName();
		Reporter.log("TC "+tcName +" is completed successfully", true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
	
		Reporter.log("TC "+result.getName()+" is failed, check again", true);
	
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
		Reporter.log("TC "+result.getName()+" is skipped, check dependency of method", true);
		
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		
		Reporter.log("TC "+result.getName()+" excecution is started", true);
		
	}
	
	}
