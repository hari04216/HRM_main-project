package TestNg_Practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class create {
	@Test
	public void create1() {
		System.out.println();
	}

	@DataProvider
	public Object[][] edit() {
		Object[][] Name = new Object[2][2];
		Name[0][0] = "Hari";
		Name[0][1] = "Krishna";
		Name[1][0] = "vinay";
		Name[1][1] = "Idiot";
		return Name;
	}

	@Test(invocationCount = 1)
	public void delete() {

	}

	@Test(enabled = false)
	public void enter()

	{
		System.out.println("hellow");
	}

	@Test(dataProvider = "edit")
	public void backspace(String Name) {
		System.out.println(Name);
	}

	@Test(priority = 1)
	public void hello() {
		System.out.println("1");
	}

}
