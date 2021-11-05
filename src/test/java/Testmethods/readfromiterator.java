package Testmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfromiterator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path=".\\src\\test\\java\\Testmethods\\Testdata.xlsx";
		FileInputStream fis=new FileInputStream(path);
XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheetAt(0);
Iterator iterator = sheet.iterator();
while(iterator.hasNext()) {
	
	XSSFRow row=(XSSFRow)iterator.next();
	Iterator celliterator=row.cellIterator();
	while(celliterator.hasNext()) {
		
		 XSSFCell cell = (XSSFCell) celliterator.next();
		 
			switch(cell.getCellType()) {
			
			case STRING:System.out.println(cell.getStringCellValue());
			break;
			case NUMERIC:System.out.println(cell.getNumericCellValue());
			break;
			case BOOLEAN:System.out.println(cell.getBooleanCellValue());
			break;
			default:
				break;
			
			}
			System.out.print("|");
		}
		System.out.println();
	}


	}

}