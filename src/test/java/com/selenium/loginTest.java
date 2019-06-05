package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class loginTest extends baseTest{
	
	@Test
	//Test Scenario ID - TS_PIM_01
	public void loginSuccessfully() throws InterruptedException{
		
		openBrowser("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		try {
			capturescreenshot("loginTestCase1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		closeBrowser();
		
	}
	

}
