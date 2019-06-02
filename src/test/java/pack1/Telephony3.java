package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentManager.NewExtentHtmlManager;

public class Telephony3 {
	@Test
	public void TransferTelephonyTest() {
		System.out.println("Inside TransferTelephonyTest");
		ExtentReports rep1 = NewExtentHtmlManager.ExtentRep();
		
		ExtentTest test1 = rep1.createTest("TransferTelephonyTest");
		test1.log(Status.INFO, "TransferTelephonyTest started");
		

		test1.fatal("TransferTelephonyTest fatal");
		
		test1.log(Status.INFO, "TransferTelephonyTest ended");
		
		rep1.flush();

	}
}
