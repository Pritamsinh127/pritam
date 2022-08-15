package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_1 { 
	
	//to read 1st row 1st cell value
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File marvel=new File("C:\\Users\\Arjun\\OneDrive\\Desktop\\ST\\SQL\\SQLTable.xlsx");
		String value = WorkbookFactory.create(marvel).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		
	}

}
