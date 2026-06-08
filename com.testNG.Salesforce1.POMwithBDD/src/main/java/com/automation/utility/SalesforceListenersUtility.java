package com.automation.utility;

//import java.lang.System.Logger;
import org.apache.logging.log4j.Logger;



//import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.logging.log4j.LogManager;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//import com.automation.tests.base.BaseTest;

public class SalesforceListenersUtility  implements ITestListener {
	private static Logger myLog =  LogManager.getLogger(SalesforceListenersUtility.class);
		
	
	ExtentReportsUtility extentObject=ExtentReportsUtility.getInstance();
	@Override
	public void onTestStart(ITestResult result) {
		myLog.info(result.getMethod().getMethodName()+" @Test started");
		extentObject.startSingleTestReport(result.getMethod().getMethodName());
		
			
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		myLog.info(result.getMethod().getMethodName()+" @Test ended with Successs");
		extentObject.logTestpassed(result.getMethod().getMethodName());
			
	}
	@Override
	public void onTestFailure(ITestResult result) {
		myLog.error("@Test ended with failuer");
		extentObject.logTestFailed(result.getMethod().getMethodName());
		String filename=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		String path=Constants.SCREENSHOT_DIRECTORY_PATH+filename+".png";
		//takeScreenshot(path);
		extentObject.logTestFailedWithScreenshot(path);
				
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		myLog.warn(result.getMethod().getMethodName()+ "@Test ended with Skip");
		extentObject.logTestFailed(result.getMethod().getMethodName());		
	}
	@Override
	public void onStart(ITestContext context) {
		myLog.info(context.getName()+" @My Test started");
		extentObject.startExtentReport();		
	}
	@Override
	public void onFinish(ITestContext context) {
		myLog.info(context.getName()+ " @My Test Finished");
		extentObject.endreport();	
	}
	



}
