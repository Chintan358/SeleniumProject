package group;

import org.testng.annotations.Test;

public class MyTest {
	
	@Test(groups = "smoke")
	public void alpha()
	{
		System.out.println("running alpha test...");
	}
	
	@Test(groups = "sanity")
	public void gama()
	{
		System.out.println("runing gama test");
	}
	
	@Test
	public void beta()
	{
		System.out.println("running beta test");
	}
	
	
	
}
