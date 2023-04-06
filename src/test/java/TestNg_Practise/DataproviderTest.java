package TestNg_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
	
	@Test(dataProvider="data")
	public void getdata(String src,String dest)
	{
		System.out.println("from");
	}
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="qspider";
		obj[0][1]="testyantra";
		return obj;
		
	}
	
@Test(dataProvider="meta")
	public void getdata(String src,String des,String trg)
	{
		System.out.println("in"+ "out");
	}
@DataProvider
public Object[][] meta()
{
	Object[][]obj=new Object[3][3];
	obj[0][0]="hari";
	obj[0][1]="krishna";
	obj[0][2]="hydra";
	
	
	obj[0][0]="hari";
	obj[0][1]="krishna";
	obj[0][2]="hydra";
	
	obj[0][0]="hari";
	obj[0][1]="krishna";
	obj[0][2]="hydra";
	
	

	return obj;
	}
}

