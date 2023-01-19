package Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class C {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shingsss\\Downloads\\Firefox Setup 107.0\\Firefox Setup 107.0.exe");
	WebDriver Somesh = new FirefoxDriver() ;
	Somesh.get ("https://mahatenders.gov.in/nicgep/app");
		
		
	}

}
