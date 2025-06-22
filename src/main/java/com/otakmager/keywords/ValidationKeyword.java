package com.otakmager.keywords;

import com.otakmager.base.BaseTest;
import com.otakmager.model.ElementInfo;
import com.otakmager.utils.LogReportUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ValidationKeyword {
    private static final Logger logger = LogManager.getLogger(ValidationKeyword.class);

    public void assertContainsText(String actual, String expectedSubstring) {
        String message;
        try {
            Assert.assertTrue(actual.contains(expectedSubstring), "Validation failed: expectedSubstring '" + expectedSubstring + "' but found '" + actual + "'");
            message = "Validation passed: expectedSubstring '" + expectedSubstring + "' and found '" + actual + "'";
            LogReportUtil.logInfo(logger, message);
        } catch (AssertionError e) {
            message = "Validation failed: expectedSubstring '" + expectedSubstring + "' but found '" + actual + "'";
            LogReportUtil.logFailure(logger, message);
            throw e;
        }
    }

    public void assertTextEquals(String actual, String expected) {
        String message;
        try {
            Assert.assertEquals(actual, expected);
            message = "Validation passed: expected '" + expected + "' and found '" + actual + "'";
            LogReportUtil.logInfo(logger, message);
        } catch (AssertionError e) {
            message = "Validation failed: expected '" + expected + "' but found '" + actual + "'";
            LogReportUtil.logFailure(logger, message);
            throw e;
        }
    }

    public void assertElementVisible(ElementInfo elementInfo) {
        String elementName = elementInfo.name();
        String message;
        try {
            WebElement element = BaseTest.driver.findElement(elementInfo.locator());
            Assert.assertTrue(element.isDisplayed(), elementName + " is not visible");
            message = "Element visible: " + elementName;
            LogReportUtil.logInfo(logger, message);
        } catch (AssertionError e) {
            message = "Element NOT visible (expected visible): " + elementName;
            LogReportUtil.logFailure(logger, message);
            throw e;
        }
    }

    public void assertElementNotVisible(ElementInfo elementInfo) {
        String elementName = elementInfo.name();
        String message;
        try {
            WebElement element = BaseTest.driver.findElement(elementInfo.locator());
            Assert.assertFalse(element.isDisplayed(), elementName + " is visible");
            message = "Element NOT visible: " + elementName;
            LogReportUtil.logInfo(logger, message);
        } catch (AssertionError e) {
            message = "Element visible (expected not visible): " + elementName;
            LogReportUtil.logFailure(logger, message);
            throw e;
        }
    }
}
