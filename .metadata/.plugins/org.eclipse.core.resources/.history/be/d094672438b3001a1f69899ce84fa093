package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MakeMyTrip extends WebdriverSetup{

	@Test
	public void Auto_Suggestive_Dropdown() {
		String url = "https://www.makemytrip.com/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		WebElement fromcity = driver.findElement(By.xpath("//input[@id='fromCity']"));
		// fromcity.clear();

		System.out.println("From City is : " + fromcity.getAttribute("value"));
		fromcity.click();
		;

		// If there are spaces in between the class name then remmove the space and put
		// "." eg:
		WebElement FromCityTextEntry = driver.findElement(By.xpath(
				"//*[@id='root'] //input[contains(@class, 'react-autosuggest__input') and contains(@class, 'react-autosuggest__input--open')]"));
		FromCityTextEntry.click();
		FromCityTextEntry.sendKeys("Mum");
		// Thread.sleep(5000);

		// *[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input

		// *[@id="root"] //input

		for (int i = 0; i < 1; i++) {

			FromCityTextEntry.sendKeys(Keys.ARROW_DOWN);
		}
		FromCityTextEntry.sendKeys(Keys.ENTER);


	}

}
