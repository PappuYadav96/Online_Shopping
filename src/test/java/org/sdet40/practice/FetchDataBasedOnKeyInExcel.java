package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataBasedOnKeyInExcel {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CommanData");
		DataFormatter df = new DataFormatter();
	String value = null;
	int i= 0;
	while(i<=sheet.getLastRowNum())
	{
		 String key = df.formatCellValue(sheet.getRow(i).getCell(0));
	if(key.equalsIgnoreCase("e"))
	{
		value= df.formatCellValue(sheet.getRow(i).getCell(1));
		break;
	}
	i++;
}
System.out.println(value);	
	}
}
