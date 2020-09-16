package Practice1.SeleniumMavenProject;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;

import PageObject.GreenKartObjects;
import Utilities.ExtentReportsTest;

@Listeners(Listeners_New.class)
public class RahulShettyGreenKart {
	
	public static Logger log = LogManager.getLogger(RahulShettyGreenKart.class.getName());
	
	@Test
	public void GreenKart() throws IOException {
	
		
		//ExtentReportsTest.Reports();
		
		int j=0;
		String[] productneeded = {"Cucumber", "Brocolli", "Carrot", "Tomato"};
		
		String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
		WebDriver driver = WebdriverSetup.Webdriverconfig(url);
		GreenKartObjects GkPageObject = new GreenKartObjects(driver);
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".//src/main/resources/data.properties");
		prop.load(fis);
				
		
		//Using page object instead of this
		//List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	    
		System.out.println("No of productrs on page: " + GkPageObject.products.size());
		
		for (int i=0; i< GkPageObject.products.size(); i++)
		{
			String[] productname = GkPageObject.products.get(i).getText().split("-");
			String formattedName = productname[0].trim();
			System.out.println(formattedName);
			
			List productNeededList = Arrays.asList(productneeded);
			if(productNeededList.contains(formattedName))
			{
				j++;
				//driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				GkPageObject.productAddtoCart().get(i).click();
				
				log.info("Item Clicked");
				
				//log.error("Testinnngg");
			}
			
			if(j== productneeded.length) 
			{
				break;
			}
		}	
		
		Assert.assertEquals(false, true);
		
		// Using Page Factory objects
		GkPageObject.cart().click();
		GkPageObject.proceedToCheckout().click();
		log.info("Applying Promo Code");
		GkPageObject.promoCode().sendKeys(prop.getProperty("promoCode"));
		GkPageObject.applyPromo().click();
		System.out.println(GkPageObject.promoInfo().getText());
		
		GkPageObject.placeOrder().click();
		
		Select s = new Select(GkPageObject.selectCountry());
		s.selectByVisibleText("India");
		
		GkPageObject.checkAgree().click();
		GkPageObject.proceed().click();
		
		//ExtentReportsTest.ReportsFlush();
		
		
		/* -- OLD Code in normal way
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();;
		
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		WebElement selectCountry =  driver.findElement(By.xpath("//label[contains(text(),'Choose Country')]/parent::div/div/select"));
		Select s = new Select(selectCountry);
		s.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
	
		*/
	}
	
	
	
}
