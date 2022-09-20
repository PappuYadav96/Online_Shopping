//package org.sdet40.practice;
//
//
//import java.io.IOException;
//
//import org.sdet40.genericUtility.ExcelUtility;
//import org.sdet40.genericUtility.FileUtility;
//import org.sdet40.genericUtility.IConstantPath;
//import org.sdet40.genericUtility.JavaUtility;
//
//public class MakeMyTrip {
//	public static void main(String[] args) throws IOException
//	{
//		// TODO Auto-generated method stub
//		/*
//		 * FileInputStream fis = new
//		 * FileInputStream("./src/test/resources/FetchFromExcel.xlsx"); Workbook wb =
//		 * WorkbookFactory.create(fis); Sheet sheet = wb.getSheet("MakeMyTrip"); String
//		 * fromCityCode=sheet.getRow(4).getCell(0).getStringCellValue(); String
//		 * toCityCode=sheet.getRow(4).getCell(1).getStringCellValue();
//		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
//		 * driver.manage().window().maximize();
//		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		 * driver.get("https://www.makemytrip.com/");
//		 * driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
//		 * //popup driver.findElement(By.xpath("//span[text()='From']")).click();
//		 * driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys(
//		 * fromCityCode);
//		 * driver.findElement(By.xpath("//div[text()='"+fromCityCode+"']")).click();
//		 * driver.findElement(By.xpath("//span[text()='To']")).click();
//		 * driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(
//		 * toCityCode);
//		 * driver.findElement(By.xpath("//div[text()='"+toCityCode+"']")).click();
//		 * driver.findElement(By.xpath("//a[text()='Search']")).click();
//		 */
//		
//			//Fetching data from Excel sheet(ExcelUtility)
//			int randomNumber = new JavaUtility().getRandomNumber(1000);
//				String data=new ExcelUtility().getDataFromExcel(IConstantPath.EXCEL_PATH,"MakeMyTrip",2,1)+randomNumber;	
//			System.out.println(data);
//			System.out.println(data);
//			String browser = new FileUtility().getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"browser");
//			System.out.println("browser");
//	}	
//}
//   
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
