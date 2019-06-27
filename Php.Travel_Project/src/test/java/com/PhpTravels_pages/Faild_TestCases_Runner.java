package com.PhpTravels_pages;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Faild_TestCases_Runner {
	
	public static void main(String[] args) {
		
		/**
		 * How to execute the failure Test Cases in TestNG
		 * @param args
		 * Why test fails 
		 * Application down
		 * server down 
		 * Network issue
		 * Screption issue ( maybe locator is changed or there is some updates)
		 * Application issue (when you excuteing our test some validation fails it is rael issue, then report as bug)
		 */
		
		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\aboba\\eclipse-workspace\\jQuery_Project\\Php.Travel_Project\\test-output\\Default suite\\testng-failed.xml");
		
		
		runner.setTestSuites(list);
		runner.run();
		
		
		
	}

}
