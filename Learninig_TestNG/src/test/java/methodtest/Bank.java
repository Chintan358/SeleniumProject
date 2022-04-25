package methodtest;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bank
{
	@Test
	public void saving()
	{
		System.out.println("Test saving account...");
	}
	
	@Test
	public void current()
	{
		System.out.println("Test current account...");
	}

	@Test
	public void loan()
	{
		System.out.println("Test Loan account...");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Calling before every method....");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Calling after every method....");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Calling after class...");
	}
	
	@BeforeClass		
	public void beforeClass()
	{
		System.out.println("Calling before class...");
	}
	
	
}
