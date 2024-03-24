package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Homepage extends BaseTest{
	
	@Test
	public static void LoginTest(){
		System.out.println("Clicked successfully");
		driver.findElement(By.xpath("//input[@id='edit-firstname']")).sendKeys("QA Zahid");
		driver.findElement(By.xpath("//input[@id='edit-email']")).sendKeys("Test@gmail.com");
	}

}
