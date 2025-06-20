package com.otakmager.pageObjects;

import com.otakmager.model.ElementInfo;
import io.appium.java_client.AppiumBy;

public interface PilihKelompokObject {
    ElementInfo appBarTitle = new ElementInfo("App Bar Title", AppiumBy.accessibilityId("Pilih Kelompok"));
    ElementInfo appBarBackButton = new ElementInfo("App Bar Back Button", AppiumBy.accessibilityId("Back"));
    ElementInfo menu5Tipe = new ElementInfo("Menu 5 Tipe", AppiumBy.androidUIAutomator("new UiSelector().description(\"5 5 Tipe Motor, Mobil, Bus, Truk, Tidak Bermotor\")"));
    ElementInfo menu6Tipe = new ElementInfo("Menu 6 Tipe", AppiumBy.androidUIAutomator("new UiSelector().description(\"6 6 Tipe Gol 1: Sedan, Jip, Pickup atau Truk Kecil, dan Bus Gol 2: Truk 2 Gandar Gol 3: Truk 3 Gandar Gol 4: Truk 4 Gandar Gol 5: Truk 5 Gandar Gol 6: Sepeda Motor\")"));
    ElementInfo menu8Tipe = new ElementInfo("Menu 8 Tipe", AppiumBy.androidUIAutomator("new UiSelector().description(\"8 8 Tipe Motor, Sedan, Minibus, Pickup, Bus, Truk 2 Sumbu, Truk Besar, Tidak Bermotor\")"));
    ElementInfo menu12Tipe = new ElementInfo("Menu 12 Tipe", AppiumBy.androidUIAutomator("new UiSelector().description(\"12 12 Tipe Motor, Sedan, Minibus, Pickup, Bus Kecil, Bus Besar, Truk Ringan 2 Sumbu, Truk Sedang 2 Sumbu, Truk 3 Sumbu, Truk Gandeng, Truk Semi Trailer, dan Tidak Bermotor\")"));
}
