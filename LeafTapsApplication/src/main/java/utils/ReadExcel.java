package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel{

	public static String[][] readData(String fileName, int sheetIndex ) throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheetAt(sheetIndex);
		int rowCount = ws.getLastRowNum();
		int colCount = ws.getRow(0).getLastCellNum();
		String data[][] = new String[rowCount][colCount];
		for (int i=1;i<=rowCount;i++)
		{
			for (int j=0;j<colCount;j++)
			{
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellValue= cell.getStringCellValue();
				data[i-1][j] = cellValue;
								
			}
		}
		wb.close();
		return data;
}
}
