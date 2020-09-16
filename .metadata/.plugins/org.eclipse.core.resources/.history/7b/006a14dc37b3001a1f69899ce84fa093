package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertHandling extends WebdriverSetup {

	@Test
	public void AlertTest() {

		String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		WebdriverSetup W = new WebdriverSetup();

		W.RahulShettyAlert();
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		;

		W.RahulShettyAlert();
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
