package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handling_AutoSuggetive_Dropdown extends WebdriverSetup {

	public void AutoSuggetive_Dropdown() {
		
		String url = "https://ksrtc.in/oprs-web/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("Ben");
		
		
		//String fromplace =  driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText().trim();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String qry = "return document.getElementById(\"fromPlaceName\").value;";
		String fromplace = (String) jse.executeScript(qry); 
		
		System.out.println(fromplace);
		
		while(!fromplace.equals("BENGALURU INTERNATION AIRPORT")) {
			
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);	
			fromplace = (String) jse.executeScript(qry);
			System.out.println(fromplace);
		}
		
		if(fromplace.equals("BENGALURU INTERNATION AIRPORT")) {
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ENTER);
			
		}	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Handling_AutoSuggetive_Dropdown d = new Handling_AutoSuggetive_Dropdown();
		d.AutoSuggetive_Dropdown();
		

	}

}
