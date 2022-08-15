package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import com.microsoft.schemas.office.visio.x2012.main.CellType;




public class D_AllDatatypeReadingDynamic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File marvel = new File("C:\\Users\\Arjun\\OneDrive\\Desktop\\ST\\SQL\\SQLTable.xlsx");
		Workbook myWorkBook = WorkbookFactory.create(marvel);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		int totalNumOfRows = mySheet.getLastRowNum();
		int totalNumOfCells = mySheet.getRow(0).getLastCellNum()-1;

		for(int i=0;i<=totalNumOfRows;i++)
			{
			for(int j=0;j<=totalNumOfCells;j++)
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType cellDataType = myCell.getCellType();
				
					
				if(cellDataType==CellType.STRING)
				{
					String value = myCell.getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if (cellDataType==CellType.NUMERIC)
				{
					double value = myCell.getNumericCellValue();
					System.out.print(value+" ");
				}
					System.out.print("||");
				}
			System.out.println();
			}
		}
	}
