package org.w2a;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunClass extends BaseClass {

	public	WebDriver d = getdriver();
	public pojoclass p = new pojoclass();

	@BeforeClass
	private void lunchbowser() throws IOException {
		// TODO Auto-generated method stub
		getdriver();
		maxwindw();
		url(dataread(1, 0));
	}
	
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		String text = d.findElement(By.xpath("//strong[text()='XYZ Bank']")).getText();
		Assert.assertEquals(text, "XYZ Bank");
		System.out.println(text);
		
	}
	
	@AfterClass
	private void quit() {
		// TODO Auto-generated method stub
		d.quit();
	}
}
