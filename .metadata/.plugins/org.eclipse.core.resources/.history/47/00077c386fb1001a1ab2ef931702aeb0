package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Facebook {

	@Test
	public void Login() {
		// WebdriverSetup ws= new WebdriverSetup();

		String url = "https://www.facebook.com/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);

		// driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");;
		// driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Test");;
		// driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Test");;
		driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("Test");
		;
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test");
		;
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		;
	}

}
