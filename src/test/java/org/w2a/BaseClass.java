package org.w2a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass  {
	
	public static WebDriver driver;
	
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-Way2Automation\\MyMavenproject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void maxwindw() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	public static void url(String data) {
		// TODO Auto-generated method stub
		driver.get(data);
	}
	
	public static void sendkey(WebElement e1 , String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}	
	public static void click(WebElement e2) {
		// TODO Auto-generated method stub
		e2.click();
	}
	
	public static String dataread(int r , int c) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-Way2Automation\\MyMavenproject\\Files\\data3.xlsx");
		FileInputStream fil = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fil);
		Sheet sheet = w.getSheet("testdata1");
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType==1) {
			value = cell.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(cell)) {
			java.util.Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			value= sim.format(d);
		}else {
			double d = cell.getNumericCellValue();
			long l = (long)d;
			value = String.valueOf(l);
		}
		return value;
			
		}
	
		
		
		
		
		

	}
	

