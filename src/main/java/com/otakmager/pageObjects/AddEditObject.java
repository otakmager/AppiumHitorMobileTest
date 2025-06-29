package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface AddEditObject {
    ElementInfo appBarTitleAdd = new ElementInfo("App Bar Title Add", AppiumBy.accessibilityId("Tambah Data"));
    ElementInfo appBarTitleEdit = new ElementInfo("App Bar Title Edit", AppiumBy.accessibilityId("Edit Data"));
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo appBarSaveButton = new ElementInfo("App Bar Save Button", AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
    ElementInfo resultSummary = new ElementInfo("Result Summary", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Ringkasan\")"));
    ElementInfo resultRecord = new ElementInfo("Result Summary", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Data Pengamatan\")"));
    ElementInfo optionalDataHeader = new ElementInfo("Optional Data Header", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Data Pelengkap Opsional\")"));
    ElementInfo fieldPengamat = new ElementInfo("Field Pengamat", AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"));
    ElementInfo fieldLokasi = new ElementInfo("Field Lokasi", AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"));
    ElementInfo fieldKeterangan = new ElementInfo("Field Keterangan", AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)"));
}
