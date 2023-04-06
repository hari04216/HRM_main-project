package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class HardAsert {
	
	
	@Test
	public void test1()
	{
		System.out.println("test_1");
		System.out.println("test_2");
		
		assertEquals("testyantra","qspiders");
		System.out.println("test_3");
	}
	@Test
	public void test2()
	{
		int i=10;
		System.out.println("test_4");
		System.out.println("test_05");
		assertNull(i);
		System.out.println("test_06");
	}
	}

