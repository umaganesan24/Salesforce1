package com.testing.MavenDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginErrorTest {
	@Test
	public void testLoginError()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("anca");
		 driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("aaa");
		 driver.findElement(By.xpath(".//*[@id='Login']")).click();
		 String str = driver.findElement(By.xpath(".//*[@id='error']")).getText();
		 System.out.println(str);
		 driver.close();
	}
}
