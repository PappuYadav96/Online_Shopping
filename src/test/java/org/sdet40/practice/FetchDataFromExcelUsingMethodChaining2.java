package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelUsingMethodChaining2
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fisExcel);
		try {
			Sheet sheet = wb.getSheet("CommanData");
			int data = (int)sheet.getRow(0).getCell(0).getNumericCellValue();
			System.out.println(data);
		} 
		finally 
		{
			wb.close();
	}
}
}