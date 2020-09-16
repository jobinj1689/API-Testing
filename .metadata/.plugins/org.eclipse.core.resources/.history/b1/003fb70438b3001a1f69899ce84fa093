package Practice1.SeleniumMavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingCalendar_Test extends WebdriverSetup {
	
	
	public void HandlingCalendar() {
			
		String url = "https://www.path2usa.com/travel-companions/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		
		//driver.findElement(By.xpath("//input[@id = 'travel_from']")).sendKeys(keysToSend);
		
				
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		WebElement months = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		
		System.out.println("Month & Year " +months.getText());
		
		while(months.getText().contains("2022") )
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();;
		}
		
		
		
		while(!months.getText().contains("August"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();;
		}

		
		List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));	
		
		int count = driver.findElements(By.xpath("//td[@class='day']")).size();
		
		for(int i=0; i< count; i++)
		{
			String returneddate = driver.findElements(By.className("day")).get(i).getText();
			
			if(returneddate.equalsIgnoreCase("28"))
			{
				days.get(i).click();
				break;
			}
			
		}
		
	
	}
	
	public static void main(String[] args) {
		
		HandlingCalendar_Test T = new HandlingCalendar_Test();
		T.HandlingCalendar();
		
	}
}
	