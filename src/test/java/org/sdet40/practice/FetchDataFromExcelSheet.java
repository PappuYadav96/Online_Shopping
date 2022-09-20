package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is used to fetch data from Excel
 * @author PAPPU YADAV
 *
 */
public class FetchDataFromExcelSheet 
{
	/**
	 * This method is used to get data from Excel
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public  String getDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis= new FileInputStream(IConstantPath.EXCEL_PATH);
		Workbook book = WorkbookFactory.create(fis);
		String value = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();

		book.close();

		return value;
	}
}
