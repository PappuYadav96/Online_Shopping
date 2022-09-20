package org.sdet40.genericUtility;
/**
 * This interface consists all the external file paths
 * @author PAPPU YADAV
 *
 */
public interface IConstantPath {
//variable,method name=camelcase
//interface, class,enum,annotion= Pascal Case
//static final member ======> CAPITAL
	String PROJECT_PATH =System.getProperty("user.dir");
	String EXCEL_PATH= PROJECT_PATH+"/src/test/resources/FetchFromExcel.xlsx";
	String PROPERTY_FILE_PATH=PROJECT_PATH+"/src/test/resources/commanData1.properties";	
}
