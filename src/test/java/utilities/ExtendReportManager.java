//package utilities;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import testCases.BaseClass;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.awt.Desktop;
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//
//
//
//
//
//
//
//
//
//public class ExtendReportManager implements ITestListener{
//	 public ExtentSparkReporter sparkReporter;
//	    public ExtentReports extent;
//	    public ExtentTest test;
//	    
//	    String repName;
//
//	    public void onStart(ITestContext testContext) {
//	        // Create a unique report name using a timestamp
//	       
//	    	System.out.println("kkkkkkk");
//	    	
//	    	
//	    	
//	    	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//	    	
//	    	
//	    	 repName = "Test-Report-" + timeStamp + ".html";
//	         sparkReporter = new ExtentSparkReporter("CC:/Users/Tejaswini/eclipse-workspace/openCartProject/Test-Automation1/reports" + repName);
//	       
//	         sparkReporter.config().setDocumentTitle("opencart Automation Report"); // Title of the report
//	         sparkReporter.config().setReportName("opencart Functional Testing"); // Name of the report
//	         sparkReporter.config().setTheme(Theme.DARK);
//	      
//	        extent = new ExtentReports();
//	        extent.attachReporter(sparkReporter);
//	        extent.setSystemInfo("Application","opencart");
//	        extent.setSystemInfo("Module","Admin");
//	        extent.setSystemInfo("Sub Module","Customer");
//	        extent.setSystemInfo("user name", System.getProperty("user.name"));
//	        extent.setSystemInfo("Environment","QA");
//	        
//	        String os=testContext.getCurrentXmlTest().getParameter("os");
//	        extent.setSystemInfo("Operating System", os);
//	        
//	        String browser=testContext.getCurrentXmlTest().getParameter("browser");
//	        extent.setSystemInfo("Browser", browser);
//	        
//	        List<String> includedGroups =testContext.getCurrentXmlTest().getIncludedGroups();
//	        if(!includedGroups.isEmpty()) {
//	        	extent.setSystemInfo("Groups", includedGroups.toString());
//	        }
//	    }
//	    
//	    
//	    public void onTestSuccess(ITestResult result) {
//	    	      test = extent.createTest(result.getTestClass().getName());
//	    	      test.assignCategory(result.getMethod().getGroups()); // to display groups in report
//	    	      test.log(Status.PASS, result.getName() + " got successfully executed");
//	    	  }
//	    
//	    public void onTestFailure(ITestResult result) {
//	    	      test = extent.createTest(result.getTestClass().getName());
//	    	      test.assignCategory(result.getMethod().getGroups());
//	    	      test.log(Status.FAIL, result.getName() + " got failed");
//	    	      test.log(Status.INFO, result.getThrowable().getMessage());
//	    	      
//	    	      try {
//	    	          String imgPath = new BaseClass().captureScreen(result.getName());
//	    	          test.addScreenCaptureFromPath(imgPath);
//	    	      } catch (IOException e) {
//	    	          e.printStackTrace();
//	    	      }
//	    	  }
//	    
//	    public void onTestSkipped(ITestResult result) {
//	    	      test = extent.createTest(result.getTestClass().getName());
//	    	      test.assignCategory(result.getMethod().getGroups());
//	    	      test.log(Status.SKIP, result.getName() + " got skipped");
//	    	      test.log(Status.INFO, result.getThrowable().getMessage());
//	    	  }
//	    
//	    
//	    public void onFinish(ITestContext testContext) {
//	        // Define the report name and path
//	        String pathOfExtentReport = System.getProperty("user.dir") + "\\reports\\" + repName;
//	        File extentReport = new File(pathOfExtentReport);
//
//	        // Open the report using the default desktop application
//	        try {
//	            Desktop.getDesktop().browse(extentReport.toURI());
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//
//	        /*
//	        * Uncommented code for future use:
//	        * try {
//	        *     URL url = new URL("file:///" + System.getProperty("user.dir") + "\\reports\\" + repName);
//	        * }
//	        */
//	    }
//
//}


package utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testCases.BaseClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ExtendReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    String repName;

    public void onStart(ITestContext testContext) {
        // Create a unique report name using a timestamp
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName = "Test-Report-" + timeStamp + ".html";

        // Directory path
        String reportDir = "C:/Users/Tejaswini/eclipse-workspace/openCartProject/Test-Automation1/reports/";

        // Create directory if it doesn't exist
        File dir = new File(reportDir);
        if (!dir.exists()) {
            dir.mkdirs(); // Create the directory if it does not exist
        }

        // Full report path
        String fullReportPath = reportDir + repName;
        System.out.println("Report will be saved at: " + fullReportPath);

        try {
            sparkReporter = new ExtentSparkReporter(fullReportPath);
        } catch (Exception e) {
            System.out.println("Failed to initialize ExtentSparkReporter.");
            e.printStackTrace();
        }

        sparkReporter.config().setDocumentTitle("opencart Automation Report"); // Title of the report
        sparkReporter.config().setReportName("opencart Functional Testing"); // Name of the report
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "opencart");
        extent.setSystemInfo("Module", "Admin");
        extent.setSystemInfo("Sub Module", "Customer");
        extent.setSystemInfo("user name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "QA");

        // Get parameters from XML file
        String os = testContext.getCurrentXmlTest().getParameter("os");
        extent.setSystemInfo("Operating System", os);

        String browser = testContext.getCurrentXmlTest().getParameter("browser");
        extent.setSystemInfo("Browser", browser);

        // Include any groups defined in the XML
        List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
        if (!includedGroups.isEmpty()) {
            extent.setSystemInfo("Groups", includedGroups.toString());
        }

        System.out.println("onStart method triggered. Report setup is complete.");
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups()); // Display groups in the report
        test.log(Status.PASS, result.getName() + " got successfully executed");
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL, result.getName() + " got failed");
        test.log(Status.INFO, result.getThrowable().getMessage());

        try {
            String imgPath = new BaseClass().captureScreen(result.getName());
            test.addScreenCaptureFromPath(imgPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP, result.getName() + " got skipped");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext testContext) {
        // Path to the report
        String pathOfExtentReport = "C:/Users/Tejaswini/eclipse-workspace/openCartProject/Test-Automation1/reports/" + repName;
        File extentReport = new File(pathOfExtentReport);

        if (extentReport.exists()) {
            try {
                Desktop.getDesktop().browse(extentReport.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Report file does not exist at: " + pathOfExtentReport);
        }

        // Finalize and flush the report
        if (extent != null) {
            extent.flush();
        }
    }
}
