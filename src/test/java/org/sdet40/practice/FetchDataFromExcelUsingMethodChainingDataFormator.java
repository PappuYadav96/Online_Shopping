package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelUsingMethodChainingDataFormator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		DataFormatter df = new DataFormatter();
		try {
			Sheet sheet = wb.getSheet("CommanData");
			String data = df.formatCellValue(sheet.getRow(1).getCell(1));
			System.out.println(data);
		} finally {
			wb.close();
		}
	}
}
