package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFilePOI {
	
	XSSFWorkbook wb;
	XSSFSheet mysheet;
	
	public void readExcel(String path){
		try{
		File myfile= new File(path);
		FileInputStream myinputfile= new FileInputStream(myfile);
		wb= new XSSFWorkbook(myinputfile);
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
		
	public String getData(int sheetnumber,int row,int column){
		mysheet= wb.getSheetAt(sheetnumber);
		DataFormatter format= new DataFormatter();
		String data=format.formatCellValue(mysheet.getRow(row).getCell(column));
		return data;
	}
		
	}


