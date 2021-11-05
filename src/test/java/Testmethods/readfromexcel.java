package Testmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path=".\\src\\test\\java\\Testmethods\\Testdata.xlsx";
		FileInputStream fis=new FileInputStream(path);
XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheetAt(0);
int rows=sheet.getLastRowNum();
System.out.println(rows);
int cols=sheet.getRow(0).getLastCellNum();
for(int r=0;r<=rows;r++) {
	XSSFRow row = sheet.getRow(r);
	
	
	for(int c=0;c<cols;c++ ) {
		XSSFCell cell=row.getCell(c);
		switch(cell.getCellType()) {
		
		case STRING:System.out.println(cell.getStringCellValue());
		break;
		case NUMERIC:System.out.println(cell.getNumericCellValue());
		break;
		case BOOLEAN:System.out.println(cell.getBooleanCellValue());
		break;
		
		}
		System.out.print("|");
	}
	System.out.println();
}

	}
	

}
