package com.PhpTravels_pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Base.BasePage;

public class PhpTravels_HomePage extends BasePage {

	
	@Test (groups = "regrassion_Test")
	public PhpTravels_HomePage main_page() {
		try {
			driver.get("https://phptravels.com/");
			driver.getWindowHandles().clear();
			String webTitle = driver.getTitle();
			System.out.println("This is the web Page Title: \t" + webTitle);
			assertEquals(webTitle,
					"PHPTRAVELS | php booking script for hotels airline flights tours cars online application");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public PhpTravels_HomePage demo_page() {

		try {
			myRepository.enterTextField(By.cssSelector(".user-login:nth-of-type(1) [class='lvl-1']"));
			driver.getWindowHandles().clear();
			myRepository.enterTextField(By.cssSelector("#main-menu > ul > li:nth-child(8) > a > span"));
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		return this;
	}

	public PhpTravels_HomePage company_Affiliation() {
		
		

		Actions action = new Actions(driver);
		WebElement company = driver.findElement(By.cssSelector("#main-menu > ul > li:nth-child(7) > span > span"));
		WebElement afilate = driver.findElement(By.partialLinkText("Affiliate"));
		action.moveToElement(company).click(afilate).build().perform();

		return this;
	}

	public void logIn_page() {
		try {
			myRepository.enterTextField(By.cssSelector("#main-menu > ul > li:nth-child(8) > a > span")); // pass 
			Thread.sleep(2 * 1000);
			myRepository.windowHandle();
			myRepository.enterTextField(By.partialLinkText("Register"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
		try {
			
			
			
			myRepository.windowHandle();
			myRepository.enterTextField(By.partialLinkText("Register"));
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
			
			
			
		}

	}

}
