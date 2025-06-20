package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface PilihJalanObject {
    ElementInfo appBarTitle = new ElementInfo("App Bar Title", AppiumBy.accessibilityId("Pilih Jenis Jalan"));
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo menuJalanRaya = new ElementInfo("Menu Jalan Raya", AppiumBy.accessibilityId("Jalan Raya"));
    ElementInfo menuJalanTol = new ElementInfo("Menu Jalan Tol", AppiumBy.accessibilityId("Jalan Tol"));
}
