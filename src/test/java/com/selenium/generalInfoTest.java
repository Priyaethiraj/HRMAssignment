package com.selenium;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class generalInfoTest extends baseTest{
	
	
	@Test
	//Test Scenario ID - TS_PIM_02
	public void seeGeneralInformation() throws InterruptedException, IOException{
		
		openBrowser("Chrome");
	
		login("Admin", "admin123");
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
		
		try {
			capturescreenshot("generalInfo1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id='menu_admin_Organization']")).click();
		
		 List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='menu_admin_Organization']"));
		    System.out.println(allElements);
		    
		    for (int i = 1; i < allElements.size(); i++)
		    {
		        System.out.println(allElements.get(i).getText());
		        if(allElements.get(i).getText().equals("General Information")){
		        	System.out.println("TestCase Passed");
		        }
		    }
		    
			closeBrowser();
	}
	
	

}
