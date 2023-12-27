package org.ng;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RunnerTestEx {
	
  
	@Test
	private void readExcel() throws InvalidFormatException, IOException {
		
		File f= new File("C:\\Users\\Mohamed Rifakathali\\Desktop\\Data.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Sheet1");
		System.out.println(s.getPhysicalNumberOfRows());
		Row r = s.getRow(1);
		System.out.println(r.getPhysicalNumberOfCells());
		Cell c = r.getCell(0);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(ct.STRING)) {
			System.out.println(c.getStringCellValue());
			System.out.println("String");
		}
		else {
			System.out.println(c.getNumericCellValue());
			System.out.println("NUMERIC");
		}
		

	}
	
	

}
