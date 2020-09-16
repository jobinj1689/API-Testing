package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SpiceJet extends WebdriverSetup{

	@Test
	public void Dropdown_Selection() {

		String url = "https://www.spicejet.com/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);

		// Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divpaxinfo']")));

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();

		// driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		// Above Code Using Parent Child relationship

		// driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']")).click();;
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']"))
				.click();

		// Selecting the date
		// If there is a space in between the class name then remove the space and put
		// "."
		// Selects the current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// Selecting Checkbox
		WebElement friendsandfamilyChxbox = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
		System.out.println("CheckBox is selected:  " + friendsandfamilyChxbox.isSelected());
		friendsandfamilyChxbox.click();
		System.out.println("Now is CheckBox selected:  " + friendsandfamilyChxbox.isSelected());
		System.out.println(
				"Number of CheckBox on Page:  " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Checking if return trip dropdown is enabled

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Is return date dropdown enabled: False");
			// Selecting round trip radio button
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();

		}
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Is return date dropdown enabled: True");

		}

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")));
		s.selectByIndex(1);
		s.selectByVisibleText("4");
		s.selectByValue("9");

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();

	}

}
