package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class listeners extends commonOps implements ITestListener
{
    public void onFinish(ITestContext arg0)
    {
        System.out.println("-----------------Test: " + arg0.getName() +" Ending Execution");
    }

    public void onStart(ITestContext arg0)
    {
        System.out.println("----------------Starting Execution-----------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        // TODO Auto-generated method stub
    }

    public void onTestFailure(ITestResult arg0)
    {
        System.out.println("----------------Test:" + arg0.getName()+  " Failed -----------");
        if (!platform.equalsIgnoreCase("api"))
        saveScreenShot(driver);
    }

    public void onTestSkipped(ITestResult arg0)
    {
        System.out.println("----------------Skiping Test:" + arg0.getName()+" -----------");
    }

    public void onTestStart(ITestResult arg0)
    {
        System.out.println("----------------Starting Test: " + arg0.getName()+"-----------");
    }

    public void onTestSuccess(ITestResult arg0)
    {
        System.out.println("----------------Test: " + arg0.getName()+" Success -----------");
    }

    @Attachment(value = "page screenshot", type = "image/png")
    public static byte[] saveScreenShot(WebDriver driver)
    {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
