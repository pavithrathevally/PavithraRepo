package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	private static XSSFSheet Sh;
	private static XSSFWorkbook Wb;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static Object[][] getExcelData(String FilePath , String SheetName) throws Exception
	{
		String[][] excelData = null;
		try
		{
			FileInputStream ExcelFile = new FileInputStream(FilePath);
			Wb = new XSSFWorkbook(ExcelFile);
			Sh = Wb.getSheet(SheetName);
			int startRow = 1;
			int startCol = 1;
			int ci , cj;
			int totalRows = Sh.getLastRowNum();
			int totalCol = 2;
			excelData = new String[totalRows][totalCol];
			ci = 0;
			for(int i = startRow;i<=totalRows;i++,ci++)
			{
				cj = 0;
				for(int j = startCol;j<=totalCol;j++,cj++)
				{
					excelData[ci][cj] = getCellData(i,j);
					System.out.println(excelData[ci][cj]);
				}
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("could not read the Excel data");
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			System.out.println("could not read the Excel data");
			ex.printStackTrace();
		}
		return (excelData);
	}
	public static String getCellData(int RowNum , int ColNum) throws Exception
	{
		try
		
		{
			Cell = Sh.getRow(RowNum).getCell(ColNum);
			String CellData = Cell.getStringCellValue();
			return CellData;
			
		}
		catch(Exception ex)
		{
			return "";
		}
		
	}


}
