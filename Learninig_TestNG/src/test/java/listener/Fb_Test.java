package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class Fb_Test {
	
	@Test(priority = 1)
	public void titleCheck(ITestContext context)
	{
		WebDriver driver = Driverconnection.getDriver();
		driver.get("http://www.topsint.com/topserp/");
		String expected = "Tops erp";
		String actual = driver.getTitle();
		context.setAttribute("driver", driver);
		context.setAttribute("img", "titleCheck");
		assertEquals(expected,actual);
	}
	
	@Test(priority = 2)
	public void logincheck(ITestContext context)
	{
		WebDriver driver = Driverconnection.getDriver();
		driver.get("http://www.topsint.com/topserp/");
		driver.findElement(By.name("btn_login")).click();
		String expected = "Tops Error";
		String actual = driver.getTitle();
		context.setAttribute("driver", driver);
		context.setAttribute("img", "logincheck");
		assertEquals(expected,actual);
	}
}
