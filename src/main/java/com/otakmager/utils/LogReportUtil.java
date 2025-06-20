package com.otakmager.utils;

import org.apache.logging.log4j.Logger;
import org.testng.ITestResult;

public interface LogReportUtil {

    static void logInfo(Logger logger, String message) {
        logger.info(message);
        ReportManager.reportInfo(message);
    }

    static void logFailure(Logger logger, String message) {
        logger.error(message);
        ReportManager.reportFailure(message);
    }

    static void logTestStart(Logger logger, ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        String className = result.getTestClass().getName();
        logger.info("\n\n================== START TEST: {}.{} ==================\n", className, methodName);
    }

    static void logTestEnd(Logger logger, ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        String className = result.getTestClass().getName();

        switch (result.getStatus()) {
            case ITestResult.SUCCESS -> {
                logger.info("TEST RESULT: {}.{} PASSED", className, methodName);
                ReportManager.reportPass(result.getName() + " testcase passed.");
            }
            case ITestResult.FAILURE -> {
                logger.error("TEST RESULT: {}.{} FAILED", className, methodName);
                ReportManager.reportFailure(result.getName() + " testcase failed.");
            }
            case ITestResult.SKIP -> {
                logger.warn("TEST RESULT: {}.{} SKIPPED", className, methodName);
                ReportManager.reportSkip(result.getName() + " testcase skipped.");
            }
        }

        logger.info("\n================== END TEST: {}.{} ==================\n", className, methodName);
    }
}
