package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A_ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File marvel = new File("C:\\Users\\Arjun\\OneDrive\\Desktop\\ST\\SQL\\SQLTable.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(marvel);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		//reading multiple data from single row
		for(int i=0;i<=4;i++)   //cell index/count start from zero
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		System.out.println("=========================");
		
		//reading multiple data from single column
		for(int i=0;i<=23;i++)  
		{
		String value = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value); //1st cell having 2 datatypes string & int, so string only print here, Multiple data handling will see in next program
		}

	}

}
