package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
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
			// getRow() specify which we want to read
			// getCell() specify column
			// getStringCellValue() specify that we are reading string data
			//System.out.println(sh1.getRow(0).getCell(0).getRawValue());
			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(1).getCell(2).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(2).getCell(2).getStringCellValue());
			System.out.println(sh1.getRow(3).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(3).getCell(2).getStringCellValue());
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception : " + ex);
		}
	}

}
