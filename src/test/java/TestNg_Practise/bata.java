package TestNg_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class bata {
		
		
		@Test(dataProvider="data")
		public void getdata(String src , String des)
		{
			System.out.println();
		}
		@DataProvider
		public Object[][] data()
		{
			Object[][] obj=new Object[2][2];
			
			obj[0][0]="qspider";
			obj[0][1]="testyantra";
			
			obj[1][0]="a";
			obj[1][1]="b";
			return obj;
		
		}

}

