package com.PhpTravels_Test;

import org.testng.annotations.Test;

import com.Base.BasePage;
import com.PhpTravels_pages.PhpTravels_HomePage;
import com.PhpTravels_pages.PhpTravels_RegisterPage;

public class Test_page extends BasePage {

	PhpTravels_HomePage loginPages = new PhpTravels_HomePage();

	PhpTravels_RegisterPage register = new PhpTravels_RegisterPage();

	@Test  (priority =0, groups={"Smoke_Test", "regrassion_Test"})
	public void testing_PhPTravels() {
		try {
			loginPages.main_page();
			loginPages.demo_page();
			loginPages.company_Affiliation();
			loginPages.logIn_page();
			register.waitUntilPageloudComplete();
			register.register();
			

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/*@Test (priority = 1, dependsOnGroups ="Smoke_Test")
	public void registerPage() {
		register.waitUntilPageloudComplete();
		register.register();

	}*/

}