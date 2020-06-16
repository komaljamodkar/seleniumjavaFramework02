package testngpros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {
	public static void main (String [] args) throws IOException{
		
		File src=new File("/home/swati/Desktop/data1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 = workbook.getSheetAt(0);
		 
		/* String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		 
		 System.out.println("Data from excel :"+data0);
		 
       String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		 
		 System.out.println("Data from excel :"+data1);*/
		 int rowcount=sheet1.getLastRowNum();
		 Row row=sheet1.getRow(0);
		 for(int j=0;j<rowcount+1;j++)
		 {
			 
			 sheet1.getRow(j).createCell(2).setCellValue("Pass");
			 System.out.println("Data from excel :"+sheet1.getRow(j));
			 FileOutputStream fout=new FileOutputStream(src);
			 workbook.write(fout);
		 }
		 
		 
		 
		 workbook.close();
		 }
		}