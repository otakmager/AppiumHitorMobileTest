package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface HomeObject {
    ElementInfo appTitle = new ElementInfo("App Title", AppiumBy.accessibilityId("Hitor"));
    ElementInfo appDesc = new ElementInfo("App Desc", AppiumBy.androidUIAutomator("new UiSelector().description(\"Kendaraan lewat?\nKita Catat!\")"));
    ElementInfo menuPengamatan = new ElementInfo("Menu Pengamatan", AppiumBy.accessibilityId("Mulai Pengamatan"));
    ElementInfo menuRiwayat = new ElementInfo("Menu Riwayat", AppiumBy.accessibilityId("Lihat Riwayat"));
    ElementInfo menuPengaturan = new ElementInfo("Menu Pengaturan", AppiumBy.accessibilityId("Pengaturan"));
    ElementInfo menuDukungan = new ElementInfo("Menu Dukungan", AppiumBy.accessibilityId("Dukung Kami"));
}
