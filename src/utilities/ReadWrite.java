package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {
	public String readDataFromExcel(int rowcount, int columncount, String filepath, String Sheetname) {
		String data = null;
		try {
			FileInputStream input = new FileInputStream(filepath);
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sh = wb.getSheet(Sheetname);
			XSSFRow row = sh.getRow(rowcount);
			data = row.getCell(columncount).toString();
			
			// get row and column count
			int countRow = sh.getLastRowNum()-sh.getFirstRowNum();
			int countColumn = row.getLastCellNum();
			System.out.println("total no. of rows ="+(countRow+1)+" and columns = "+countColumn);
			
			if(data==null)
			{
				return null;
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return data;
	}

	public void writeDataFromExcel(int rowcount,int columncount,String filepath,String Sheetname,String value)
	{
	    try
	    {
	        FileInputStream input=new FileInputStream(filepath);
	        XSSFWorkbook wb=new XSSFWorkbook(input);
	        XSSFSheet sh=wb.getSheet(Sheetname);
	        XSSFRow row=sh.getRow(rowcount);
	        FileOutputStream webdata=new FileOutputStream(filepath);
	        row.createCell(columncount).setCellValue(value);
	        wb.write(webdata);
	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	}
	

	public static void main(String args[]) 
	{
		String value= "";
		//String value1 = "";
		ReadWrite rw= new ReadWrite();
		/*value1 = rw.readDataFromExcel(0, 0, "D:\\VishalData\\AutoS\\Scripts\\SeniorCRM Auto Scripts\\CRM_Login.xlsx", "JavaProject");
		System.out.println(value1);
		value2 = rw.readDataFromExcel(0, 1, "D:\\VishalData\\AutoS\\Scripts\\SeniorCRM Auto Scripts\\CRM_Login.xlsx", "JavaProject");
		System.out.println(value2);*/
		int i=0;
		
		try
		{
			while(value!=null)
			{
				
				value = rw.readDataFromExcel(0, i, "D:\\VishalData\\AutoS\\Scripts\\SeniorCRM Auto Scripts\\CRM_Login.xlsx", "JavaProject");
				if(value==null)
					break;
				System.out.println(value);
				i++;
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}
