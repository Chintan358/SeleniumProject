package listener;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class MyTest 
{
	@Test
	public void test1()
	{
		System.out.println("Runing test1...");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Runing test2...");
		assertFalse(true);
	}
	
	
}
