package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.CounterEvents;
import com.otakmager.pageEvents.HomeEvents;
import com.otakmager.pageEvents.PilihJalanEvents;
import com.otakmager.pageEvents.PilihKelompokEvents;
import org.testng.annotations.Test;

public class CounterTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    PilihJalanEvents events2 = new PilihJalanEvents();
    PilihKelompokEvents events3 = new PilihKelompokEvents();
    CounterEvents events4 = new CounterEvents();

    @Test
    public void counterScreenShouldLoadSuccessfully() {
        // home screen
        events1.verifyMenuPengamatanVisible();
        events1.clickMenuPengamatan();

        // pilih jalan screen
        events2.verifyMenuJalanRayaVisible();
        events2.clickMenuJalanRaya();

        // pilih kelompok screen
        events3.verifyMenu5TipeVisible();
        events3.clickMenu5Tipe();

        // counter screen
        events4.verifyAppBarBackButton();
        events4.verifyAppBarResetButtonVisible();
        events4.verifyAppBarFinishButtonVisible();
        events4.verifyAlertDialogReset();
        events4.verifyAlertDialogFinish();
        events4.verifyMotorCounterVisible();
    }
}
