package com.ecom.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadAmazonHomePage {

	public static void main(String[] args) {
		//step 1. create a url 
		final String siteUrl = "https://www.amazon.in";
		
		//step 2. set properties ( set selenium webdriver path & class)
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HOME\\Desktop\\Siimplilearn\\AmazonTests\\driver\\geckodriver.exe");
		//step 3. instantiate web driver object -> open page
		WebDriver driver = new FirefoxDriver();		
		driver.get(siteUrl);
		
		System.out.println(driver.getTitle());		
		
		//step 5. verify test
		String expectedTitle = "Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(expectedTitle.equals(driver.getTitle())) {
			System.out.println("Test is Passed");
		} else {
			System.out.print("Test is Failed");
		}
		
		//step 6. close browser.
		
//		driver.close();

	}

}
