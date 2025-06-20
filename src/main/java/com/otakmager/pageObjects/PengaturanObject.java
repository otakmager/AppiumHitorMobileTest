package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface PengaturanObject {
    ElementInfo appBarTitle = new ElementInfo("App Bar Title", AppiumBy.accessibilityId("Pengaturan"));
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo headerButtonStyle = new ElementInfo("Header Button Style", AppiumBy.accessibilityId("Bentuk Counter"));
    ElementInfo radioBtnSimpleStyle = new ElementInfo("Radio Button Simple Style", AppiumBy.accessibilityId("Simple"));
    ElementInfo radioBtnCounterStyle = new ElementInfo("Radio Button Counter Style", AppiumBy.accessibilityId("Counter"));
    ElementInfo radioBtnBigSimple = new ElementInfo("Radio Button Big Simple", AppiumBy.accessibilityId("Big Simple"));
    ElementInfo radioBtnBigCounter = new ElementInfo("Radio Button Big Counter", AppiumBy.accessibilityId("Big Counter"));
}
