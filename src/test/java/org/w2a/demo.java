package org.w2a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	
	public static void main(String[] args) {
		

		System.setProperty("wedriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-Way2Automation\\MyMavenproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	}
}
