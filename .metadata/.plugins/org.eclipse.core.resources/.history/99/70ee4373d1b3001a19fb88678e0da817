package Practice1.SeleniumMavenProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

import Utilities.ExtentReportsTest;

public class Listeners_New extends WebdriverSetup implements ITestListener {
	
	ExtentReports extent = ExtentReportsTest.Reports();
	ExtentTest test;
	//Use this code while running test in parallel lec no 214
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub		
		
		test= extent.createTest(result.getMethod().getMethodName());
		
		//Use this code while running test in parallel lec no 214
		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//Use this code while running test in parallel lec no 214
		extentTest.get().log(Status.PASS , "Test Execution Succeesfull");
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
		//Use this code while running test in parallel lec no 214
		extentTest.get().fail(result.getThrowable());
		
		//WebDriver driver = null;
		String className = result.getInstanceName();
		String testMethodName = result.getMethod().getMethodName();
		/*
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			
			//Below code takes screenshot and places in screenshot folder also paste the screenshot in extent report failed test case
			extentTest.get().addScreenCaptureFromPath(getscreenshot(className, testMethodName), result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

		extent.flush();
	}

}
