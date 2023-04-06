package TestNg_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class a {
		
		
		@Test(dataProvider="data")
		public void getdata(String src,String dest)
		{
			
			//System.out.println("src:"+":des");
			System.out.println("src: "+src+" dest: "+dest);
		}
		@DataProvider
		public Object[][] data()
		{
			Object[][] obj=new Object[2][2];
			
			obj[0][0]="qspider";
			obj[0][1]="testyantra";
			
			obj[2][0]="jp";
			obj[2][1]="up";
			return obj;
			
		}

}
