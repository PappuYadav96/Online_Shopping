package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchDataToExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step1------>convert the physical file into java readable object
		FileInputStream fisExcel = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		//Step2-------> open the excel workbook
		Workbook wb = WorkbookFactory.create(fisExcel);
		//Step3-----> get the control on sheet
		Sheet sheet = wb.getSheet("Organization");
	//Step4---->get the control on row for new row
		org.apache.poi.ss.usermodel.Row row = sheet.createRow(8);
		//Step5------> get the control on cell
	    Cell cell = row.createCell(3);
	//Step6-------> fetch the Data
	cell.setCellValue("skip");
	FileOutputStream fos = new FileOutputStream("./src/test/resources/FetchFromExcel.xlsx");
		//Step 7------> write the data into excel
	wb.write(fos);
	System.out.println("Data updated successfully");
	// Step8 ------>close the workbook
	wb.close();
	}

}
