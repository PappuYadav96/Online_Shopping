package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelUsingMethodChaining {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		try {
			Sheet sheet = wb.getSheet("CommanData");
			String username = sheet.getRow(2).getCell(1).getStringCellValue();
			String password = sheet.getRow(1).getCell(1).getStringCellValue();
			String url = sheet.getRow(0).getCell(1).getStringCellValue();
			String browser = sheet.getRow(3).getCell(1).getStringCellValue();
			System.out.println(username);
			System.out.println(password);
			System.out.println(browser);
		} finally {
			wb.close();
		}
	}

}
