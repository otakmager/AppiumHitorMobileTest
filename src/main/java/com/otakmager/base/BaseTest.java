package com.otakmager.base;

import com.otakmager.utils.DriverFactory;
import com.otakmager.utils.LogReportUtil;
import com.otakmager.utils.ReportManager;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {
    private static final Logger logger = LogManager.getLogger(BaseTest.class);
    public static AndroidDriver driver;

    @BeforeSuite
    public void setupReports() {
        ReportManager.initReports();
    }

    @BeforeMethod
    @Parameters("useApkFile")
    public void setUpTest(Method method, ITestResult result, @Optional("true") String useApkFileParam) {
        boolean useApkFile = Boolean.parseBoolean(useApkFileParam);
        String methodName = method.getName();
        String className = method.getDeclaringClass().getSimpleName();
        driver = DriverFactory.getDriver(useApkFile);
        ReportManager.createTest(methodName);
        LogReportUtil.logTestStart(logger, methodName, className);
    }

    @AfterMethod
    public void tearDownTest(ITestResult result) {
        LogReportUtil.logTestEnd(logger, result);
        DriverFactory.quitDriver();
    }

    @AfterSuite
    public void flushReports() {
        ReportManager.flushReports();
    }
}
