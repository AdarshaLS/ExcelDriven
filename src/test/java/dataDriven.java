import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C://Users//user//Documents//Apache POI.xlsx"); 
		XSSFWorkbook Workbook = new XSSFWorkbook(fis);

	}

}
