package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface CounterObject {
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo appBarResetButton = new ElementInfo("App Bar Reset Button", AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
    ElementInfo appBarFinishButton = new ElementInfo("App Bar Finish Button", AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(2)"));
    ElementInfo alertDialogTitle = new ElementInfo("Alert Dialog Title", AppiumBy.accessibilityId("Apakah Anda Yakin?"));
    ElementInfo alertDialogDescReset = new ElementInfo("Alert Dialog Desc Reset", AppiumBy.accessibilityId("Tindakan ini akan menghapus data yang sudah diinput dan memulai dari awal kembali."));
    ElementInfo alertDialogDescFinish = new ElementInfo("Alert Dialog Desc Finish", AppiumBy.accessibilityId("Tindakan ini akan menghentikan proses penghitungan dan mengarahkan Anda ke halaman pengeditan sebelum data sepenuhnya disimpan."));
    ElementInfo alertDialogYesButton = new ElementInfo("Alert Dialog Yes Button", AppiumBy.accessibilityId("Ya"));
    ElementInfo alertDialogCancelButton = new ElementInfo("Alert Dialog Cancel Button", AppiumBy.accessibilityId("Batal"));

    ElementInfo counterMotor = new ElementInfo("Counter: Motor", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Motor\")"));
    ElementInfo counterMobil = new ElementInfo("Counter: Mobil", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Mobil\")"));
    ElementInfo counterBus = new ElementInfo("Counter: Bus", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Bus\")"));
    ElementInfo counterTruk = new ElementInfo("Counter: Truk", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk\")"));
    ElementInfo counterTidakBermotor = new ElementInfo("Counter: Tidak Bermotor", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Tidak Bermotor\")"));

    ElementInfo counterSedan = new ElementInfo("Counter: Sedan", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Sedan\")"));
    ElementInfo counterMinibus = new ElementInfo("Counter: Minibus", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Minibus\")"));
    ElementInfo counterPickup = new ElementInfo("Counter: Pickup", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Pickup\")"));
    ElementInfo counterTruk2Sumbu = new ElementInfo("Counter: Truk 2 Sumbu", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk 2 Sumbu\")"));
    ElementInfo counterTrukBesar = new ElementInfo("Counter: Truk Besar", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk Besar\")"));

    ElementInfo counterBusKecil = new ElementInfo("Counter: Bus Kecil", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Bus Kecil\")"));
    ElementInfo counterBusBesar = new ElementInfo("Counter: Bus Besar", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Bus Besar\")"));
    ElementInfo counterTrukRingan2Sumbu = new ElementInfo("Counter: Truk Ringan 2 Sumbu", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk Ringan 2 Sumbu\")"));
    ElementInfo counterTrukSedang2Sumbu = new ElementInfo("Counter: Truk Sedang 2 Sumbu", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk Sedang 2 Sumbu\")"));
    ElementInfo counterTruk3Sumbu = new ElementInfo("Counter: Truk 3 Sumbu", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk 3 Sumbu\")"));
    ElementInfo counterTrukGandeng = new ElementInfo("Counter: Truk Gandeng", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk Gandeng\")"));
    ElementInfo counterTrukSemiTrailer = new ElementInfo("Counter: Truk Semi Trailer", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk Semi Trailer\")"));

    ElementInfo counterGol1 = new ElementInfo("Counter: Gol 1", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Mobil\")"));
    ElementInfo counterGol2 = new ElementInfo("Counter: Gol 2", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk 2 Gandar\")"));
    ElementInfo counterGol3 = new ElementInfo("Counter: Gol 3", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk 3 Gandar\")"));
    ElementInfo counterGol4 = new ElementInfo("Counter: Gol 4", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk 4 Gandar\")"));
    ElementInfo counterGol5 = new ElementInfo("Counter: Gol 5", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Truk 5 Gandar\")"));
    ElementInfo counterGol6 = new ElementInfo("Counter: Gol 6", AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Motor\")"));
}
