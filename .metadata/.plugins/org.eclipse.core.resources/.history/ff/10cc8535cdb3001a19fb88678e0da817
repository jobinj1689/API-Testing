package Practice1.SeleniumMavenProject;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebdriverSetup {

	static WebDriver driver;
	public static  WebDriver Webdriverconfig(String Url) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //IMPLICIT WAIT

		return driver;
		
	}
	
	public void RahulShettyAlert() {
		
		String  text = "Jobin";
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);	
	}

	
	public static String getscreenshot(String classname, String testname) throws IOException {
		
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyy HHmmss");
		Date date = new Date();
		String current_Date = dateFormat.format(date); 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\Screenshot\\"+classname+"_"+testname+ "_" +current_Date+".png"; 
		FileUtils.copyFile(source, new File (destination));
		return destination;
	}

	
	@BeforeMethod
	public void BeforeTestExecution() {
	
		System.out.println("*******Execution of Programs started*********");
	
	}
	
	@AfterMethod
	public void AfterTestExecution() {
	
		System.out.println("*******Test Execution of Programs has completed*********");
		driver.close();
	}
	
	
}
