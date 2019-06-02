package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentManager.NewExtentHtmlManager;

public class Telephony1 {
	
	ExtentReports rep1;
	
	@Test
	public void ConnectTelephonyTest() {
		System.out.println("Inside ConnectTelephonyTest");
		rep1 = NewExtentHtmlManager.ExtentRep();
		
		ExtentTest test1 = rep1.createTest("ConnectTelephonyTest");
		test1.log(Status.INFO, "ConnectTelephonyTest started");
		

		test1.pass("ConnectTelephonyTest passed");
		
		test1.log(Status.INFO, "ConnectTelephonyTest ended");
		
		rep1.flush();
		
	}
	
	@Test
	public void DialTelephonyTest() {
		System.out.println("Inside DialTelephonyTest");
		rep1 = NewExtentHtmlManager.ExtentRep();
		System.out.println("Learning git");
		
		System.out.println("Abhilasha Learning git");
		
		ExtentTest test1 = rep1.createTest("DialTelephonyTest");
		test1.log(Status.INFO, "DialTelephonyTest started");
		

		test1.pass("DialTelephonyTest passed");
		
		test1.log(Status.INFO, "DialTelephonyTest ended");
	
		
	}
	
	@AfterMethod
	public void flush() {
		rep1.flush();
	}
}
