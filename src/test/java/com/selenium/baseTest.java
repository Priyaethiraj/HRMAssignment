package com.selenium;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class baseTest {
		
		public static Properties CONFIG=null;
		public static WebDriver driver =null;
		public static boolean loggedIn=false;
		public static boolean isBrowserOpened=false;
		
		public void initialize() throws Exception{
			
			// config
			CONFIG = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//com//selenium//resources//config.properties");
			CONFIG.load(ip);
			System.out.println(CONFIG.getProperty("browserType"));
		}
		
		//opening Browser
		public void openBrowser(String browserType){
			
			if(browserType.equalsIgnoreCase("Firefox")){
				driver= new FirefoxDriver();
			}else if(browserType.equalsIgnoreCase("Chrome")){
				driver= new ChromeDriver();
			
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			}
		
		// close browser
		public void closeBrowser(){
			driver.quit();
			isBrowserOpened=false;
		}
		
		//Taking Screenshot
		public void capturescreenshot(String filename) throws IOException{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(scrFile, new File(CONFIG.getProperty("screenshotPath")+"\\"+filename+".jpg"));
		    

		}
		
		//Logging into application
		
		public void login(String username, String password)throws InterruptedException, IOException{{
			
			try{
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
}
}