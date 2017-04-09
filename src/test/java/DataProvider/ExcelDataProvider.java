package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook  wb;
	
	
	
	public ExcelDataProvider(){
		
		
		File src=new File("./appTestData/TestData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);	
			
		} catch (Exception e) {
			
		System.out.println("Exception is " +e.getMessage());
		}
		
		
		
	}
	
	
	public String getdata(int sheetindex,int row,int colum)
	{
		//getStringcellvalue will return string type data
		String data=wb.getSheetAt(0).getRow(row).getCell(colum).getStringCellValue();
	
		return data;
		
		
	}

	public String getdata(String sheetname,int row,int colum)
	{
		String data=wb.getSheet(sheetname).getRow(row).getCell(colum).getStringCellValue();
		
	
		return data;
		
		
	}

}
