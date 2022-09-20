package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
//Step1----> convert the physical file into java readable object
		FileInputStream fisExcel=new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		//Step2------> open the excel workbook
		Workbook wb = WorkbookFactory.create(fisExcel);
		//Step3----> get the control on sheet
		Sheet Sheet = wb.getSheet("CommanData");
		//Sheet4---> get the control on row
	  Row row = Sheet.getRow(2);
	 //Step5-----> get the control on cell
	 Cell cell = row.getCell(1);
		//Step6----->fetch the data
	 String username = cell.getStringCellValue();
	 System.out.println(username);
	 //Step 7---->close the workbook
	 wb.close();	
	}

}
