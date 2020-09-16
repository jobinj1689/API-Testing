package Practice1.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HandlingTableGrids_Test extends WebdriverSetup {

	public void HandlingTableGrid() {
		
	String url = "https://www.cricbuzz.com/live-cricket-scorecard/22779/nz-vs-ind-2nd-odi-india-tour-of-new-zealand-2020";
	WebDriver driver = WebdriverSetup.Webdriverconfig(url);

	WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
	int rowcount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	int columncount= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	int sum=0;
	for(int i=0; i<columncount-2;i++) {
		
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());;
		String value= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valuestring = Integer.parseInt(value);
		sum= sum +  valuestring;
		
		
	}
	
	
	System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Extras')]/following-sibling::div")).getText());
	String extrastext= driver.findElement(By.xpath("//div[contains(text(),'Extras')]/following-sibling::div")).getText();
	int extras = Integer.parseInt(extrastext);
	int totalscore_Sum= sum+extras;
	System.out.println("Total Score is : " + totalscore_Sum);
	
	String displayedtotal= driver.findElement(By.xpath("//div[contains(text(),'Total')]/following-sibling::div")).getText();
	int displayedtotalscore = Integer.parseInt(displayedtotal);
	
	
	Assert.assertEquals(displayedtotalscore, totalscore_Sum);
	System.out.println("Score Matches");
	
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingTableGrids_Test h = new HandlingTableGrids_Test();
		h.HandlingTableGrid();
	
	}

}
