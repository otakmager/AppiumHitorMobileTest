package com.otakmager.testCases.screen;

import com.otakmager.base.BaseTest;
import com.otakmager.pageEvents.*;
import org.testng.annotations.Test;

public class AddDataTest extends BaseTest {
    HomeEvents events1 = new HomeEvents();
    PilihJalanEvents events2 = new PilihJalanEvents();
    PilihKelompokEvents events3 = new PilihKelompokEvents();
    CounterEvents events4 = new CounterEvents();
    AddEditEvents events5 = new AddEditEvents();

    @Test
    public void addDataScreenShouldLoadSuccessfully() {
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
        events4.verifyAppBarFinishButtonVisible();
        events4.clickFinish();

        // add screen
        events5.verifyAppBarTitleAdd();
        events5.verifyAppBarBackButtonVisible();
        events5.verifyAppBarSaveButtonVisible();
        events5.verifyRingkasanCardVisible();
        events5.verifyFormFieldVisible();
        events5.verifyDataPengamatanVisible();
    }
}
