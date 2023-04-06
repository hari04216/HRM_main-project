package Assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	
	
	@Test
	public void test1()
	{
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("qspy", "ty");
		Reporter.log("test_01");
		Reporter.log("test_02");

	}

}
