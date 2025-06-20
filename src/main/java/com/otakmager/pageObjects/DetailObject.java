package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface DetailObject {
    ElementInfo appBarTitle = new ElementInfo("App Bar Title", AppiumBy.accessibilityId("Detail"));
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo summaryResult = new ElementInfo("Summary Result", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Ringkasan\")"));
    ElementInfo additionalInfo = new ElementInfo("Additional Info", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Informasi Tambahan\")"));
    ElementInfo summaryRecord = new ElementInfo("Summary Record", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Hasil Pengamatan\")"));
    ElementInfo totalVehicles = new ElementInfo("Total Vehicles", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Total:\")"));
    ElementInfo buttonEdit = new ElementInfo("Button Edit", AppiumBy.accessibilityId("Edit"));
    ElementInfo buttonDelete = new ElementInfo("Button Delete", AppiumBy.accessibilityId("Hapus"));
}
