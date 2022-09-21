package org.sdet40.genericUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class consists reusable method to handle property file
 * @author PAPPU YADAV
 * 
 */
public class FileUtility
{
/** 
 * fileutility class updated
 * @param key
 * @return
 * @throws IOException
 */
	public String getDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(IConstantPath.PROPERTY_FILE_PATH);
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty(key).trim();
		return value;
	}
}

