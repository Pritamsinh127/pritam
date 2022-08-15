package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C_DynamicCodingForSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File marvel = new File("C:\\Users\\Arjun\\OneDrive\\Desktop\\ST\\SQL\\SQLTable.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(marvel);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		
		int totalRows = mySheet.getLastRowNum();
		System.out.println("Total Number of rows are "+totalRows);
		
		int totalCells = mySheet.getRow(0).getLastCellNum()-1;
		System.out.println("Total Number of Columns are "+totalCells);
		
		for(int i=0;i<=totalRows;i++)//outer for loop--> for rows
		 {
		  for(int j=0;j<=totalCells;j++)
		   {
		     String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		     System.out.print(value +" | ");
		   }
		    System.out.println();
		}
	}

}
