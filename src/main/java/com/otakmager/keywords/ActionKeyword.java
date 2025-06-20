package com.otakmager.keywords;

import com.otakmager.base.BaseTest;
import com.otakmager.model.ElementInfo;
import com.otakmager.utils.LogReportUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActionKeyword {
    private static final Logger logger = LogManager.getLogger(ActionKeyword.class);

    public void click(ElementInfo elementInfo) {
        String message;
        try {
            BaseTest.driver.findElement(elementInfo.locator()).click();
            message = String.format("Clicked on element: %s", elementInfo.name());
            LogReportUtil.logInfo(logger, message);
        } catch (Exception e) {
            message = String.format("Failed to click on element: %s. Error: %s", elementInfo.name(), e.getMessage());
            LogReportUtil.logFailure(logger, message);
            throw new RuntimeException("Failed to click on element: " + elementInfo.name(), e);
        }
    }

    public void sendKeys(ElementInfo elementInfo, String text) {
        String message;
        try {
            click(elementInfo);
            BaseTest.driver.findElement(elementInfo.locator()).sendKeys(text);
            message = String.format("Sent keys '%s' to element: %s", text, elementInfo.name());
            LogReportUtil.logInfo(logger, message);
        } catch (Exception e) {
            message = String.format("Failed to send keys '%s' to element: %s. Error: %s", text, elementInfo.name(), e.getMessage());
            LogReportUtil.logFailure(logger, message);
            throw new RuntimeException("Failed to send keys to element: " + elementInfo.name(), e);
        }
    }

    public void clear(ElementInfo elementInfo) {
        String message;
        try {
            click(elementInfo);
            BaseTest.driver.findElement(elementInfo.locator()).clear();
            message = String.format("Cleared text in element: %s", elementInfo.name());
            LogReportUtil.logInfo(logger, message);
        } catch (Exception e) {
            message = String.format("Failed to clear text in element: %s. Error: %s", elementInfo.name(), e.getMessage());
            LogReportUtil.logFailure(logger, message);
            throw new RuntimeException("Failed to clear text in element: " + elementInfo.name(), e);
        }
    }

    public String getText(ElementInfo elementInfo) {
        String message;
        try {
            String text = BaseTest.driver.findElement(elementInfo.locator()).getText();
            message = String.format("Retrieved text '%s' from element: %s", text, elementInfo.name());
            LogReportUtil.logInfo(logger, message);
            return text;
        } catch (Exception e) {
            message = String.format("Failed to get text from element: %s. Error: %s", elementInfo.name(), e.getMessage());
            LogReportUtil.logFailure(logger, message);
            throw new RuntimeException("Failed to get text from element: " + elementInfo.name(), e);
        }
    }
}
