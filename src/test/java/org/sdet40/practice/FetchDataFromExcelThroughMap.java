package org.sdet40.practice;

import java.io.IOException;
import java.util.Map;

import org.sdet40.genericUtility.ExcelUtility;

public class FetchDataFromExcelThroughMap {

	public static void main(String[] args) throws Throwable, IOException {
	ExcelUtility excelUtility = new ExcelUtility();	
		excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		Map<String, String> map = excelUtility.getDataFromExcelInMap("form");
		System.out.println(map.get("LastName"));
	}

}
