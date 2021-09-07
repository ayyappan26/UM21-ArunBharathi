package com.ultramain.um21.excelread;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

/**
 * @author Arun Bharathi It shows the data in the Excel Sheet named Book1.xlsx
 *which is stored in the path C:\\Users\\ArunBarathi\\Documents\\Book1.xlsx
 *         
 */
public class ExcelRead {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Arun Barathi\\Documents\\Book1.xlsx");
		try {
			FileInputStream fileinput = new FileInputStream(file);

			XSSFWorkbook workbook = new XSSFWorkbook(fileinput);

			XSSFSheet sheet = workbook.getSheet("Sheet1");

			int row = sheet.getLastRowNum();
			int col = sheet.getRow(1).getLastCellNum();

			for (int r = 0; r < row; r++) {
				Row rows = sheet.getRow(r);
				for (int c = 0; c < col; c++) {
					Cell cols = rows.getCell(c);

					switch (cols.getCellType()) {
					case STRING:
						System.out.print("   " + cols.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print("   " + cols.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print("   " + cols.getBooleanCellValue());
						break;

					}
				}
				System.out.println();
			}
			workbook.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
