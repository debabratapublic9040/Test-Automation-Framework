package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtility {
	
	public static Iterator<User> readExcelFile(String fileName) {
		
		File file=new File(System.getProperty("user.dir")+"\\testData\\"+fileName);
		Row row;
		Cell emailAddress;
		Cell password;
		Iterator<Row> rowIterator;
		User user = null;
		List<User> userList=null;
		XSSFWorkbook workbook = null;
		try {
			
		    workbook = new XSSFWorkbook(file);
			userList=new ArrayList<User>();
			XSSFSheet sheet = workbook.getSheet("LoginTestData");
			rowIterator = sheet.iterator();
			rowIterator.next();
				while(rowIterator.hasNext())
				{
				row=rowIterator.next();
				emailAddress=row.getCell(0);
				password=row.getCell(1);
				user=new User(emailAddress.toString(),password.toString());
				userList.add(user);
				workbook.close();
			    }
		
		
	       }
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
				
				e.printStackTrace();
			
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
		
		return userList.iterator();
	}

}
