package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelDataFormatter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("CommanData");
		DataFormatter df = new DataFormatter();
		String[][] arr=new String[sheet.getLastRowNum()+1][sheet.getRow(6).getLastCellNum()];
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0; j<sheet.getRow(6).getLastCellNum();j++)
			{
				arr[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}}
		for(int i=0; i<sheet.getLastRowNum();i++)
		{
			for(int j=0; j<sheet.getRow(6).getLastCellNum();j++)
			{
				System.out.println(arr[i][j]);
	}

}
}
}