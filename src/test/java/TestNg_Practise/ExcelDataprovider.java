package TestNg_Practise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericUtilities.Ipathconstants;

public class ExcelDataprovider {

	
	@DataProvider
	public Object[][] eta() throws Throwable {

		FileInputStream fis = new FileInputStream(Ipathconstants.Excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("dp");
		int lastrow = sh.getLastRowNum() + 1;
		int lastcell = sh.getRow(0).getLastCellNum();

		Object[][] obj = new Object[lastrow][lastcell];
		for (int i = 0; i < lastrow; i++) {
			for (int j = 0; j < lastcell; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return obj;

	}
	
	
	@Test(dataProvider = "eta")
	public void getData(String data1, String data2) {
		System.out.println(data1+"\t:"+data2);
	}

}
