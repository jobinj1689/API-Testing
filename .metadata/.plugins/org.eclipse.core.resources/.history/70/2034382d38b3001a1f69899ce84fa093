package Practice1.SeleniumMavenProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SortingTabledata extends WebdriverSetup{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String url = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
	WebDriver driver = WebdriverSetup.Webdriverconfig(url);

	List<WebElement> firstcollist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));	

	System.out.println("================ Original List =============");
	ArrayList<String> orginallist = new ArrayList<String>();
	for(int i=0;i< firstcollist.size();i++) {
		orginallist.add(firstcollist.get(i).getText());
	}

	for(String s: orginallist) {
		
		System.out.println(s);
	}
	
	
	System.out.println("=============== Sorted List ================");
	ArrayList<String> copiedlist = new ArrayList<String>();
	for(int i=0; i<orginallist.size();i++) {
		copiedlist.add(orginallist.get(i));
	}
	
	Collections.sort(copiedlist);
	Collections.reverse(copiedlist);
	
	for(String s: copiedlist) {
		System.out.println(s);
	}
	
	Assert.assertTrue(orginallist.equals(copiedlist));
	
	}

}
