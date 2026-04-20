package seleniumUITest.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStatusListener implements ITestListener{
    private static int stepCount = 1;


    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("**** TEST CASE FAILED ****");
        takeScreenshot(result.getName());
    }

    private void takeScreenshot(String testMethodName) {
        try {

            WebDriver driver = DriverManager.getDriver();
            if (driver != null) {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                File dest = new File("Screenshots/" + testMethodName + "_" + timestamp + ".png");
                // Ensure directory exists
                dest.getParentFile().mkdirs();
                FileUtils.copyFile(src, dest);
                System.out.println("Screenshot saved: " + dest.getAbsolutePath());
            } else {
                System.out.println("Driver was null, screenshot skipped.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void resetStepCount() {
        stepCount = 1;
    }


}
