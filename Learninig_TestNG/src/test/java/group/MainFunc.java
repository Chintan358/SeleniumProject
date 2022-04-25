package group;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainFunc {
	
	@Test(groups = "smoke")
	public void login()
	{
		System.out.println("Test login");
	}
	
	@Test(groups = "sanity")
	public void home()
	{
		System.out.println("Test home");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Test logout");
	}
	
	
	
	
}
