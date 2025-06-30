package com.otakmager.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);
    private static AndroidDriver driver;

    private static void initDriver(Boolean useApkFile) {
        logger.info("Starting AndroidDriver initialization with useApkFile: {}", useApkFile);
        try {
            URL serverUrl = new URL(ConfigReader.getProperty("appiumServerURL"));
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName(ConfigReader.getProperty("platformName"))
                    .setPlatformVersion(ConfigReader.getProperty("platformVersion"))
                    .setDeviceName(ConfigReader.getProperty("deviceName"))
                    .setAutomationName(ConfigReader.getProperty("automationName"))
                    .setNewCommandTimeout(Duration.ofSeconds(
                            Integer.parseInt(ConfigReader.getProperty("newCommandTimeout", "60")
                            )));

            if (useApkFile) {
                options.setApp(getAbsoluteAppPath());
                logger.info("Using APK file: {}", getAbsoluteAppPath());
            } else {
                options.setAppPackage(ConfigReader.getProperty("appPackage"))
                        .setAppActivity(ConfigReader.getProperty("appActivity"))
                        .setNoReset(true);
                logger.info("Using App Package: {}, App Activity: {}",
                        ConfigReader.getProperty("appPackage"),
                        ConfigReader.getProperty("appActivity"));
            }

            driver = new AndroidDriver(serverUrl, options);
            logger.info("AndroidDriver initialized successfully");
        } catch (Exception e) {
            logger.error("Failed to initialize AndroidDriver: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to initialize Driver: " + e.getMessage(), e);
        }
    }

    public static AndroidDriver getDriver(Boolean useApkFile) {
        if (driver == null) {
            initDriver(useApkFile);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            terminateRunningApp();
            driver.quit();
            driver = null;
            logger.info("AndroidDriver quit successfully");
        }
    }

    public static void terminateRunningApp() {
        if (driver == null) {
            logger.warn("Driver is null, cannot terminate app.");
            return;
        }

        String appPackage = ConfigReader.getProperty("appPackage");
        try {
            if (driver.isAppInstalled(appPackage)) {
                driver.terminateApp(appPackage);
                logger.info("Terminated app: {}", appPackage);
            } else {
                logger.info("App {} is not installed, skipping terminate.", appPackage);
            }
        } catch (Exception e) {
            logger.warn("Failed to terminate app: {}", e.getMessage());
        }
    }


    private static String getAbsoluteAppPath() {
        return System.getProperty("user.dir") + ConfigReader.getProperty("app");
    }
}
