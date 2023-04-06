package TestNg_Practise;

import org.testng.annotations.Test;

public class DataproTest {

	@Test(dataProviderClass = DataPro.class,dataProvider="data")
	public void getdata(String a, String b, String c) {
		System.out.println(a+" "+b+" "+c);
		
	}
}
