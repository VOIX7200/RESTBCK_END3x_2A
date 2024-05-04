package com.qaX.TestBase1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase1 {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//WebDriverManager.edgedriver().setup();
			//driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			driver.manage().window().maximize();
			
		}
		
		return driver;
		
	}
	

}
