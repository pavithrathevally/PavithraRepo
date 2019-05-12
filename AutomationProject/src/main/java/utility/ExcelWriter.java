package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter 
{

	public static void main(String[] args) 
	{
		try
		{
			// specify the path of the file
			File src = new File("D:\\Selenium\\Data-Driven-Test.xlsx");
			//load file
			FileInputStream fis = new FileInputStream(src);
			// load workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			// load sheet here
			XSSFSheet sh1 = wb.getSheetAt(0);
			// here we create a column
			// setCellValue will set the value
			sh1.getRow(0).createCell(3).setCellValue("Passed");
			sh1.getRow(1).createCell(3).setCellValue("Passed");
			sh1.getRow(2).createCell(3).setCellValue("Passed");
			sh1.getRow(3).createCell(3).setCellValue("Passed");
			FileOutputStream fout = new FileOutputStream(new File("D:\\Selenium\\Data-Driven-Test.xlsx"));
			wb.write(fout);
			fout.close();
			

	}
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}
		
	}

}
