package com.EAX.DiscountPROJ;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.qaX.TestBase1.TestBase1;
import com.qaX.extentReport1.ExtentReportManager1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

 


 //@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/")
//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/")
//@CucumberOptions(features={"src/test/resources/com.bbd.demo/A_login.feature",
		//"src/test/resources/com.bbd.demo/B_contactus.feature"})
public class CucumberRunnerTest {
	static ExtentReports report;
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("before class ");		 
		report = ExtentReportManager1.getReport();
		
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		System.out.println("After class ");
		 driver = TestBase1.getDriver();
		Thread.sleep(2000); 
		driver.get("C:\\Users\\E Anya\\eclipse-workspace1\\REST_PROJEA3X\\ExtentFolder\\index.html"); 
		  driver.navigate().back(); 
		  Thread.sleep(1000); 
		  driver.navigate().forward();
		  report.flush(); 
		  Thread.sleep(60000);
		  
		driver.quit();
	}

}                         
