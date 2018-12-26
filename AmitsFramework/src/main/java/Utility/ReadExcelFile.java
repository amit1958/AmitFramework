package Utility;

import java.io.File;
import java.io.IOException;


import jxl.Cell;
import jxl.JXLException;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class ReadExcelFile {

	public static void main (String args[]) throws JXLException, IOException{
		File myfile = new File("C:/Users/amit.sharma/git/Old-cf/Old-cf/TestData.xls");
		Workbook wb= Workbook.getWorkbook(myfile);
	String datainrow1=	wb.getSheet(0).getCell(0, 0).getContents();
		System.out.println("date is in the row 1 is " +datainrow1);
		int rows=wb.getSheet(0).getRows();
		System.out.println("Number of rows " +rows);
			}
	
}

