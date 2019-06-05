package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class editContactInfo extends baseTest{
	
	@Test
	//Test Scenario ID - TS_PIM_03
	public void contactDetails() throws InterruptedException, IOException{
		
		openBrowser("Chrome");
	
		login("Admin", "admin123");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
		
		//driver.findElement(By.xpath("*[@id='menu_pim_viewEmployeeList']")).click();
		
		driver.findElement(By.id("empsearch_id")).sendKeys("0006");
		driver.findElement(By.id("searchBtn")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.id("btnSave")).click();
		
		//Clicking on Save without doing any changes
		driver.findElement(By.id("btnSave")).click();
		
		try {
			capturescreenshot("ContactDetailsTest4");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		closeBrowser();
		
		
	}
		

}
