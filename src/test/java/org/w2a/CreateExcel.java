package org.w2a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\DORABABU\\eclipse-Way2Automation\\MyMavenproject\\Files\\data3.xlsx");
		
			
		
		
			Workbook w = new XSSFWorkbook();
			Sheet createSheet = w.createSheet("testdata1");
			
			for (int i = 0; i <10; i++) {
				Row createRow = createSheet.createRow(i);
			
				for (int j = 0; j < 5; j++) {
				Cell createCell = createRow.createCell(i);
				createCell.setCellValue("dorababu");
			}}
			FileOutputStream fil = new FileOutputStream(f);
			w.write(fil);
	}

}
