package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
    org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("citytour");
	Row ro = sh.getRow(2);
	 Cell cell = ro.getCell(1);
	String data = cell.getStringCellValue();
	System.out.println(data);
	
	
	
}
}