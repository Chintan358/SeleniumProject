package basic;

import org.testng.annotations.Test;

public class MyFirstNG
{
	@Test(priority = 1)
	public void alpha()
	{
		System.out.println("running alpha test...");
	}
	
	@Test(priority = 3,enabled = false)
	public void gama()
	{
		System.out.println("runing gama test");
	}
	
	@Test(priority = 2)
	public void beta()
	{
		System.out.println("running beta test");
	}
	
	
}
