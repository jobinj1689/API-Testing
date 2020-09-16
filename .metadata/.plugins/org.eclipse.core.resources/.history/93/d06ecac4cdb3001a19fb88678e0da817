package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Action extends WebdriverSetup{

	@Test
	public void Action() {
		
		String url = "https://www.amazon.com/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		
		Actions a = new Actions(driver);
		//Enter text in Capital letters and then select the entered text by doubleclick()
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		WebElement mouseMove = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//Move to a specific element
		a.moveToElement(mouseMove).build().perform();
		//Right Clickon the selected element
		a.moveToElement(mouseMove).contextClick().build().perform();
		//
		
	}
}
