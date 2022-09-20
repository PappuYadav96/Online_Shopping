package org.sdet40.practice;

import java.util.List;
import java.util.Map;

import org.sdet40.genericUtility.ExcelUtility;

public class FetchDataFromExcelThroughListMap 
{
	public static void main(String[] args) throws Throwable, Throwable  
	{
ExcelUtility excelUtility = new ExcelUtility();	
excelUtility.openExcel(IConstantPath.EXCEL_PATH);
List<Map<String, String>> list = excelUtility.getDataFromExcelInList("form");
System.out.println(list.get(0).get("LastName"));
	}
}
