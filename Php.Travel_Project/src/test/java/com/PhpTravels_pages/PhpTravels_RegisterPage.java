package com.PhpTravels_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Base.BasePage;

public class PhpTravels_RegisterPage extends BasePage {

	public PhpTravels_RegisterPage waitUntilPageloudComplete() {

		myRepository.fluentWait(By.cssSelector("#frmCheckout > p > input"));

		return this;
	}

	public void register() {
		try {
			myRepository.enterTextField(By.id("inputFirstName"), "Mike");
			myRepository.enterTextField(By.id("inputLastName"), "Jason");
			myRepository.enterTextField(By.id("inputEmail"), "mike.jason@gmail.com");
			myRepository.actionClass(driver.findElement(By.cssSelector("[tabindex] > div:nth-of-type(2)")),Keys.ARROW_DOWN);
			myRepository.enterTextField(By.id("inputPhone"), "568263892");
			myRepository.enterTextField(By.id("inputCompanyName"), "5463 ghadf ford");
			myRepository.enterTextField(By.id("inputAddress1"), "5972 Shently ct 230");
			myRepository.enterTextField(By.id("inputCity"), "Wardak");
			myRepository.enterTextField(By.id("stateinput"), "Maidan");
			myRepository.enterTextField(By.id("inputPostcode"), "34568");
			myRepository.selectDropDownVisibleText(By.id("inputCountry"), "Brazil");
			myRepository.selectDropDownVisibleText(By.id("customfield1"), "Google");
			myRepository.enterTextField(By.id("customfield2"), "456784323");
			myRepository.enterTextField(By.id("inputNewPassword1"), "Afghan");
			myRepository.enterTextField(By.id("inputNewPassword2"), "Afghan");
			myRepository.clickButton(By.cssSelector("#frmCheckout > div.marketing-email-optin > div > div > span.bootstrap-switch-label"));
			myRepository.enterTextField(By.id("inputCaptcha"), "23456");
			myRepository.enterTextField(By.id("inputCaptcha"), "MKVSA");
			Thread.sleep(3 * 1000);
			myRepository.clickButton(By.cssSelector("#frmCheckout > p > input"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
