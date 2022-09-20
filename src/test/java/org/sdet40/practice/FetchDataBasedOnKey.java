package org.sdet40.practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.sdet40.genericUtility.ExcelUtility;

public class FetchDataBasedOnKey {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtility excelUtility = new ExcelUtility();
		excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		String firstname = excelUtility.getDataFromExcel("form", "firstName");
		String lastname = excelUtility.getDataFromExcel("form","lastname");
		String email = excelUtility.getDataFromExcel("form", "email");
		String address = excelUtility.getDataFromExcel("form", "address");
		System.out.println(email);
	}

}
