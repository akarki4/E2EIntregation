package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001 {
@Test
public void testcase1()
{
	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("Hello");
	driver.findElement(By.id("pass")).sendKeys("Hello");
	driver.quit();
	
}

}
