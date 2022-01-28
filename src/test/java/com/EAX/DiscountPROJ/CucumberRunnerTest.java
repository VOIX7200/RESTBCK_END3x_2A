package com.EAX.DiscountPROJ;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	public static void tearDown() throws InterruptedException, IOException {
		System.out.println("TearDown for REST_PROJEA3X_2A After Class ");
		 driver = TestBase1.getDriver();
		 report.flush();
		Thread.sleep(2000); 
		//driver.get("C:\\Users\\E Anya\\eclipse-workspace1\\REST_PROJEA3X_2A\\ExtentFolder\\index.html");
		//driver.get("C://Users//E Anya//eclipse-workspace1//REST_PROJEA3X_2A//ExtentFolder\\index.html");
		String path = System.getProperty("user.dir");
		System.out.println(path);
		driver.get(path+"\\ExtentFolder\\index.html");
		//FileReader fReader = new FileReader("./");
		//System.out.println("filereader" + fReader);
		//fReader.close();
		//driver.get(".//ExtentFolder\\index.html");
		//driver.get("C://**//**//**//**//ExtentFolder//index.html"); 
		//driver.get(".//**//ExtentFolder//index.html"); 
		  driver.navigate().back(); 
		  Thread.sleep(1000); 
		  driver.navigate().forward();
		   
		  Thread.sleep(60000);
		  System.out.println("This Project is about to EXIT..............");
		driver.quit();
	}

}                         
