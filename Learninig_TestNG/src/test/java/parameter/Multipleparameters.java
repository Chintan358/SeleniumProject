package parameter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class Multipleparameters
{
	@Parameters({"username","password"})
	@Test
	public void loginCheck(String uname, String pass)
	{
		WebDriver driver =Driverconnection.getDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement upass = driver.findElement(By.id("pass"));
		
		email.clear();
		email.sendKeys(uname);
		upass.clear();
		upass.sendKeys(pass);
	}
}
