package Practice1.SeleniumMavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot_handlingcookies {
	
	public void TakeScreenshot() throws IOException {
		
		String url = "http://google.com";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);

		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://Selenium_Maven_Projects/Screenshot.png"));
	
	}
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		TakingScreenshot_handlingcookies s = new TakingScreenshot_handlingcookies();
		s.TakeScreenshot();
	}

}
