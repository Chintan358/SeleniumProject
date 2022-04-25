package methodtest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainFunc {
	
	@Test
	public void login()
	{
		System.out.println("Test login");
	}
	
	@Test
	public void home()
	{
		System.out.println("Test home");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Test logout");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Runing before test....");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Runing after test....");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Runing suit test....");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Runing suit test....");
	}
	
	
	
	
}
