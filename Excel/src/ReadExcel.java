import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args)
	{
		Object[][]arr2 = array();
		System.out.println(arr2[0][0]);
		
	}
	
	public static Object[][] array ()
	{
		File file = new File("C:\\Users\\ashok\\Documents\\READDOC.xlsx");
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		Object [] [] arr = new Object [0][0];
		try
		{
			FileInputStream excel = new FileInputStream(file);
			wkbook= new XSSFWorkbook(excel);
			sheet= wkbook.getSheet("Sheet1"); 
			int first = sheet.getFirstRowNum();
			int last = sheet.getLastRowNum();
			arr = new Object [last - first +1][4];
			for(int i=first; i<last; i++)
			{
				/*System.out.print(sheet.getRow(i).getCell(0).getStringCellValue() + "\t");
				System.out.print(sheet.getRow(i).getCell(1).getStringCellValue()+ "\t");
				System.out.print(sheet.getRow(i).getCell(2).getNumericCellValue() + "\t");
				System.out.print(sheet.getRow(i).getCell(3).getNumericCellValue()+"\n");*/
				arr[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][1]=sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][2]=sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][3]=sheet.getRow(i).getCell(0).getStringCellValue();
				//arr[i][4]=sheet.getRow(i).getCell(0).getStringCellValue();
			}
			//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());		
		} catch(IOException e){
			System.out.println(e.getMessage());
			}
		
 	 return arr;
	}

}
