package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B_ReadCompleteSheet {   // read complete excel sheet

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File marvel = new File("C:\\Users\\Arjun\\OneDrive\\Desktop\\ST\\SQL\\SQLTable.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(marvel);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		
		for(int i=0;i<=22;i++)//outer for loop--> for rows
			{
				for(int j=0;j<=22;j++)//inner for loop--> for cells
					{
						String value = mySheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(value+" ||");
					}
				System.out.println();
			}

	}

}
