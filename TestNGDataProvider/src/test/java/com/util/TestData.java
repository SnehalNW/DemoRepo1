package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData {

	public static Object[][] getData(String excelPath, String sheetName) 
	{
		//WorkBook, Sheet, Rows, Cell these are the major classes
		
		Object obj[][]=null;
		
		try 
		{
			//get the excel file as workbook
			Workbook workbook=WorkbookFactory.create(new File(excelPath));
			
			//pick a sheet from excel workbook
			Sheet sheet =workbook.getSheet(sheetName);
			
			//get number of rows and column in sheet
			int rows=sheet.getLastRowNum();
			int cols=sheet.getRow(1).getLastCellNum();
			
			
			//initialise the object
			obj=new Object[rows][cols];
			
			//feed the obj[][] with data from excel file
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<cols;j++)
				{
					//skipping the header rows of sheet, so mentioned i+1 instead of only i
					obj[i][j]=sheet.getRow(i+1).getCell(j).toString();//
					
				}
			}
			
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}
