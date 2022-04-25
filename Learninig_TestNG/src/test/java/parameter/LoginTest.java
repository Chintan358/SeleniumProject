package parameter;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.Driverconnection;

public class LoginTest
{

	@Test(dataProvider = "dp")
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
	
	@DataProvider(name="dp")
	public static Object[][] getData()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "tops2gmail.com";
		obj[0][1] = "tops123";
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech@123";
		
		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc123";
		
		obj[3][0] = "xyz@gmail.cm";
		obj[3][1] = "xyz123";
		
		return obj;
		
	}
}
