package com.otakmager.base;

import com.otakmager.utils.DriverFactory;
import com.otakmager.utils.ReportManager;
import io.appium.java_client.android.AndroidDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {
    public static AndroidDriver driver;

    @BeforeSuite
    public void setupReports() {
        ReportManager.initReports();
    }

    @BeforeMethod
    public void setUpTest(Method method) {
        driver = DriverFactory.getDriver();
        ReportManager.createTest(method.getName());
        ReportManager.reportInfo("Test started: " + method.getName());
    }

    @AfterMethod
    public void tearDownTest(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            ReportManager.reportFailure(result.getName() + " testcase skipped.");
        } else if (result.getStatus() == ITestResult.SKIP) {
            ReportManager.reportSkip(result.getName() + " testcase skipped.");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            ReportManager.reportPass(result.getName() + " testcase passed.");
        }

        DriverFactory.quitDriver();
    }

    @AfterSuite
    public void flushReports() {
        ReportManager.flushReports();
    }
}
