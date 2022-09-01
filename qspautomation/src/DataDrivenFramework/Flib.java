package DataDrivenFramework;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	// 
	public String readExcelData(String excelpath, String sheetname, int rowno, int cellno) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetname);
		Row ro = sh.getRow(rowno);
		Cell cell = ro.getCell(cellno);
		String data = cell.getStringCellValue();
		return data;
	}

	// for Row count
	
	public int getRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
	}


	//Generic reusable method to write the Data in the excel file 
	public void WriteDadaExcel(String excelpath, String sheetname, int rowcount, int cellcount, Date data, String proppath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet(sheetname);
	    Row ro=sh.getRow(rowcount);
	    Cell cell = ro.createCell(cellcount);
	    cell.setCellValue(data);
	    
	    FileOutputStream fos = new FileOutputStream(proppath);
	    wb.write(fos);
	}
	 
	
	
}