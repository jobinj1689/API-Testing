package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SwitchingFrames extends WebdriverSetup{

	@Test
	public void SwitchFrames() {
		
		String url = "https://jqueryui.com/droppable/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//or switching to frame with index
		//driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		//Drag & Drop
		a.dragAndDrop(source, target).build().perform();;
		//Switch to main content
		driver.switchTo().defaultContent();
		
	}
}
