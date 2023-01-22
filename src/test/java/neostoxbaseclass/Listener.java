package neostoxbaseclass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neostoxbaseclass.BaseNew;
import neostoxpom.UtilityNew;


public class Listener extends BaseNew implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	
	{
		Reporter.log("TC "+result.getName()+ " is failed",true);
		try {
		UtilityNew.screenshot(driver, result.getName());
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		}
	
	
	public void onTestSuccess(ITestResult result)
	{
	  Reporter.log("TC "+result.getName()+" sucess...", true);
	}
	
	
	public void onTestSkipped(ITestResult result) 
	{

     Reporter.log("TC "+result.getName()+" skipped please check", true);
	}
	

	
	
}


