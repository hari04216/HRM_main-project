package TestNg_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {
	@Test

	@DataProvider
	
	public Object[][]data()
	{
		Object[][]obj=new Object[3][3];
		
		
		obj[0][0]="hari";
		obj[0][1]="krishna";
		obj[0][2]="hydra";
		
		
		obj[1][0]="hari";
		obj[1][1]="krishna";
		obj[1][2]="hydra";
		return obj;
		
	}
}
