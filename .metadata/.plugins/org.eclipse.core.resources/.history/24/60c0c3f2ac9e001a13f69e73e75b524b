package Practice1.SeleniumMavenProject;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickingOnLinks {
	
	@Test
	public void ClickonLink() throws InterruptedException {
		
		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		
		//All the links in footer section		
		WebElement entireFooterLinks = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println("Total no of links in Footer Section: " + entireFooterLinks.findElements(By.tagName("a")).size());
		
		//No of links in the first part of footer section
		WebElement firstSectionFooter = entireFooterLinks.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Total no of links in Footer Section: " + firstSectionFooter.findElements(By.tagName("a")).size());
		
		String clickonLinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for(int i=0; i< firstSectionFooter.findElements(By.tagName("a")).size(); i++) {
			
			firstSectionFooter.findElements(By.tagName("a")).get(i).sendKeys(clickonLinks);		
		}
		Thread.sleep(25000);
		
		Set<String> totalWindows= driver.getWindowHandles();
		java.util.Iterator<String> it =  totalWindows.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());	
			System.out.println("The title of page is : " + driver.getTitle());
		}
	}

}