package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dashboardMouseOver extends baseTest{
	
	@Test
	//Test Scenario ID - TS_PIM_06
	public void mouseOver() throws InterruptedException, IOException{
		
		openBrowser("Firefox");
		
		login("Admin", "admin123");
		
		WebElement we = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div/div/div[1]/fieldset/div/div[1]/canvas[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(we).perform();
		
		try {
			capturescreenshot("DashboardMouseOver6");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		closeBrowser();
		
	}

}
