package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReporter extends  CommonMethods{

public static String reportPath;
static ExtentReports extentReporter;
static ExtentSparkReporter sparkReporter;
static ExtentTest extentTest;

    public static void initReport(){
        String path=System.getProperty("user.dir")+"\\Reports\\";
        String fileName=new SimpleDateFormat("ddMMyyyyhmm").format(new Date());
        new File(path+"Report_"+fileName).mkdir();
        reportPath=path+"Report_"+fileName;
        extentReporter=new ExtentReports();
        sparkReporter=new ExtentSparkReporter(reportPath);
        extentReporter.attachReporter(sparkReporter);
    }

    public static void initTest(String testName){
        extentTest=extentReporter.createTest(testName);
    }

    public static void log(Status logStatus,String message) {
        switch (logStatus) {
            case FAIL:
            case PASS:
            case INFO:
            case WARNING:
            case SKIP:
                extentTest.log(logStatus, message);
        }
    }

        public static void logWithScreenShot(Status logStatus,String message){
            switch (logStatus){
                case FAIL:
                case PASS:
                case INFO:
                case WARNING:
                case SKIP:
                    extentTest.addScreenCaptureFromPath(takeScreenShot(),message);
            }
    }

    public static void endReport(){
        extentReporter.flush();
    }
}
