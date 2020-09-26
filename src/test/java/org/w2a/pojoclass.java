package org.w2a;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass extends BaseClass {
	
	public pojoclass() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);}
		
		@FindBy(className="btn btn-primary btn-lg")
		private WebElement Bankmanger;
		
		public WebElement getBankmanger() {
			return Bankmanger;
		}

		public void setBankmanger(WebElement bankmanger) {
			Bankmanger = bankmanger;
		}

		public WebElement getAdcustomer() {
			return Adcustomer;
		}

		public void setAdcustomer(WebElement adcustomer) {
			Adcustomer = adcustomer;
		}

		public WebElement getFname() {
			return Fname;
		}

		public void setFname(WebElement fname) {
			Fname = fname;
		}

		public WebElement getLname() {
			return Lname;
		}

		public void setLname(WebElement lname) {
			Lname = lname;
		}

		public WebElement getPostcode() {
			return Postcode;
		}

		public void setPostcode(WebElement postcode) {
			Postcode = postcode;
		}

		public WebElement getAddcustomerclick() {
			return Addcustomerclick;
		}

		public void setAddcustomerclick(WebElement addcustomerclick) {
			Addcustomerclick = addcustomerclick;
		}

		@FindBy(className="btnClass1")
		private WebElement Adcustomer;
		
		@FindBy(className="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required")
		private WebElement Fname;
		
		@FindBy(className="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required")
		private WebElement Lname;
		
		@FindBy(className="form-control ng-pristine ng-untouched ng-invalid ng-invalid-required")
		private WebElement Postcode;
		
		@FindBy(className="btn btn-default")
		private WebElement Addcustomerclick;
		
		
		
		
		
	}


