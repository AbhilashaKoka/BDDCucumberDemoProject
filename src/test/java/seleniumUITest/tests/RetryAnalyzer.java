package seleniumUITest.tests;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



public class RetryAnalyzer implements IRetryAnalyzer {

    private int count = 0;
    private static final int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {

        Throwable throwable = result.getThrowable();

        // Retry only for specific exceptions
        if (throwable instanceof TimeoutException ||
                throwable instanceof StaleElementReferenceException) {

            if (count < maxRetry) {
                count++;
                System.out.println("Retrying due to: " + throwable.getClass().getSimpleName() +
                        " | Attempt: " + count);
                return true;
            }
        }

        return false; // Do not retry for other exceptions
    }
}