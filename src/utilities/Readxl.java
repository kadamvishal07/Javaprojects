package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxl 
{
	static XSSFWorkbook xlWorkBook;
	static XSSFSheet xlWorkSheet;
	static XSSFRow xlRow;
	static XSSFCell xlCell;
	
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
	public static void setExcelFile(String path, String sheetName) throws Exception
	{
		try
		{
			// open excel file
			FileInputStream ExcelFile = new FileInputStream(path);
			//Access the required test data sheet.
			xlWorkBook = new XSSFWorkbook(ExcelFile);
			xlWorkSheet = xlWorkBook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	// This method is to read data from cell, therefore row no. and col num are the parameters.
	public static String getCellData(int rowNum, int cellNum) throws Exception
	{
		try
		{
			xlCell = xlWorkSheet.getRow(rowNum).getCell(cellNum);
			String cellData=xlCell.getStringCellValue();
			return cellData;
		}
		catch(Exception e)
		{
			throw(e);
		}
	}

	//This method is to write data in cell, row no. and col no. are the parameters
	/*public static void setCellData(String result, int rowNum, int collNum) throws Exception
	{
		try
		{
			 FileOutputStream webdata=new FileOutputStream(filepath);
		     row.createCell(columncount).setCellValue(value);
		     wb.write(webdata);
		}
		catch(Exception e)
		{
			throw(e);
		}
	}*/
}