package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentManager.NewExtentHtmlManager;

public class Telephony2 {
	@Test
	public void DisConnectTelephonyTest() {
		
		// Selenium code
		// 1) Launch ff browser
		// 2) Give an incorrect email id in input email box
		// 3) Click next
		// 4) Fetch String error message displayed
		// 5) Compare it with actual value
		
		// if comparison values are true then
		// test1.pass
		// if False - test.fail
		System.out.println("Inside DisConnectTelephonyTest");
		
		ExtentReports rep1 = NewExtentHtmlManager.ExtentRep();
		
		ExtentTest test1 = rep1.createTest("DisConnectTelephonyTest");
		test1.log(Status.INFO, "DisConnectTelephonyTest started");
		
		test1.fail("DisConnectTelephonyTest failed");
		
		test1.log(Status.INFO, "DisConnectTelephonyTest ended");
		
		rep1.flush();
		Assert.assertEquals("Zeenews", "hello world");
	}
}
