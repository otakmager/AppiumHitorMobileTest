package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface RiwayatObject {
    ElementInfo appBarTitle = new ElementInfo("App Bar Title", AppiumBy.accessibilityId("Riwayat"));
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo noDataText = new ElementInfo("No Data Text", AppiumBy.accessibilityId("Tidak ada data"));
    ElementInfo itemData = new ElementInfo("Item Data", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Jalan\")"));
}
