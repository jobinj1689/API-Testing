package Practice1.SeleniumMavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SwitchingWindows extends WebdriverSetup{

	@Test
	public void SwitchWindow() {

		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);

		System.out.println("Parent Page Title is: " +driver.getTitle());
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentId = it.next();
		System.out.println("Parent Id is: " + parentId);

		String childId = it.next();
		System.out.println("Child Id is: " + childId);

		driver.switchTo().window(childId);
		System.out.println("Child Page Title is : " + driver.getTitle());

		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();

		
		
	}

}
