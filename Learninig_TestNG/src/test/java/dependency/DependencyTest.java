package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	public void login()
	{
		//System.out.println("Test login");
		assertFalse(true);
	}
	
	@Test(dependsOnMethods = "login")
	public void home()
	{
		System.out.println("Test home");
	}
	
	@Test(dependsOnMethods = "home")
	public void logout()
	{
		System.out.println("Test logout");
	}
	
	
}
