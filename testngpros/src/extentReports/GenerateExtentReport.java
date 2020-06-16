package extentReports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testngpros.DataDriven1;
 

public class GenerateExtentReport extends DataDriven1 {

	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void startReport()
	{
		
		
		extent=new ExtentReports(System.getProperty("user.dir") +"/test-output/MyExtentReport11.html", true);

		extent.addSystemInfo("Host Name", "swati");
		extent.addSystemInfo("Environment", "QA");
        extent.addSystemInfo("User Name", "swati");
        extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
    }
	
	@Test
	 public void demoReportPass(){
		test= extent.startTest("demoReport pass");
	    Assert.assertTrue(true);
	    test.log(LogStatus.PASS, "Pass Test Case Passed is passTest");
	 }
	
	
	 @Test
	 public void demoReportFail(){
	 test = extent.startTest("demoReport fail");
	 Assert.assertTrue(false);
	 test.log(LogStatus.FAIL, "fail Test Case Passed is failTest");
	 }
	 
	 @Test
	 public void skipTest(){
	 test = extent.startTest("skipTest");
	 throw new SkipException("Skipping - This is not ready for testing ");
	 }
	 
	 @AfterMethod
	 public void getResult(ITestResult result){
	 if(result.getStatus() == ITestResult.FAILURE){
		 test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 test.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	 }else if(result.getStatus() == ITestResult.SKIP){
		 test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	 }
	 
	 extent.endTest(test);
	 }
	 
	 @AfterTest
	 public void endReport(){
	
	  extent.flush();
	    }
	
	
}
