package org.sdet40.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.sdet40.genericUtility.ExcelUtility;

public class Practice5 {
	static ExcelUtility excelUtility;
 
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 excelUtility = new ExcelUtility();
		 excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		 String sc= excelUtility.getDataFromExcelInKey("AppleIphoneUser","BillingAddress");
		System.out.println(sc);
	}

}
