package TestNg_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericUtilities.ExcelUtility;

public class ExceelMultipledata {
	
	@Test(dataProvider="readSetofdata")
	public void getdata(String src, String dst)
	{
		System.out.println(src + dst );
		
	}
	
	@DataProvider
	public Object[][] readSetofdata() throws Throwable
	{
	ExcelUtility elib=new ExcelUtility();
	Object[][] value = elib.readmultiplesetofdata("dp");
	return value;
		//readmultiplesetofdata
	}

}
