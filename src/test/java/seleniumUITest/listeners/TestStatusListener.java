package seleniumUITest.listeners;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import seleniumUITest.base.BaseSetUp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestStatusListener implements ITestListener {
    private static int stepCount = 1;

    public TestStatusListener() {
    }

    public void onTestFailure(ITestResult result){
        System.out.println("****TEST CASE FAILED****");
        try
        {
         failedScreenshot(result.getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void onTestFailureMethod2(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((BaseSetUp) testClass).getDriver();
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File("path/to/screenshots/" + result.getName() + "_step" + stepCount + ".png");
        stepCount++;
        try{
            FileUtils.copyFile(srcFile,destFile);
            System.out.println("Screenshot take for failed test case: " + result.getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void resetStepCount() {
        stepCount = 1;
    }


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("***********On Test Start Code go here**********");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("***********On Test Success Code go here**********");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("***********On Test Skipped Code go here**********");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("***********On Test FailedButWithInSuccessPercentage Code go here**********");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("***********On Test Failed With TimeOut Code go here**********");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("***********On  Start Code go here**********");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("***********On Finish Code go here**********");
    }

    public void failedScreenshot(String testMethodName) {
        try {
            WebDriver driver = BaseSetUp.getInstance().getDriver();
            if (driver != null) {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                Date d = new Date();
                String timestamp = d.toString().replace(":", "_").replace(" ", "_");
                FileUtils.copyFile(src, new File("Screenshots/" + testMethodName + "_" + timestamp + ".png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
