package org.sdet40.practice;
/**
 * This interface consists all the external file paths
 * @author PAPPU YADAV
 *
 */
public interface IConstantPath {
	//variable, method name = camelCase
	//interface,class,enum,annotaion = Pascal Case
	// static final member ===>CAPITAL
	String PROJECT_PATH = System.getProperty("user.dir");
	String EXCEL_PATH = PROJECT_PATH+"./src/test/resources/FetchFromExcel.xlsx";
	String PROPERTY_FILE_PATH = PROJECT_PATH+"src/test/resources/commanData1.properties";
	String DB_URL = "jdbc:mysql://localhost:3306/tyss";
}