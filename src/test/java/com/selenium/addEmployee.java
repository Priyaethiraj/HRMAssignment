package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class addEmployee extends baseTest{
	
	@Test
	// Test Scenario ID - TS_PIM_04
	public void newEmployee() throws InterruptedException, IOException{
		
		openBrowser("Chrome");
	
		login("Admin", "admin123");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Priya");
		driver.findElement(By.id("middleName")).sendKeys("S");
		driver.findElement(By.id("lastName")).sendKeys("Ethiraj");
		
		// Test Scenario ID - TS_PIM_05 verified

		WebElement UploadImg = driver.findElement(By.id("photofile"));
			UploadImg.click();
			UploadImg.sendKeys("C:\\Users\\priya\\Documents\\images\\priya.jpg");
			
		driver.findElement(By.id("chkLogin")).click();	
		
		try {
			capturescreenshot("ImageUploadTest5");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.id("user_name")).sendKeys("Priya");
		driver.findElement(By.id("user_password")).sendKeys("Priya123");
		driver.findElement(By.id("re_password")).sendKeys("Priya123");
		
		Select status = new Select(driver.findElement(By.id("status")));
		status.selectByVisibleText("Disabled");
		
		driver.findElement(By.id("btnSave")).click();	
		
		try {
			capturescreenshot("EmployeeAdditionTest4");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		closeBrowser();
		
	}

}
