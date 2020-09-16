package Utilities;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReportsTest {

	static ExtentReports extent;
	
	public static void Reports(String testname) {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("GreenKart Execution Report");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "JOJO");
		
		extent.createTest(testname);
		
	}
	
	public static void ReportsFlush() {
		
		extent.flush();
	}
	
	
	
}
